package com.cy.leetcodeplay.find.no454;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums1 = {1,2}, nums2 = {-2,-1}, nums3 = {-1,2}, nums4 = {0,2};
		int res1 = solution.fourSumCount(nums1, nums2, nums3, nums4);
		Assertions.assertEquals(2, res1);
	}

	@Test
	public void test2() {
		int[] nums1 = {0}, nums2 = {0}, nums3 = {0}, nums4 = {0};
		int res1 = solution.fourSumCount(nums1, nums2, nums3, nums4);
		Assertions.assertEquals(1, res1);
	}
}