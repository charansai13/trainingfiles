import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4_14_Thread_Wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
		driver.findElement(By.id("textbox1")).sendKeys("charan");
		Thread.sleep(7000);
		driver.findElement(By.id("textbox2")).sendKeys("charan");
	}

}
