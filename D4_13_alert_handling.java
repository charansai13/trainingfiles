import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4_13_alert_handling {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/selenium1.html");
		driver.findElement(By.xpath("/html/body/input")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// System.out.println("This value is printed....");

		
	}

}
