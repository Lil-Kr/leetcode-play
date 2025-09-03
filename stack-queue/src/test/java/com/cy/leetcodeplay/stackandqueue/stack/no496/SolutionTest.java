package com.cy.leetcodeplay.stackandqueue.stack.no496;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums1 = {4, 1, 2}, nums2 = {1, 3, 4, 2};
		int[] res = solution.nextGreaterElement(nums1, nums2);
		Assertions.assertEquals("[-1,3,-1]", JSONArray.toJSONString(res));
	}

	@Test
	public void test2() {
		int[] nums1 = {2, 4}, nums2 = {1, 2, 3, 4};
		int[] res = solution.nextGreaterElement(nums1, nums2);
		Assertions.assertEquals("[3,-1]", JSONArray.toJSONString(res));
	}
}