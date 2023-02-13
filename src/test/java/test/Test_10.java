package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_10 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
	WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
	WebElement btn_login=driver.findElement(By.xpath("//button[contains(id='u_0_5_')]"));
	txt_email.sendKeys("test@gmail.com");
	txt_password.sendKeys("123445");
	btn_login.click();
	String path="C:\\Users\\lenovo\\eclipse-workspace\\batch_12_project\\screenshot";
	String rm=RandomString.make(3);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
File distn=new	File(path+"\\test.png");
FileUtils.copyFile(src, distn);
	}

	
	}


