package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		 WebElement emailField = driver.findElement(By.id("Email"));
         emailField.clear();
         emailField.sendKeys("admin@yourstore.com");

         WebElement passwordField = driver.findElement(By.id("Password"));
         passwordField.clear();
         passwordField.sendKeys("admin");

         // Click Login button
         WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
         loginButton.click();

         // Verify login success by checking page title or URL
         String expectedUrl = "https://admin-demo.nopcommerce.com/admin/";
         if (driver.getCurrentUrl().equals(expectedUrl)) {
             System.out.println("Login successful!");
         } else {
             System.out.println("Login failed!");
         }


	}

}
