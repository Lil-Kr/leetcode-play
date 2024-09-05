package com.cy.leetcodeplay.find.no202;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 19;
		boolean res1 = solution.isHappy(n);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		int n = 2;
		boolean res1 = solution.isHappy(n);
		Assertions.assertEquals(false, res1);
	}

	@Test
	public void test3() {
		int n = 1;
		boolean res1 = solution.isHappy(n);
		Assertions.assertEquals(true, res1);
	}

}