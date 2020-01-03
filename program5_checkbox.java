import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program5_checkbox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement rememberme =driver.findElement(By.id("RememberMe"));
		boolean expresult, actresult;
		expresult=false;
		actresult=rememberme.isSelected();
		if(expresult==actresult)
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("Test is failed...");
		}
	driver.close();
	}

}
