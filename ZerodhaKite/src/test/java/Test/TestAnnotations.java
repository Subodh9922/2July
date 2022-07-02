package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	@Test	
	public void testA() {
		System.out.println("testA is executed");
		}

	@Test
	public void testB() {
		System.out.println("testB is executed");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest is executed");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("after test is executed");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("before class is executed");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after class is executed");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method is executed");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("after method is executed");
	}




}
