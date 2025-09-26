package com.cy.leetcodeplay.dpgroupall.no322;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] coins = {1,2,5};
		int amount = 11;
		int res = solution.coinChange(coins, amount);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test2() {
		int[] coins = {2};
		int amount = 3;
		int res = solution.coinChange(coins, amount);
		Assertions.assertEquals(-1, res);
	}

	@Test
	public void test3() {
		int[] coins = {1};
		int amount = 0;
		int res = solution.coinChange(coins, amount);
		Assertions.assertEquals(0, res);
	}



	@Test
	public void test4() {
		int[] coins = {1,2,5};
		int amount = 11;
		int res = solution.coinChange2(coins, amount);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test5() {
		int[] coins = {2};
		int amount = 3;
		int res = solution.coinChange2(coins, amount);
		Assertions.assertEquals(-1, res);
	}

	@Test
	public void test6() {
		int[] coins = {1};
		int amount = 0;
		int res = solution.coinChange2(coins, amount);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test7() {
		int[] coins = {1,2,3};
		int amount = 6;
		int res = solution.coinChange2(coins, amount);
		Assertions.assertEquals(2, res);
	}
}