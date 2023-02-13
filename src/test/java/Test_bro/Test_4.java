package Test_bro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_4 {
	@Test
	public void verify_test_1() {
		System.out.println("enter email");
		System.out.println("password enter");
		System.out.println("login button click");
		String expected="BudSpotter";
		String actual="bugspotter";
		Assert.assertEquals(actual,expected);
		System.out.println("Test Done");
	}

}
