package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_9 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();
Actions act=new Actions(driver);
//he khalch code sorce sathi ahe 
WebElement btn_src=driver.findElement(By.xpath("//a[@class='button button-orange'][5]"));
//he khach ahe destination sathi

WebElement destn=driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
act.dragAndDrop(btn_src, destn).build().perform();

	}
}
