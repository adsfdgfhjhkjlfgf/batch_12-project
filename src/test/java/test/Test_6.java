package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_6 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();


//identify webelement
WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));

Select sel=new Select(drp_country);
sel.selectByIndex(2);//he serv option ahe sir ne sangitl select ch 
Thread.sleep(3000);
sel.selectByValue("ANGUILLA");
Thread.sleep(3000);
sel.selectByVisibleText("BAHRAIN");
List<WebElement>List=sel.getOptions();
System.out.println(List.size());



	}

}
