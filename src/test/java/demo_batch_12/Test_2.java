package demo_batch_12;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_2 {
	@BeforeSuite
	public void BS() {
		System.out.println("BS");
	}
	@BeforeTest
	public void BT() {
		System.out.println("BT");
	}
@BeforeClass
public void BC() {
	System.out.println("BC");
	
}
@BeforeMethod
public void BM() {
	System.out.println("BM");
	
}
@Test
public void Test_1() {
	System.out.println("Test_1");
}
@AfterMethod
public void AM() {
	System.out.println("AM");
	
}
@AfterClass
public void AC() {
	System.out.println("AC");
	
}

@AfterTest
public void AT() {
	System.out.println("AT");
}

@AfterSuite
public void AF() {
	System.out.println("AF");
}



}
