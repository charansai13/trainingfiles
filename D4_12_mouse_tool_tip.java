import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D4_12_mouse_tool_tip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	     driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
	     Actions action = new Actions(driver);
	     WebElement tooltipobj = driver.findElement(By.className("tooltip"));
	     action.moveToElement(tooltipobj).build().perform();
	}

}
