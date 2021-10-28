package Examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComStrTest {

	@Test
	public void testCombine() {
		ComStr test = new ComStr();
		String result = test.combine("1","0");
		assertEquals("10",result);
		
		
	}
	
	@Test
	public void testCombine2() {
		ComStr test = new ComStr();
		String result = test.combine("hi","bye");
		assertEquals("hibye",result);
		
		
	}
	
	@Test
	public void testCombine3() {
		ComStr test = new ComStr();
		String result = test.combine("10","number");
		assertEquals("10number",result);
		
		
	}
	
	@Test
	public void testCombine4() {
		ComStr test = new ComStr();
		String result = test.combine("age","29");
		assertEquals("age29",result);
		

}
}
