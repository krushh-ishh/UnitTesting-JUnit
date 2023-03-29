package com.demo.test;

import com.demo.example.UnitTesting1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class UnitTestingTest {

	
	private UnitTesting1 unitTesting1 = new UnitTesting1();
	
	@Test
	public void testDivide() {
		assertEquals(10, unitTesting1.divide(100, 10));
	}
}
