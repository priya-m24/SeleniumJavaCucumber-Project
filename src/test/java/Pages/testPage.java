package Pages;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjRepository.RepositoryParser;

import dataProvider.ConfigFileReader;


public class testPage {
	
	private WebDriver driver;
	ConfigFileReader configFileReader= new ConfigFileReader();	
	RepositoryParser prop= new RepositoryParser("./ObjectRepo.properties");
	
   	public void launch_Testlink() {
		
		 //parser = new RepositoryParser("ObjectRepo.properties");
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		driver=new ChromeDriver();
		configFileReader.getImplicitlyWait();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get ("https://payment-t0.ete.cathaypacific.com/test/touchpoint/review");
	}
	
	public void refresh_testPage() throws Exception {
		WebDriverWait wait = new WebDriverWait (driver, 100);
		driver.findElement(prop.getLocator("RefreshButton")).click();
		driver.findElement(prop.getLocator("SubmitButton")).click();
		
		Thread.sleep(3000);
	
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accept-recommended-btn-handler")));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("accept-recommended-btn-handler")));
//		driver.findElement(By.id("accept-recommended-btn-handler")).click();
		
	}
	
	public void select_payMethod(String Visa) throws InterruptedException, IOException {
		
		
		WebDriverWait wait = new WebDriverWait (driver, 100);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement ele;
		driver.findElement(By.xpath("//*[@id=\"summary-align-target\"]/div[1]/div/a[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"new-payment-method-container\"]/div[2]/div/span[1]/a/img")).click();
		
		Thread.sleep(3000);
		
		
		jse.executeScript("window.scrollBy(0,450)");
		
		driver.findElement(By.xpath(".//input[@aria-describedby='This is the Card Number field']")).click();
		
				
		driver.findElement(By.xpath(".//input[@aria-describedby='This is the Card Number field']")).sendKeys(Visa);
		
	
		
		driver.findElement(By.xpath(".//input[@aria-label='Name of cardholder']")).click();
		
		driver.findElement(By.xpath(".//input[@aria-label='Name of cardholder']")).sendKeys("Test");
		
	    Select expMonth = new Select(driver.findElement(By.xpath(".//select[@aria-label='Enter the expiry month in the format of MM']")));
		expMonth.selectByVisibleText("03");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//select[@aria-label='Enter the expiry year in the format of YY']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"expiryYear\"]/option[12]")).click();

		
		driver.findElement(By.xpath(".//input[@aria-describedby='This is the Security code field']")).click();
		driver.findElement(By.xpath(".//input[@aria-describedby='This is the Security code field']")).sendKeys("737");
	
        driver.findElement(By.xpath(".//button[@class='cpp-button pay-now-theme']")).click();
   
        Thread.sleep(3000);
         
	}
   
	public void securePage_3d() throws InterruptedException {
		
		driver.findElement(By.xpath(".//input[@name='username']")).click();
		driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("user");
	
		
		driver.findElement(By.xpath(".//input[@name='password']")).click();
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("password");
	
		
		driver.findElement(By.xpath(".//input[@type='submit']")).click();
	}
	
	public void confirmPage() throws InterruptedException {
		
		Thread.sleep(3000);
		
		 String[] labelElement = driver.findElement(By.xpath("/html/body/pre")).getText().split(",");

	        String result = null;
	        String merchant_reference = null;
	        String psp_reference = null;
	        String auth_amount = null;
	        String auth_currency = null;
	        
	    			for (String str : labelElement) {
	    				if (str.contains("merchant_reference")) {
	    					merchant_reference = str.split(":")[1];
	    					System.out.println(merchant_reference);	    					
	    				}
	    			}
	    			
	    			for (String str : labelElement) {
	    				if (str.contains("result")) {
	    					result = str.split(":")[1];
	    					System.out.println(result);	    					
	    				}
	    			}
	    			
	    			for (String str : labelElement) {
	    				if (str.contains("psp_reference")) {
	    					psp_reference = str.split(":")[1];
	    					System.out.println(psp_reference);	    					
	    				}
	    			}
	    			
	    			for (String str : labelElement) {
	    				if (str.contains("auth_amount")) {
	    					auth_amount = str.split(":")[1];
	    					System.out.println(auth_amount);	    					
	    				}
	    			}
	    			
	    			for (String str : labelElement) {
	    				if (str.contains("auth_currency")) {
	    					auth_currency = str.split(":")[1];
	    					System.out.println(auth_currency);	    					
	    				}
	    			}
	}
}