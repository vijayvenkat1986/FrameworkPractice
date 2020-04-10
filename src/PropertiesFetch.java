import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFetch
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		File file = new File("Configuration\\Configuration.properties");
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(file);
		
		prop.load(fis);
		
		WebDriver driver = null;
		
		if(prop.getProperty("Browser").equals("Chrome"))
		{
			driver = new ChromeDriver();
			
		}
		
		driver.get(prop.getProperty("URL"));
		
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial");
		
		driver.findElement(By.name("btnK")).click();
	}

}
