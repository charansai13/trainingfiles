import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		Homepage home = new Homepage(driver);
		home.clickLoginlink();
		loginPage login = new loginPage(driver);
		login.enterUserName("cvenkata_raman@rediffmail.com");
		login.password("satyam123$");
		login.clickLoginbutton();
		logoutpage logout = new logoutpage(driver);
		logout.clicklogout();
		driver.quit();

	}

}
