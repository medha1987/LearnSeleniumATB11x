package Selenium_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Katlon_Demo_CURA_Project {

    @Test
    public void test_CURA_Flow() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
        driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.xpath("//button[@id='btn-login']")).click();


        WebElement dropdown_Facility= driver.findElement(By.xpath("//select[@id='combo_facility']"));
        Select drp_Facility=new Select(dropdown_Facility);
        Thread.sleep(3000);
        drp_Facility.selectByVisibleText("Hongkong CURA Healthcare Center");
        driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']")).click();
        driver.findElement(By.xpath("//input[@id='radio_program_none']")).click();
        driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("26/05/2025");
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("please provide appointment");
        driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();

        Assertion assertion = new Assertion();
        String msg=driver.findElement(By.xpath("//div[@class='col-xs-12 text-center']/h2")).getText();
        assertion.assertEquals(msg,"Appointment");
        System.out.println("booking confirmed");
        //driver.quit();




    }

}
