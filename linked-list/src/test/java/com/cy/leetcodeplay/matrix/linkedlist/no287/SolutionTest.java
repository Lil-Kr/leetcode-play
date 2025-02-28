package com.cy.leetcodeplay.matrix.linkedlist.no287;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 3, 4, 2, 2};
		int res1 = solution.findDuplicate2(nums);
		System.out.println(res1);
		Assertions.assertEquals(2, res1);
	}

	@Test
	public void test2() {
		int[] nums = {3, 1, 3, 4, 2};
		int res1 = solution.findDuplicate2(nums);
		System.out.println(res1);
		Assertions.assertEquals(3, res1);
	}

	@Test
	public void test3() {
		System.out.println(5 % 2);
	}
}