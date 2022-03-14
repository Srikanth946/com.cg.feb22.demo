package junitdemo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.*;

import junitdemo.junit;


public class JunitDemoTest {
	private static junit obj;

	@BeforeAll
	public static void setUp() {
		// initial code
		System.out.println("setUp");
		obj = new junit();
	}
	@AfterAll
	public static void tearDown() {
		// closing code
		System.out.println("tearDown");
		obj = null;
	}
	@BeforeEach
	public void runBeforeEachTestCase() {
		System.out.println("runBeforeEachTestCase");
	}
	@AfterEach
	public void runAfterEachTestCase() {
		System.out.println("runAfterEachTestCase");
	}
	@Test
	public void testAddNums() {
		System.out.println("addnums");
		int excepted=30;
		int actual=obj.addnumbers(10, 20);
		assertEquals(excepted, actual);
		
	}
	@Test
	public void testAddNums2() {
		System.out.println("addnums2");
		int unexcepted=40;
		int actual=obj.addnumbers(10, 20);
		assertNotEquals(unexcepted, actual);
		
	}
	@Test
	public void teststring() {
		System.out.println("addstring");
		String excepted= "SriRam";
		String actual=obj.addstring("Sri","Ram");
		assertEquals(excepted, actual);
		
	}
	
	@Test
	public void teststring1() {
		System.out.println("addstring2");
		String excepted= "SriRamGod";
		String actual=obj.addstring("Sri","Ram");
		assertNotEquals(excepted, actual);
		
	}

}
