import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutpage
{
	WebDriver driver;
	WebElement logout;
	logoutpage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	void clicklogout()
	{
		logout = driver.findElement(By.linkText("Log out"));
		logout.click();
	}

}
