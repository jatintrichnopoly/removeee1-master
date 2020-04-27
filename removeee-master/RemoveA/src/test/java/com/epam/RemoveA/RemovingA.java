package com.epam.RemoveA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemovingA {
	
	RemovingAFirst ra;
	@BeforeEach
	void setUp() {
		ra=new RemovingAFirst();
	}
	@Test
	void testRemove1A() {
		assertEquals("BCD",ra.shif("ABCD"));
	}
	@Test
	void testRemove2A() {
		assertEquals("CD",ra.shif("AACD"));
	}
	@Test
	void testRemove11A() {
		assertEquals("BCD",ra.shif("BACD"));
	}
	@Test
	void testRemove0A() {
		assertEquals("BBCD",ra.shif("BBCD"));
	}
	@Test
	void testRemove111A() {
		assertEquals("BCD",ra.shif("AABCD"));
	}

}
