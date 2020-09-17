package interviewQandA;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAandHasse {
	SoftAssert sa = new SoftAssert();
	
	@Test
	
	
	public void test1()
	
	{
		System.out.println("First test");
		//Assert.assertEquals(true, true);
		sa.assertEquals(true, false);
		
	
		System.out.println("Second test");
		System.out.println("third test");
		
		sa.assertAll();
		
		
	}

}
