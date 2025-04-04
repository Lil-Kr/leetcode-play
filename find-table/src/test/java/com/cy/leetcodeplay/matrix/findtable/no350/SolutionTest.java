package com.cy.leetcodeplay.matrix.findtable.no350;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.findtable.no350.Solution;
import com.cy.leetcodeplay.common.util.PrintString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1() {
		int[] nums1 = {1,2,2,1}, nums2 = {2,2};

		int[] res1 = solution.intersect(nums1, nums2);
		System.out.println(PrintString.printIntArray(res1));
		Assertions.assertEquals("[2,2]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test_2() {
		int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};

		int[] res1 = solution.intersect(nums1, nums2);
		System.out.println(PrintString.printIntArray(res1));
//		Assertions.assertEquals("[4,9]", JSONArray.toJSONString(res1));
	}
}