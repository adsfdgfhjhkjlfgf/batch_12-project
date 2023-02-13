package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_8 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/simple_context_menu.html\r\n"
		);
driver.manage().window().maximize();
//action class method
WebElement drp_selenium=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
Actions act= new Actions(driver);

	}

}
