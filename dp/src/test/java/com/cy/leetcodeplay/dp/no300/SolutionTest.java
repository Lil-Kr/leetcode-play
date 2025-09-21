package com.cy.leetcodeplay.dp.no300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		int res = solution.lengthOfLIS2(nums);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		int[] nums = {0, 1, 0, 3, 2, 3};
		int res = solution.lengthOfLIS2(nums);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test3() {
		int[] nums = {7,7};
		int res = solution.lengthOfLIS2(nums);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test4() {
		int[] nums = {4,10,4,3,8,9};
		int res = solution.lengthOfLIS2(nums);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test5() {
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		int res = solution.lengthOfLIS3(nums);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test6() {
		int[] nums = {0, 1, 0, 3, 2, 3};
		int res = solution.lengthOfLIS3(nums);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test7() {
		int[] nums = {7, 7};
		int res = solution.lengthOfLIS3(nums);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test8() {
		int[] nums = {4, 10, 4, 3, 8, 9};
		int res = solution.lengthOfLIS3(nums);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test9() {
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		int res = solution.lengthOfLIS4(nums);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test10() {
		int[] nums = {0, 1, 0, 3, 2, 3};
		int res = solution.lengthOfLIS4(nums);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test11() {
		int[] nums = {7, 7};
		int res = solution.lengthOfLIS4(nums);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test12() {
		int[] nums = {4, 10, 4, 3, 8, 9};
		int res = solution.lengthOfLIS4(nums);
		Assertions.assertEquals(3, res);
	}
}