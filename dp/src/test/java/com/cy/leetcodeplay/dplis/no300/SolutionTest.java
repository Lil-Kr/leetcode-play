package com.cy.leetcodeplay.dplis.no300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
	public void test35() {
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		int res = solution.lengthOfLIS3(nums);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test36() {
		int[] nums = {0, 1, 0, 3, 2, 3};
		int res = solution.lengthOfLIS3(nums);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test37() {
		int[] nums = {7, 7};
		int res = solution.lengthOfLIS3(nums);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test38() {
		int[] nums = {4, 10, 4, 3, 8, 9};
		int res = solution.lengthOfLIS3(nums);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test41() {
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		int res = solution.lengthOfLIS4(nums);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test42() {
		int[] nums = {0, 1, 0, 3, 2, 3};
		int res = solution.lengthOfLIS4(nums);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test43() {
		int[] nums = {7, 7};
		int res = solution.lengthOfLIS4(nums);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test44() {
		int[] nums = {4, 10, 4, 3, 8, 9};
		int res = solution.lengthOfLIS4(nums);
		Assertions.assertEquals(3, res);
	}

	// =========== 最长不降子序列 ===========
	@Test
	public void test51() {
		int[] nums = {2, 1, 1, 1, 3, 1, 4, 10};
		int res = solution.lengthOfLIS5(nums);
		Assertions.assertEquals(6, res);
	}
}