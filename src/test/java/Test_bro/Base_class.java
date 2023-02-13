package Test_bro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	WebDriver driver;
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void BM(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("Chrome"));
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	
	else if(BrowserName.equalsIgnoreCase("Edge")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	
	@AfterMethod
	public void AM() {
		driver.close();
	}
	
	
	
	
	
	
	

}
