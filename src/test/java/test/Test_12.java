package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_12 {

	public static void main(String[] args) {
WebDriverManager.chromedriver();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/popup.php");
driver.manage().window().maximize();
String ParentWindowAdd=driver.getWindowHandle();
System.out.println(ParentWindowAdd);

	}

}
