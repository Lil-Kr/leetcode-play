package com.cy.leetcodeplay.dpgroupallpackage.no518;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int amount = 5;
		int[] coins = {1, 2, 5};
		int res = solution.change(amount, coins);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		int amount = 8;
		int[] coins = {1, 2, 5};
		int res = solution.change(amount, coins);
		Assertions.assertEquals(7, res);
	}

	// ===================== dp =====================
	@Test
	public void test21() {
		int amount = 5;
		int[] coins = {1, 2, 5};
		int res = solution.change2(amount, coins);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test22() {
		int amount = 8;
		int[] coins = {1, 2, 5};
		int res = solution.change2(amount, coins);
		Assertions.assertEquals(7, res);
	}

	@Test
	public void test31() {
		int amount = 5;
		int[] coins = {1, 2, 5};
		int res = solution.change3(amount, coins);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test32() {
		int amount = 8;
		int[] coins = {1, 2, 5};
		int res = solution.change3(amount, coins);
		Assertions.assertEquals(7, res);
	}
}