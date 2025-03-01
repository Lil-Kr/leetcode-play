package com.cy.leetcodeplay.matrix.no54;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> res = solution.spiralOrder(matrix);
		Assertions.assertEquals("[1,2,3,6,9,8,7,4,5]", JSONArray.toJSONString(res));
	}

	@Test
	public void test2() {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		List<Integer> res = solution.spiralOrder(matrix);
		Assertions.assertEquals("[1,2,3,4,8,12,11,10,9,5,6,7]", JSONArray.toJSONString(res));
	}
}