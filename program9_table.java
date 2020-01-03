import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program9_table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       WebDriver driver;
     driver = new ChromeDriver();
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

//  //*[@id="textbox1"] --relative path

// Absolute path

// /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input