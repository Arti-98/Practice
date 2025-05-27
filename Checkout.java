package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

	            // Go to public store
	            driver.get("https://demo.nopcommerce.com/");

	            // Click on a product
	            driver.findElement(By.linkText("Build your own computer")).click();

	            // Add to cart
	            driver.findElement(By.id("add-to-cart-button-1")).click();

	            // Click shopping cart
	            driver.findElement(By.className("cart-label")).click();

	            // Agree to terms of service
	            driver.findElement(By.id("termsofservice")).click();

	            // Click checkout
	            driver.findElement(By.id("checkout")).click();

	            // Choose checkout as guest
	            driver.findElement(By.className("checkout-as-guest-button")).click();

	            // Fill billing address
	            driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("John");
	            driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Doe");
	            driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("john.doe@example.com");
	            driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("United States");
	            driver.findElement(By.id("BillingNewAddress_City")).sendKeys("New York");
	            driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("123 Street");
	            driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("10001");
	            driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");

	            driver.findElement(By.cssSelector("button[name='save']")).click();

	            // Shipping method
	            driver.findElement(By.cssSelector("button[name='save']")).click();

	            // Payment method
	            driver.findElement(By.cssSelector("button[name='save']")).click();

	            // Payment info (no actual payment needed for demo)
	            driver.findElement(By.cssSelector("button[name='save']")).click();

	            // Confirm order
	            driver.findElement(By.cssSelector("button.confirm-order-next-step-button")).click();

	            boolean orderSuccess = driver.getPageSource().contains("Your order has been successfully processed!");

	            if (orderSuccess) {
	                System.out.println("Checkout completed successfully!");
	            } else {
	                System.out.println("Checkout failed.");
	            }

	}

}
