package streams;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZipCodeFetcher {
    public static void main(String[] args) throws IOException {
        // Path to your Excel file
        String excelFilePath = "/path/to/your/excel/file.xlsx";

        // Load the Excel file
        FileInputStream fileInputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Set up Selenium WebDriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Loop through each row in the Excel sheet
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row == null) continue;

            String continent = getCellValue(row, 0);
            String country = getCellValue(row, 1);
            String state = getCellValue(row, 2);
            String city = getCellValue(row, 3);

            // Perform Google search to get the zip code
            String searchQuery = city + ", " + state + ", " + country + " zip code";
            driver.get("https://www.google.com");

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys(searchQuery);
            searchBox.submit();

            // Wait for results to load and fetch the zip code
            try {
                Thread.sleep(2000); // Wait for 2 seconds for the results to load
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Scrape the zip code from Google search results
            String pageSource = driver.getPageSource();
            String zipCode = extractZipCode(pageSource);

            // Write the zip code back to the Excel file in the same row
            Cell zipCodeCell = row.createCell(4);
            zipCodeCell.setCellValue(zipCode);
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
        // Implement your logic to extract the zip code from the page source
        // This can be a regex or other string manipulation techniques
        // For example purposes, let's assume we have the zip code in the page source as "ZIP: XXXXX"
        int index = pageSource.indexOf("ZIP: ");
        if (index != -1) {
            return pageSource.substring(index + 5, index + 10);
        }
        return "Not Found";
    }
}
