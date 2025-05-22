package Selenium_Basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {
        @Test
        public void test_openVWOLoginPage(){
            WebDriver Driver = new ChromeDriver() {
            };
            Driver.get("https://app.vwo.com");
            Driver.quit();


        }


    }


