package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class DemoApplicationTests {

	@Test
	public void stringEq() {
		String s1="Yasin";
		String s2="Yasin";

		assertEquals(s1, s2);
	}

}
