package com.cy.leetcodeplay.dp2.no718;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums1 = {1,2,3,2,1}, nums2 = {3,2,1,4,7};
		int res = solution.findLength(nums1, nums2);
		Assertions.assertEquals(3, res);
	}

	// ============= dp ==========
	@Test
	public void test21() {
		int[] nums1 = {1,2,3,2,1}, nums2 = {3,2,1,4,7};
		int res = solution.findLength2(nums1, nums2);
		Assertions.assertEquals(3, res);
	}
}