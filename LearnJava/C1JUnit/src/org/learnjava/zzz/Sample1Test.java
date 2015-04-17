package org.learnjava.zzz;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class Sample1Test extends TestCase {

	@Test
	public void testAdd() {
		assertEquals(3,new Sample1().add(1, 2));
	}

}
