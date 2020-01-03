import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://examples.codecharge.com/Store/Default.php");

		String s;
		s = driver.getTitle();
		System.out.println(s);
		Select datab = new Select(driver.findElement(By.name("category_id")));
		int total = datab.getOptions().size();
		System.out.println(total);
		driver.quit();

	}

}
