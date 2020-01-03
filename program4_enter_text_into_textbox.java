import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4_enter_text_into_textbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement username, password;
		username = driver.findElement(By.id("Email"));
		password = driver.findElement(By.id("password"));
		username.sendKeys("venkataraman");
		password.sendKeys("pass123$");
		driver.close();
	}
}
