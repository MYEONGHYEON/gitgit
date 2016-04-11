package gitgit;

import static org.junit.Assert.*;

import org.junit.Test;

public class calcal {

	@Test
	public void testAdd() {
	calc cal= new calc();
	cal.add(10,20);
	assertEquals(30,cal.getResult());
	}

	@Test
	public void testSub() {
	calc cal= new calc();
	cal.sub(10,20);
	assertEquals(-10,cal.getResult());
	}
	
	@Test
	public void testDiv() {
	calc cal= new calc();
	cal.div(100,20);
	assertEquals(5,cal.getResult());
	}
}
