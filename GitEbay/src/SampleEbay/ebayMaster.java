package SampleEbay;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebayMaster extends Browser {
	
public	String mainWindow;
  @Test(priority = 0)
  public void test1() {
	  System.out.println("Hello");
	  driver.findElement(By.id("gh-ac")).sendKeys("Water bottles");
	  driver.findElement(By.id("gh-btn")).click();
	  System.out.println("Search completed successfully!");
	   mainWindow= driver.getWindowHandle();
	  
	  
  }
  
 @Test
 public void test2() {
	 search();
 }
  @BeforeTest(enabled = true)
	public void beforeTest() throws Exception {
		setUp();
	}
  
  public void search() {
		 // WebDriver driver = new ChromeDriver();
		System.out.println("Entered into Search method");
	  driver.findElement(By
					.xpath("//img[@alt='16 Oz Outdoor Sports Water Bottles Stainless Steel with Straw Vacuum Insulated']"))
					.click();

	  }

}
