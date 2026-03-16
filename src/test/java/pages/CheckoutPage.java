package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void finishOrder(){

        driver.findElement(By.id("first-name")).sendKeys("Pranjal");
        driver.findElement(By.id("last-name")).sendKeys("Mishra");
        driver.findElement(By.id("postal-code")).sendKeys("201206");

        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

    }

}