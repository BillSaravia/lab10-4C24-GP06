package com.tecsup.lab10_junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ApplicationTest {

	@Test
	public void testSumar() {		
		Application app = new Application();		
		assertEquals(7 , app.sumar(4, 3));
	}
	
	@Test
	public void testRestar() {
		Application app = new Application();		
		assertEquals(1 , app.restar(4, 3));		
	}
	@Test
	public void testMultiplicar() {
		Application app = new Application();		
		assertEquals(1 , app.multi(4, 3));		
	}
	@Test
	public void testDividir() {
		Application app = new Application();		
		assertEquals(1 , app.divi(4, 3));		
	}

}
