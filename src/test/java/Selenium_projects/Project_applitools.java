package Selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project_applitools {

    @Test
    public void test_tableSumDemo() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@123");
        driver.findElement(By.xpath("//a[@id='log-in']")).click();
        String URL =driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://demo.applitools.com/app.html");
        //Assert.assertEquals(URL,"https://demo.applitools.com");

        int norows=driver.findElements(By.xpath("//table[@class='table table-padded']/tbody/tr")).size();
        int nocols=driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr[1]/td")).size();
        System.out.println(norows);
        System.out.println(nocols);
        double Total_amount = 0;
        for (int i=1;i<=norows;i++) {

            String part1 = "//table[@class='table table-padded']/tbody/tr[";
            String part2 = "]/td[5]";
            String dynamic_path = part1 + i + part2;
            WebElement data = driver.findElement(By.xpath(dynamic_path));
            String expense = data.getText();
            //  System.out.println(expense);
            String cleaned = expense.replaceAll(",", "").replaceAll("USD", "").
                    replaceAll("\\s+", "").trim();
            System.out.println(cleaned);
            double amount = Double.parseDouble(cleaned);
            Total_amount += amount;
        }
            System.out.println("this is total expense "+Total_amount);


            //System.out.println(Total_amount);





        }

        //table[@class='table table-padded']/tbody/tr[1]/td[5]






    }
