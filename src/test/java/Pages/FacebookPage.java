package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjRepository.RepositoryParser;
import dataProvider.ConfigFileReader;

public class FacebookPage {


		private WebDriver driver;
		ConfigFileReader configFileReader= new ConfigFileReader();	
		RepositoryParser prop= new RepositoryParser("./ObjectRepo.properties");
		
	   	public void launchPage() {
			
		   //parser = new RepositoryParser("ObjectRepo.properties");
			System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
			driver=new ChromeDriver();
			configFileReader.getImplicitlyWait();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("");
		
	}

}
