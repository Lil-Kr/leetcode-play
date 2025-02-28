package com.cy.leetcodeplay.array.no56;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.array.no56.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1() {
		int[][] arr1 = new int[][]{{1,3},{2,6},{8,10},{15,18}};
		int[][] res1 = solution.merge(arr1);
		Assertions.assertEquals("[[1,6],[8,10],[15,18]]", JSONArray.toJSONString(res1));
	}

}