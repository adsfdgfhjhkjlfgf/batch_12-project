package Test_bro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_6 {
	@Test
	public void verifytest_001() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.ScrollBy(0,500)," );
	Thread.sleep(5000);
	js.executeScript("window.ScrollBy(0,500),"  );
	Thread.sleep(5000);
	WebElement english=driver.findElement(By.xpath("//li[text()='English (UK)']"));
	js.executeScript("arguments[0].ScrollInto view (),english);");
	Custom_ScrollByElement(driver,english);
	
}

	
	}
