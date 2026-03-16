package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;
import pages.CartPage;
import pages.CheckoutPage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PurchaseTest extends BaseTest {

    @Test
    public void testPurchaseFlow(){

        setup();

        LoginPage login = new LoginPage(driver);
        login.login();

        ProductsPage products = new ProductsPage(driver);
        products.addProducts();
        products.openCart();

        CartPage cart = new CartPage(driver);
        cart.checkout();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.finishOrder();

        String message = driver.findElement(By.className("complete-header")).getText();

        assertEquals("Thank you for your order!", message);

        driver.quit();   // 👈 This closes Chrome after the test
    }
}