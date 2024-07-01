package streams;


import io.cucumber.java.it.Ma;
import org.apache.commons.math3.exception.MathIllegalNumberException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.PseudoType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class AjayProgram {

    /*public static void main(String[] args) {
    //print and count the a char from the String
        String str="ajay soma";
        int count=0;
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            if (ch=='a'){
                count++;
                System.out.println(ch);
            }
        }
        System.out.println(count);
    }*/


 /*   public static void main(String[] args) {
        //check String is reverse or palindrom String
        String str="madam";
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            rev=rev+ch;
        }
        System.out.println(rev);
        if(rev.equals(str)){
            System.out.println("=>this string is palindrom");
        }
        else {
            System.out.println("=>this String is not a palindrom");
        }
    }*/
 /*public static void main(String[] args) {
  // remove Duplicate String
  String strt = "soma ajay kumar ajay";
  String[] str = strt.split(" ");
  for (int i = 0; i < str.length; i++) {
   for (int j = i + 1; j < str.length; j++) {
    if (str[i].equals(str[j])) {
     str[i] = " ";
    }
   }
  }
  for (String st : str) {
   System.out.println(st);
  }
 }
}
  */


  /*  public static void main(String[] args) {
        //  Program to print the two char of word from String
        String text = "I am a java developer";
        StringBuilder temp = new StringBuilder();
        // Split the string into words using a space delimiter
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() >= 2) {
                temp.append(word).append(" ");
                System.out.println(word);
            }
        }
        System.out.println(temp);
    }*/

    //Program to Print the Maximum and minimum number of an array:
    //I have done a short of array and printed first and last number
   /* public static void main(String[] args) {
        int[] ar = {11, 3, 90, 717, 211, 211, 34, 48, 144, 156};
        for (int i = 0; i < ar.length; i++) {
            int temp;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for (int b = 0; b < ar.length; b++) {
            System.out.println(ar[b]);
        }
        System.out.println("first min  "+ar[ar.length - ar.length]);
        System.out.println("first max "+ar[ar.length - 1]);
        System.out.println("sec min  "+ar[1]);
        System.out.println("sec max  "+ar[ar.length - 2]);
    }*/


/*    public static void main(String[] args) {
        String text = "India is great Country";
        String[] str=text.split(" ");
        for (int i=0;i<str.length;i++ ){
            String temp;
            for (int j=i+1;j<str.length;j++){
                if (str[i].length()>str[j].length()){
                    temp=str[j];
                    str[j]=str[i];
                    str[i]=temp;
                }
            }
        }
        for (String s:str){
            System.out.print(s+" ");
        }
    }*/

   /* public static void main(String[] args) {
        //split even and odd from 1 to num and store in the collection
        Scanner s = new Scanner(System.in);
        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        System.out.println("even : " + even);
        System.out.println("odd : " + odd);
    }*/
  /* public static void main(String[] args) {
       //sum of 1 to nth  number
       Scanner s=new Scanner(System.in);
       int num=s.nextInt();
       int sum =0;
       for(int i=1;i<num;i++){
           sum=sum+i;
       }
       System.out.println(sum);
   }*/

   /* public static void main(String[] args) {
        //product 0f 1 to nth number
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int pro =1;
        for (int i=1;i<num;i++){
            pro=pro*i;
        }
        System.out.println(pro);
    }*/

    /*public static void main(String[] args) {
        //factorial program
        int num=5;
        int fct=1;
        for(int i=num;i>0;i--){
            fct=fct*i;
            System.out.println(i);
        }
    System.out.println(fct);
    }*/

   /* public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int count=0;
        for (int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(num+" prime");
        }
       else{
            System.out.println(num+" not a prime");
        }
    }*/

  /*  public static void main(String[] args) {
        //prime number from 1 to nth number;
        int num = 100;
        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }*/

   /* public static void main(String[] args) {
        //swap with 3 varaibles
          int a=1;int b=2;int c=a;
       a=b;
       b=c;
       c=a;
        System.out.println(a+"="+b);
        System.out.println();
        System.out.println();System.out.println();
    }*/

    /*public static void main(String[] args) {
        int a=10;int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }*/

   /* public static void main(String[] args) {
        //reverse of number
        int num=123;
        int rem;int rev=0;
        while (num>0){
            rem=num%10;
            num=num/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);

    }*/



    //program to count the each character of a string text
    public static void main(String[] args) {
        Set<Character> store=new LinkedHashSet<>() ;
        String text="utyrdfxccf";
        char[] ch= text.toCharArray();
        int count=0;
        for(char c:ch){
            count++;
            store.add(c);
            System.out.print(c+",");
        }
        System.out.println(": "+count);
        System.out.println(store+" : "+store.size());
        }




  //WebDriver driver=new ChromeDriver();

//  WebDriverWait wait=new WebDriverWait(Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement()))
//
/*
  FluentWait<WebDriver> wait = new FluentWait<>(driver)
          .withTimeout(Duration.ofSeconds(30))  // Maximum time to wait
          .pollingEvery(Duration.ofSeconds(5))  // Frequency to check the condition
          .ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(By.cssSelector()));
*/

}