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

}
