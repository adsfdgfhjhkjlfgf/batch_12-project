package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_4 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
//webelement---xpath by attribute--- tagname[@attribute name='value ']
WebElement txt_Email= driver.findElement(By.xpath("//input[@id='email']"));
txt_Email.sendKeys("text@gmail.com");
WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
txt_password.sendKeys("//input[@id='123445]");
WebElement btn_login=driver.findElement(By.xpath("//button[contains(id='u_0_5_')]"));
btn_login.click();
	}

}
