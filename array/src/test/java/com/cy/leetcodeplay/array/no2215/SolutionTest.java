package com.cy.leetcodeplay.array.no2215;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums1 = {1, 2, 3}, nums2 = {2, 4, 6};
		List<List<Integer>> res = solution.findDifference(nums1, nums2);

		Assertions.assertEquals("[[1,3],[4,6]]", JSONArray.toJSONString(res));
	}

}