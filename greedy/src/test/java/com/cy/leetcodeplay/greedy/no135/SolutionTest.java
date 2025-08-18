package com.cy.leetcodeplay.greedy.no135;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] ratings = {1,0,2};
		int res = solution.candy(ratings);
		Assertions.assertEquals(5, res);
	}

	@Test
	public void test2() {
		int[] ratings = {1,2,2};
		int res = solution.candy(ratings);
		Assertions.assertEquals(4, res);
	}
}