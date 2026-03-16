package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public void addProducts(){

        driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();

    }

    public void openCart(){

        driver.findElement(By.className("shopping_cart_link")).click();

    }

}