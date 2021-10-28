package Examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testDraw() {
		Rectangle test = new Rectangle(2,4);
		double result = test.draw();
		assertEquals(8,result, 0.1);
	}
	
	@Test
	public void testDraw2() {
		Rectangle test = new Rectangle(1.0,4.0);
		double result = test.draw();
		assertEquals(4.0,result, 0.1);
	}
	
	@Test
	public void testDraw3() {
		Rectangle test = new Rectangle(-1,5);
		double result = test.draw();
		assertEquals("wrong width",-5,result, 0.1);
	}

}
