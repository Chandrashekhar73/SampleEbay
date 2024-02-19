package SampleEbay;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {


	   public File file;
	   public FileInputStream fi;
	   public Properties prop = new Properties();
	   public WebDriver driver;

	   public void setUp() throws Exception {
	      driver = new ChromeDriver();
	      driver.get("https://www.ebay.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50L));
	     
	      
	   }
	
	
}
