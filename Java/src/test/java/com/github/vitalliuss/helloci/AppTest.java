package com.github.vitalliuss.helloci;


import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 * @author vitali_shulha
 */
public class AppTest {

	/**
	 * test time1s next111
	 */
	@Test
	public void testShouldBePassed() {
		assertTrue(true);
	}

	@Test
	public void testShouldBeFailed() {
		assertFalse(false);
	}

	@Ignore("Not implemented yet")
	@Test
	public void testShouldBeSKipped() {
		assertTrue(true);
	}
	
	@Test
	public void testAnotherMethod() {
		App.doNothing();
	}
	
	@Test
	public void testAnotherClass() {
		EmptyClass.emptyMethod();
	}

	@Test
	public void testAnotherClassTest3() {

	}
}
