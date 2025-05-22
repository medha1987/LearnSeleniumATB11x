package JavaScript_Executor;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_JS_Demo {
    @Test
    @Description
    public void test_js(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        WebElement Divtoscroll= driver.findElement(By.xpath("//div[@id='userName']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement Div_to_scroll= driver.findElement(By.xpath("//div[@id='userName']"));
 //       js.executeScript("alert(1)");
//        js.executeScript("document.title");
        js.executeScript("arguments[0].scrollIntoView(true);",Div_to_scroll);
        WebElement inputpizza=(WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        inputpizza.sendKeys("farmhouse");
    }
}
