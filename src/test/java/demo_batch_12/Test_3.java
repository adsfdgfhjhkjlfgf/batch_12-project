package demo_batch_12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 extends Best_Test {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		//browser opening
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void Test_1() {
		System.out.println("Test_1");
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}

}
