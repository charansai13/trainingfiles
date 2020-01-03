import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_data_driven {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
	
		String datafile = "E:/testdata.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		br = new BufferedReader(new FileReader(datafile));
		while ((line = br.readLine()) != null) 
		{
		        	String[] data = line.split(cvsSplitBy);
		        	System.out.println(data[0] + data[1]+data[2]+data[3]);
		        	driver.get("http://demowebshop.tricentis.com");
		        	driver.findElement(By.linkText("Register")).click();
		    		driver.findElement(By.id("gender-male")).click();
		    		driver.findElement(By.name("FirstName")).sendKeys(data[0]);
		    		driver.findElement(By.name("LastName")).sendKeys(data[1]);
		    		driver.findElement(By.name("Email")).sendKeys(data[2]);
		    		driver.findElement(By.id("Password")).sendKeys(data[3]);
		    		driver.findElement(By.id("ConfirmPassword")).sendKeys(data[3]);
		}
		br.close();
		// driver.findElement(By.id("register-button")).click();
		driver.quit();


	}

}
