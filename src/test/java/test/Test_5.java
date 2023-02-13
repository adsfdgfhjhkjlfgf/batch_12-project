package test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Test_5 {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
WebElement txt_Searchbar=driver.findElement(By.xpath("//input[@name='q']"));
txt_Searchbar.sendKeys("maven");
Thread.sleep(3000);
List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
System.out.println(list.size());

list.get(4).click();

	}

}
