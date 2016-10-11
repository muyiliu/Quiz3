import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exception.AreaPerimeterException;

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
	@Test(expected = AreaPerimeterException.class)
	public void testAreaPerimeterFail() throws AreaPerimeterException {
		AreaPerimeter Triangle = new AreaPerimeter (1,2,100);
		Triangle.getArea();
	}
	
	
	@Test(expected =AreaPerimeterException.class)
	public void testAreaPerimeterTrue() throws AreaPerimeterException {
		AreaPerimeter Triangle = new AreaPerimeter(2,3,4);
		Triangle.getArea();
}


	@Test
	public void testgetPerimeter() {
		AreaPerimeter t = new AreaPerimeter(2,3,4);
		 double perimeter = t.getPerimeter();
			assertEquals(9,perimeter,1);
	}
			
	@Test
	public  void testgetArea(){
		AreaPerimeter t = new AreaPerimeter(3,4,5);
		double Area = t.getArea();
		assertEquals(6,Area,1);
	}

}
