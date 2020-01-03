
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2_open_clicl_close {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver =new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com");
        String s;
        s= driver.getTitle();
        System.out.println(s);
        driver.quit();
	}

}
