import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		WebElement register=driver.findElement(By.linkText("Register"));
		register.click();
		List<WebElement> gender = driver.findElements(By.name("Gender"));
		gender.get(1).click();
		gender.get(0).click();
		WebElement firstname, lastname,email,password, confirmpassword;
		firstname = driver.findElement(By.id("FirstName"));
		lastname = driver.findElement(By.id("LastName"));
		email = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input"));
		password = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input"));
		confirmpassword = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input"));
		firstname.sendKeys("Sai Charan Reddy");
		lastname.sendKeys("Binigeri");
		email.sendKeys("sravssai@gmail.com");
		password.sendKeys("15701A1223");
		confirmpassword.sendKeys("15701A1223");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		WebElement logout = driver.findElement(By.linkText("Log out"));
        logout.click();
        driver.quit();
        

	}

}
