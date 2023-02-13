package demo_batch_12;

import org.testng.annotations.Test;

public class Test_5 {
@Test(groups="Sanity")
public void Test_A() {
	System.out.println("A");
}
@Test(groups="Critical Regression")
public void Test_B() {
	System.out.println("B");
}
@Test(groups="Regression")
public void Test_C() {
	System.out.println("C");
}
@Test(groups="Regression")
public void Test_D() {
	System.out.println("D");
}
	
	
	
	
	
	
	
	

}
