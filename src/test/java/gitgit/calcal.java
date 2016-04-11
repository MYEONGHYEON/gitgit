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
	
	@Test
	public void testDiv() {
	calc cal= new calc();
	cal.div(100,20);
	assertEquals(5,cal.getResult());
	}

	@Test
	public void testInc() {
	calc cal= new calc();
	cal.inc(100);
	assertEquals(100,cal.getResult());
	cal.inc(200);
	assertEquals(300,cal.getResult());
	}
	
}
