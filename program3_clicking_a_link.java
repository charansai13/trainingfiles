import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3_clicking_a_link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login;
		login = driver.findElement(By.linkText("Log in"));
		login.click();
		String s;
		s= driver.getTitle();
		System.out.println(s);
		driver.close();

	}

}
