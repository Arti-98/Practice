package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wishlist {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        
        driver.get("https://admin-demo.nopcommerce.com/admin/");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Step 2: Navigate to Customers > Customers
        driver.findElement(By.xpath("//p[text()='Customers']")).click();
        driver.findElement(By.xpath("//p[text()='Customers' and @class='nav-link']")).click();

        // Step 3: Click Edit on first customer
        WebElement editButton = driver.findElement(By.xpath("(//a[contains(@href,'/Admin/Customer/Edit')])[1]"));
        editButton.click();

        // Step 4: Open Wishlist tab
        driver.findElement(By.xpath("//a[@href='#customer-wishlist']")).click();

        // Step 5: Get wishlist product name
        WebElement wishlistItem = driver.findElement(By.xpath("(//table[@id='customer-wishlist-grid']//tbody/tr/td[3])[1]"));
        System.out.println("Wishlist Item: " + wishlistItem.getText());
	}

}
