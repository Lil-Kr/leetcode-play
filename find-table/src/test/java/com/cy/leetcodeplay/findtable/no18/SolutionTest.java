package com.cy.leetcodeplay.findtable.no18;


import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.findtable.no18.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class SolutionTest {
	private Solution solution = new Solution();


	@Test
	public void test1() {
		int [] nums = {1,0,-1,0,-2,2};
		int target = 0;
		List<List<Integer>> res1 = solution.fourSum(nums, target);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		int[] nums = {2, 2, 2, 2, 2};
		int target = 8;
		List<List<Integer>> res1 = solution.fourSum(nums, target);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[[2,2,2,2]]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test3() {
		int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
		int target = -294967296;
		List<List<Integer>> res1 = solution.fourSum(nums, target);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[]", JSONArray.toJSONString(res1));
	}
}