import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exception.AreaPerimeterException;
import exception.InsufficientFundsException;
package org.junit.runner.manipulation;

import org.junit.runner.Description;
import org.junit.runner.Request;
public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		TriangleTest.testArea(6);
		TriangleTest.testPerimeter(9);
		
	}

	public static void testArea(int i) {
		// TODO Auto-generated method stub
		
	}

	public static void testPerimeter(int i) {
		// TODO Auto-generated method stub
		
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testAccountFail() throws AreaPerimeterException {
		TriangleTest.side1(1);
		TriangleTest.side2(2);
		TriangleTest.side3(100);
	}

public static void side1(int i) {
		// TODO Auto-generated method stub
		
	}
private static void side2(int i) {
	// TODO Auto-generated method stub
	
}private static void side3(int i) {
	// TODO Auto-generated method stub
	
}
public void testAccountTrue() throws AreaPerimeterException {
	TriangleTest.side1(2);
	TriangleTest.side2(3);
	TriangleTest.side3(4);
}


	@Test
	public void testPerimeter() {
		AreaPerimeter t = new AreaPerimeter(2,3,4);
		 double perimeter = t.getPerimeter();
			assertEquals(9,perimeter,1);
	}
			
		
	public  void testArea(){
		AreaPerimeter t = new AreaPerimeter(3,4,5);
		double Area = t.getArea();
		assertEquals(6,Area,1);
	}

}
