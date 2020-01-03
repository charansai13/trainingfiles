import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4_program11_keyboard_event {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
		driver.findElement(By.id("textbox1")).sendKeys("my name is cherry");
		driver.findElement(By.id("textbox1")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.id("textbox1")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("textbox2")).sendKeys(Keys.CONTROL,"v");

		//String s = driver.findElement(By.id("textbox1")).getAttribute("value");
		//driver.findElement(By.id("textbox2")).sendKeys(s);
	}

}
