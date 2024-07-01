package streams;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class ZipCodeFetcher {
    public static void main(String[] args) throws IOException, InterruptedException {

       // String excelFilePath = "C:\\Users\\AjayKumarSoma-Kairos\\IdeaProjects\\ProjectBDD\\src\\test\\resources\\9 1.xlsx";
       // String excelFilePath = "C:\\Users\\AjayKumarSoma-Kairos\\IdeaProjects\\ProjectBDD\\src\\test\\resources";
        File excelFilePath=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\9 1.xlsx");

        FileInputStream fileInputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row == null) continue;

            String continent = getCellValue(row, 0);
            String country = getCellValue(row, 1);
            String state = getCellValue(row, 2);
            String city = getCellValue(row, 3);


            String searchQuery = city + ", " + state + ", " + country + " zip code";
            driver.get("https://www.google.com");

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys(searchQuery);
            searchBox.submit();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String[] xpaths = {
                    "//span[contains(text(),'Postal code') or contains(text(),'Code') ]//*",
                    "//span[contains(text(),'Zip codes')]/../..//a[contains(text(),'5') or contains(text(),'1') or contains(text(),'0') or contains(text(),'2') or contains(text(),'3')]",
                    "//span[contains(text(),'Zip codes')]/../..//div[contains(text(),'5') or contains(text(),'1') or contains(text(),'0') or contains(text(),'2') or contains(text(),'3')]",
                    "//a[contains(text(),'5') or contains(text(),'1') or contains(text(),'0') or contains(text(),'2') or contains(text(),'3')]"
            };


            for (String xpath : xpaths) {
                WebElement element = null;
                try {
                    element = driver.findElement(By.xpath(xpath));
                } catch (Exception e) {
                    // Handle exception if element not found
                  //  System.out.println("Element not found for XPath: " + xpath);
                    continue; // Move to the next XPath
                }

                try {
                    System.out.println(element+ " : Used");
                    int value = Integer.parseInt(element.getText().trim());
                    System.out.println("Integer value extracted from element: " + value);
                    Cell zipCodeCell = row.createCell(4);
                    zipCodeCell.setCellValue(value);
                    break;
                } catch (NumberFormatException e) {

                    System.out.println("Element text is not an integer: " + element.getText());
                    Cell zipCodeCell = row.createCell(4);
                    zipCodeCell.setCellValue("Not Found");
                }

                // Write the zip code back to the Excel file in the same row

            }

        }

        // Close the browser
        driver.quit();

        // Save the updated Excel file
        FileOutputStream fileOutputStream = new FileOutputStream(excelFilePath);
        workbook.write(fileOutputStream);
        workbook.close();
        fileInputStream.close();
        fileOutputStream.close();
    }

    private static String getCellValue(Row row, int cellNum) {
        Cell cell = row.getCell(cellNum);
        return cell != null ? cell.getStringCellValue() : "";
    }

    private static String extractZipCode(String pageSource) {

        int index = pageSource.indexOf("ZIP: ");
        System.out.println(index + " number before");
        if (index != -1) {
            System.out.println(index+ " number after");
            return pageSource.substring(index + 5, index + 10);
        }
        return "Not Found";
    }
}