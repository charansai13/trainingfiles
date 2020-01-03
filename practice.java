import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	     driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
	    driver.findElement(By.id("textbox1")).sendKeys("charan");
	     String s;
	     //s = driver.findElementBy.xpath("//*[contains(text(),'Dec']")).getTEXT();
	     // getting the text 
	     s=driver.findElement(By.xpath("/html/body/div")).getText();
	     System.out.println(s);
	     
	}
}
