import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class P19_Take_a_Screenshot 
{
	static WebDriver driver;
	static int i=1;

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		TakeScreenShot();
		driver.findElement(By.linkText("Log in")).click();
		TakeScreenShot();
		driver.findElement(By.id("Email")).sendKeys("cvenkata_raman@rediffmail.com");
		TakeScreenShot();
        driver.findElement(By.id("Password")).sendKeys("satyam123$");
		TakeScreenShot();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
        TakeScreenShot();
        driver.findElement(By.linkText("Log out")).click();
        TakeScreenShot();
        driver.quit();

	}
	
	static void TakeScreenShot() throws IOException
	{
		File scrFile;
		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(scrFile, new File("E:\\TestResults\\step" + i + ".png"));
		i++;
	
	}
	
	}


