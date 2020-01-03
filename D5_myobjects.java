import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D5_myobjects
{
	WebDriver driver;
	
	
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(linkText="Log in")
	WebElement login;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement submit;
	
	
	D5_myobjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	void clickLogin()
	{
		login.click();
	}
	void enterUsername(String s)
	{
		username.sendKeys(s);
	}

	
	void enterPassword(String s)
	{
		password.sendKeys(s);
	}
	
	void clickSubmit()
	{
		submit.click();
	}
	
}
