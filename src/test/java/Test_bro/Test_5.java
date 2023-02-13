package Test_bro;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_5 {
	@Test
	public void Test_3() {
	SoftAssert soft=new SoftAssert();
	System.out.println("email enter");
	System.out.println("password enter");
	System.out.println("login button click");
	String expected="BugSpotter";
	String actual="bugspotter";
	soft.assertEquals(actual, expected);
	System.out.println("Test Done");
	soft.assertAll();
	}

}
