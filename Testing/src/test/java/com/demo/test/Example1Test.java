package com.demo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.demo.example.Example1;

public class Example1Test {

	private Example1 example1;
	
	@BeforeEach
	public void setup() {
		example1 = new Example1();
	}
	
	@Test
	public void sayStringTest() {
		assertEquals("Hello", example1.sayString());
	}
}
