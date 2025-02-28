package com.cy.leetcodeplay.array.no674;

import com.cy.leetcodeplay.array.no674.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1() {
		int[] nums1 = new int[]{1,3,5,4,7};
		int res1 = solution.findLengthOfLCIS(nums1);
		Assertions.assertEquals(res1, 3);


		int[] nums2 = new int[]{2,2,2,2,2,2};
		int res2 = solution.findLengthOfLCIS(nums2);
		Assertions.assertEquals(res2, 1);

		int[] num3 = new int[]{1,3,2};
		int res3 = solution.findLengthOfLCIS(num3);
		Assertions.assertEquals(res3, 2);


		int[] num4 = new int[]{2,1};
		int res4 = solution.findLengthOfLCIS(num4);
		Assertions.assertEquals(res4, 1);

		int[] num5 = new int[]{0,1,1,1,1,6,5};
		int res5 = solution.findLengthOfLCIS(num5);
		Assertions.assertEquals(res5, 2);
	}

}