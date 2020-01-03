

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day3_Exercise3_computer_accessories {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement a, c;
		a = driver.findElement(By.linkText("COMPUTERS"));
		a.click();
		c = driver.findElement(By.linkText("Accessories"));
		c.click();
		driver.quit();

		

	}

}
