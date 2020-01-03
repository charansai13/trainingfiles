import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program10_set_property {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	     driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
	     System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebElement table1 = driver.findElement(By.xpath("/html/body/table"));
	    List<WebElement> rows = table1.findElements(By.tagName("tr"));
	    WebElement table2 = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
	    List<WebElement> columns = table2.findElements(By.tagName("td"));
	    System.out.println(rows.size());
	    System.out.println(columns.size());
	    
	}
	
	}


