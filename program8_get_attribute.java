import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program8_get_attribute {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
		WebElement textbox1  = driver.findElement(By.id("textbox1"));
		textbox1.sendKeys("my name is charan ");
		int total = textbox1.getAttribute("value").length();
		WebElement textbox2  = driver.findElement(By.id("textbox2"));
        String x = Integer.toString(total);
        textbox2.sendKeys(x);
	}

}
