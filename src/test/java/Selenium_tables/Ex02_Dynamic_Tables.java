package Selenium_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ex02_Dynamic_Tables {
    @Test
    public void test_static_tableDemo() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        int norows=driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr")).size();
        int nocols=driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr[1]/td")).size();
        System.out.println(norows);
        System.out.println(nocols);

        for (int i=1;i<=norows;i++)
        {
            for(int j=1;j<nocols;j++) {
                String part1="//table[@summary='Sample Table']/tbody/tr[";
                String part2="]/td[";
                String part3="]";
                String dynamic_path =part1+i+part2+j+part3;

                WebElement data=driver.findElement(By.xpath(dynamic_path));
                System.out.println(data.getText());
            }

        }

        //List<WebElement> path = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr/td"));

        //table[@summary="Sample Table"]/tbody/tr/td

    }
}
