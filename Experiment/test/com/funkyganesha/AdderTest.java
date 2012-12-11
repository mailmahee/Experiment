package com.funkyganesha;

import static org.junit.Assert.assertEquals;
import java.util.*;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdderTest {
	private Adder adder;

	@BeforeClass
	public static void onceBeforeAllTestsAreRun() {
		System.out.println("Before class");
	}

	@AfterClass
	public static void onceAfteeAllTestsAreRun() {
		System.out.println("After class");
	}

	@Before
	public void beforeEachTest() {
		adder = new Adder();
		System.out.println("Before each test");
	}

	@After
	public void afterEachTest() {
		System.out.println("After each test");
	}

	@Test
	public void testAdd() {
		int a = -1;
		int b = 10;
		int result = adder.add(a, b);
		assertEquals("Invalid result", 9, result);
	}

	@Test
	public void testdivide() {
		int a = 8;
		int b = 4;
		double result = adder.divide(a, b);
		assertEquals("invalid result for division", 2, result, 0.0);
	}

	@Test
	public void testDivideWithZeroDenominator() {
		Printer mock = EasyMock.createMock(Printer.class);
		EasyMock.expect(mock.print()).andReturn(0);
		EasyMock.replay(mock);
		int a = 9;
		int b = 0;
		assertEquals("Invalid result", -9999, adder.divide(a, b), 0.0);
		

	}
	
	@Test
	public void testprintlist(){
		final ArrayList<Integer> list = new ArrayList<Integer>(5);
        Collections.addAll(list, 1, 2, 3, 4, 5);
        adder.printlist(list);
	}

}
