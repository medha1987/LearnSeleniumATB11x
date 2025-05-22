package Selenium_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class Ex001_static_tables {

    @Test
    public void test_static_tableDemo() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        String part1= "//table[@id='customers']/tbody/tr[";
        String part2="]/td[";
        String part3="]";


        //table[@id="customers"]/tbody/tr[2]/td[1]
        int norows= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int nocols= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[3]/td")).size();

        System.out.println(norows);
        System.out.println(nocols);
        for (int i=2;i<=norows;i++) {
            for (int j = 1; j <= nocols; j++) {
                String DynamicPath=part1+i+ part2+j+part3;
        WebElement data=driver.findElement(By.xpath(DynamicPath));
        System.out.println(data.getText());

            }
        }


    }
}