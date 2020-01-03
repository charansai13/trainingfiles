import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Exercise1_Web_Table {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.get("https://html.com/tables/#Table_Code_Sample_Simple_Table");
			 WebElement table1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/article/div/div[4]"));
			 List<WebElement> rows = table1.findElements(By.tagName("tr"));
			 System.out.println(rows.size());
			  driver.quit();
	}

}
