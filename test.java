import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
		
         	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				WebDriver driver;
				driver =new ChromeDriver();
		        driver.get("file:///C:/Users/IBM/Desktop/link.html");
		        WebElement login;
				login = driver.findElement(By.linkText("here"));
				login.click();
	}

}
