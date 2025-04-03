package com.cy.leetcodeplay.array.no57;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] intervals = {{1,3},{6,9}};
		int[] newInterval = {2,5};
		int[][] insert = solution.insert(intervals, newInterval);

		Assertions.assertEquals("[[1,5],[6,9]]", JSONArray.toJSONString(insert));
	}

	@Test
	public void test2() {
		int[][] intervals = {};
		int[] newInterval = {5,7};
		int[][] insert = solution.insert(intervals, newInterval);

		Assertions.assertEquals("[[5,7]]", JSONArray.toJSONString(insert));
	}

	@Test
	public void test3() {
		int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newInterval = {4,8};
		int[][] insert = solution.insert(intervals, newInterval);

		Assertions.assertEquals("[[1,2],[3,10],[12,16]]", JSONArray.toJSONString(insert));
	}
}