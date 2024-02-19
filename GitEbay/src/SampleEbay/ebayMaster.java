package SampleEbay;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebayMaster extends Browser {
  @Test
  public void test1() {
	  System.out.println("Hello");
	  driver.findElement(By.id("gh-ac")).sendKeys("Water bottles");
	  driver.findElement(By.id("gh-btn")).click();
	  System.out.println("Search completed successfully!");
  }
  
  @BeforeTest(enabled = true)
	public void beforeTest() throws Exception {
		setUp();
	}
}
