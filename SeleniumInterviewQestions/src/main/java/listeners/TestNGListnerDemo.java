package listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListner.class)

public class TestNGListnerDemo {
	
	@Test
	public void test1()
	{
		System.out.println("i am inside test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("i am inside test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("i am inside test 3");
		throw new SkipException("skipped ");
	}

}
