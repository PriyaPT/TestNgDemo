package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
public static	WebDriver driver = null;
public By email = new By.ByXPath(".//*[@id='email']");
public By pwd = new By.ByXPath(".//*[@id='pass']");
	
  @Test(priority = 0)
  public void f() throws Exception {
	  
	  System.out.println("I am in Test 1");
	  String title = "FaceBo";
	  String Chinti = System.getProperty("Chinti");
		 System.out.println(Chinti);
	 Assert.assertEquals(driver.getTitle(),  title);
	
	//throw new Exception();
  }
  
  @Test(priority=1)
  public void f2() {
	  
	  System.out.println("I am in Test 2");
	  driver.findElement(email).sendKeys("vyawaharepriya@gmail.com");
	  driver.findElement(pwd).sendKeys("ruby491989");
	  
	  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("I am in before test");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println(" I am in after Test");
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  System.out.println(" I am in before suit");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println(" i am in after suit");
  }

  public static  WebDriver getDriver() {

	  return(driver);
  }
  
  
}
