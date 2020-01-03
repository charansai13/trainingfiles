
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise4 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://examples.codecharge.com/Store/Default.php");
		
		String s;
		
		s = driver.getTitle();
		System.out.println(s);
		
		Select datab = new Select(driver.findElement(By.name("category_id")));
		datab.selectByVisibleText("Databases");

		driver.findElement(By.name("DoSearch")).click();

		driver.findElement(By.linkText("Web Database Development")).click();
		WebElement qty = driver.findElement(By.name("quantity"));
		String store = qty.getAttribute("Value");
		System.out.println(store);
		driver.quit();

	}

}

