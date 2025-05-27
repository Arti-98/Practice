package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

     // Step 1: Login
        driver.get("https://admin-demo.nopcommerce.com/admin/");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Step 2: Navigate to Sales > Orders
        driver.findElement(By.xpath("//p[text()='Sales']")).click();
        driver.findElement(By.xpath("//p[text()='Orders']")).click();
        // Step 3: Print first order number and customer name
        WebElement orderNumber = driver.findElement(By.xpath("(//table[@id='orders-grid']//tbody/tr/td[2])[1]"));
        WebElement customerName = driver.findElement(By.xpath("(//table[@id='orders-grid']//tbody/tr/td[3])[1]"));

        System.out.println("Order Number: " + orderNumber.getText());
        System.out.println("Customer Name: " + customerName.getText());

	}

}
