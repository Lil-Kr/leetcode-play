package com.cy.leetcodeplay.dp.no120;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	private static List<List<Integer>> build (int [][] nums) {
		List<List<Integer>> triangle = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i].length;
			List<Integer> temp = new ArrayList<>();
			for (int x = 0; x < j; x++) {
				temp.add(nums[i][x]);
			}
			triangle.add(temp);
		}
		return triangle;
	}

	@Test
	public void test1() {
		int [][] nums = {{2},{3,4},{6,5,7},{4,1,8,3}};
		List<List<Integer>> triangle = build(nums);

		System.out.println(JSONArray.toJSONString(triangle));

		int res1 = solution.minimumTotal(triangle);
		Assertions.assertEquals(11, res1);
	}

	@Test
	public void test2() {
		int [][] nums = {{2},{3,4},{6,5,1}};
		List<List<Integer>> triangle = build(nums);

		System.out.println(JSONArray.toJSONString(triangle));

		int res1 = solution.minimumTotal(triangle);
		Assertions.assertEquals(7, res1);
	}
}