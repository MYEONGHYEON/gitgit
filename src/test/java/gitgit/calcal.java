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
	public void testMulti() {
	calc cal= new calc();
	cal.multi(10,20);
	assertEquals(200,cal.getResult());
	}
}
