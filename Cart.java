package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/");
		 
		 //Click on product
		 WebElement product = driver.findElement(By.linkText("Build your own computer"));
         product.click();

         // Click on "Add to cart" button
         WebElement addToCart = driver.findElement(By.id("add-to-cart-button-1"));
         addToCart.click();

         // Click on "Shopping cart" link
         WebElement shoppingCartLink = driver.findElement(By.className("cart-label"));
         shoppingCartLink.click();

         // Verify product is in cart
         boolean productInCart = driver.getPageSource().contains("Build your own computer");

         if (productInCart) {
             System.out.println("Product successfully added to cart.");
         } else {
             System.out.println("Product not found in cart.");
         }

	}

}
