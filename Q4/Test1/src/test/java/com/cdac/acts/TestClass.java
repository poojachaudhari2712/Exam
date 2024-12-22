package com.cdac.acts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	@BeforeTest
    public void profileSetup()
    {	
		 driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/javascript-countdown-test.html");
        driver.manage().window().maximize();
        
        
    }
	@Test
    public void verifyTimer() throws InterruptedException
    {
		driver.get("https://testpages.herokuapp.com/styled/javascript-countdown-test.html");
		Thread.sleep(2500);
		WebElement input = driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/input"));
		WebElement button = driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/button"));
		input.clear();
		input.sendKeys("10");
		button.click();
		Thread.sleep(10000);
		WebElement countDownText = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/p"));
		if(countDownText.getText().equals("Time Up!")){
			System.out.println("Success");
		}
		else {
			System.out.println("fail");	
		}
		
		
    }
	 @AfterTest
	    public void tearDown() {
	       
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
