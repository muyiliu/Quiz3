import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPerimeter() {
		AreaPerimeter t = new AreaPerimeter(2,3,4);
			double perimeter = t.getPerimeter();
			assertEquals(9,perimeter,1);
	}
			
		
	public void testArea(){
		AreaPerimeter t = new AreaPerimeter(3,4,5);
		double Area = t.getArea();
		assertEquals(6,Area,1);
	}

}
