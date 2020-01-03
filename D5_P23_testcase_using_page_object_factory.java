import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D5_P23_testcase_using_page_object_factory {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		D5_myobjects obj = new D5_myobjects(driver);
		obj.clickLogin();
		obj.enterUsername("cvenkata_raman@rediffmail.com");
		obj.enterPassword("satyam123$");
		obj.clickSubmit();
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
		
	}

}
