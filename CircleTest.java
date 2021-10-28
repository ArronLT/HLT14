package Examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testDraw() {
		Circle test = new Circle(2);
		double result = test.draw();
		assertEquals(12.56,result, 0.1);
	}
	
	@Test
	public void testDraw2() {
		Circle test = new Circle(4.0);
		double result = test.draw();
		assertEquals(50.26,result, 0.1);
	}
	
	@Test
	public void testDraw3() {
		Circle test = new Circle(-2);
		double result = test.draw();
		assertEquals("Wrong radius",-12.56,result, 0.1);
	}

}
