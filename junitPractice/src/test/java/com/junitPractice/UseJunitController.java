package com.junitPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UseJunitController {
	
	JunitController j = new JunitController();
	
	@Before
	public void before() {
		System.out.println("Test Started!");
	}
	
	@Test
	public void testFindMax() {
		int[]nums= {57,979,8,689};
		assertEquals(j.findMax(nums), 979);
	}

	
	
}
