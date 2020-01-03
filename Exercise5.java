import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise5 {

	public static void main(String[] args) 
	{			
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		String s;
		s = driver.getTitle();
		System.out.println(s);
		driver.findElement(By.name("user_login")).sendKeys("charan2326");
		driver.findElement(By.name("user_password")).sendKeys("charan2326");
		driver.findElement(By.name("first_name")).sendKeys("SAI CHARAN REDDY");
		driver.findElement(By.name("last_name")).sendKeys("BINIGERI");
		driver.findElement(By.name("email")).sendKeys("charanforevers@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("123/124");
		driver.findElement(By.name("address2")).sendKeys("WOODSTOCK");
		driver.findElement(By.name("address3")).sendKeys("singasandra");
		driver.findElement(By.name("city")).sendKeys("BENGALURU");
		Select state = new Select (driver.findElement(By.name("state_id")));
		state.selectByVisibleText("Texas");
		driver.findElement(By.name("zip")).sendKeys("56010");
		Select country = new Select (driver.findElement(By.name("country_id")));
		country.selectByVisibleText("India");
		driver.findElement(By.name("phone_home")).sendKeys("9502362012");
		driver.findElement(By.name("phone_work")).sendKeys("7036452213");
		Select language = new Select (driver.findElement(By.name("language_id")));
		language.selectByVisibleText("English");
		Select age = new Select (driver.findElement(By.name("age_id")));
		age.selectByVisibleText("18-24");
		Select gender = new Select (driver.findElement(By.name("gender_id")));
		gender.selectByVisibleText("Male");
		Select education = new Select (driver.findElement(By.name("education_id")));
		education.selectByVisibleText("Graduate School");
		Select income = new Select (driver.findElement(By.name("income_id")));
		income.selectByVisibleText("$25,000 - $34,000");
		driver.findElement(By.name("note")).sendKeys("Registration Complete");
		driver.findElement(By.name("Insert")).click();
		 driver.quit();

	}

}
