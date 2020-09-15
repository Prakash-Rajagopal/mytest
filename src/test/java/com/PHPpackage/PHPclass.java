package com.PHPpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;



public class PHPclass {
Webdriver driver;
ChromeOptions options;

@BeforeMethod
	public void beforeMethod() {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "chromedriver");  
	   
	    //for headless mode
	    //ChromeOptions options = new ChromeOptions();  
	    //options.addArguments("window-size=1400,600");
	    //options.addArguments("--headless");
	    //options.addArguments("--no-sandbox");
	    //WebDriver driver=new ChromeDriver(options);
	    //options.addArguments("--headless");  
	    
	    //new cromedriver instance
	     driver=new ChromeDriver();
	    
	    //launch PHP website
	    driver.get("http://18.223.120.255:8090/index.php");
	    }
	@Test
   public void About() {
	 // Click on the search text box and send value  
	    System.out.println("Site Title is: " + driver.getTitle());
	    driver.findElement(By.linkText("About Us")).click();
	    
	    System.out.println("About US Content: " + driver.getPageSource());
	    System.out.println("Test Successful");
      }
      
  @AfterMethod
   public void afterMethod() {
	    driver.close();
	    driver.quit();  
	    Runtime.getRuntime().exit(0);
	}
	

}
