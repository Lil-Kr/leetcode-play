package com.cy.leetcodeplay.array.no88;

import com.cy.leetcodeplay.common.util.PrintString;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1() {
		int[] nums1 = {1, 2, 6, 0, 0, 0};
		int m = 3;
		int[] nums2 = {-1, 5, 6};
		int n = 3;

		solution.merge(nums1, m, nums2, n);
		System.out.println(PrintString.printIntArray(nums1));
	}

}