package test;

import java.io.StringWriter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_2 {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
String title= driver.getTitle();
System.out.println(title);  //facebok login and sign up 

String url= driver.getCurrentUrl();
System.out.println(url);

driver.navigate().to("https://mvnrepository.com/");
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().refresh();

	}

}
