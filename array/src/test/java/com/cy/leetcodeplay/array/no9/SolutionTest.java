package com.cy.leetcodeplay.array.no9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int x = 121;
		boolean res1 = solution.isPalindrome(x);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		int x = -121;
		boolean res1 = solution.isPalindrome(x);
		Assertions.assertEquals(false, res1);
	}

	@Test
	public void test3() {
		int x = 10;
		boolean res1 = solution.isPalindrome(x);
		Assertions.assertEquals(false, res1);
	}
}