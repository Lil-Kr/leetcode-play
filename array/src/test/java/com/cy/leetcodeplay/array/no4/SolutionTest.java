package com.cy.leetcodeplay.array.no4;

import com.cy.leetcodeplay.array.no4.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums1 = {1,2}, nums2 = {3,4};
		double res1 = solution.findMedianSortedArrays(nums1, nums2);
		Assertions.assertEquals(2.5, res1);
	}

	@Test
	public void test2() {
		int[] nums1 = {}, nums2 = {1};
		double res1 = solution.findMedianSortedArrays(nums1, nums2);
		Assertions.assertEquals(1, res1);
	}

	@Test
	public void test3() {
		int[] nums1 = {1,3}, nums2 = {2};
		double res1 = solution.findMedianSortedArrays(nums1, nums2);
		Assertions.assertEquals(2, res1);
	}

	@Test
	public void test4() {
		int[] nums1 = {1,2,3}, nums2 = {3,4};
		double res1 = solution.findMedianSortedArrays(nums1, nums2);
		Assertions.assertEquals(3, res1);
	}
}