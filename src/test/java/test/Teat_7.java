package test;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Teat_7 {

	public static void main(String[] args) {
WebDriverManager.chromedriver();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();
WebElement drp_selenium=driver.findElement(By.xpath("//a[@data-toggle=\"'dropdown']"));
Action action=new Action();


	}

}
