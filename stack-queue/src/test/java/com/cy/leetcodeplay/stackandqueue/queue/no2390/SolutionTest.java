package com.cy.leetcodeplay.stackandqueue.queue.no2390;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "leet**cod*e";
		String res = solution.removeStars(s);
		Assertions.assertEquals("lecoe", res);
	}

	@Test
	public void test2() {
		String s = "erase*****";
		String res = solution.removeStars(s);
		Assertions.assertEquals("", res);
	}
}