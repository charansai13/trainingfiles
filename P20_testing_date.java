import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P20_testing_date {

	public static void main(String[] args)
	{
		Date d = new Date();
		SimpleDateFormat format  = new SimpleDateFormat("MMM dd,yyyy");
		String expDate = format.format(d);
		System.out.println(expDate);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
		WebElement mydate = driver.findElement(By.xpath("/html/body/div[1]"));
		String actDate = mydate.getText();
		System.out.println(actDate);
		if(expDate.equals(actDate))
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is fail");
		}
		driver.quit();
	}

}
