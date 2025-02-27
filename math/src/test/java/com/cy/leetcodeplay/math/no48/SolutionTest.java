package com.cy.leetcodeplay.math.no48;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		solution.rotate(matrix);
		Assertions.assertEquals("[[7,4,1],[8,5,2],[9,6,3]]", JSONArray.toJSONString(matrix));
	}

	@Test
	public void test2() {
		int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		solution.rotate(matrix);
		Assertions.assertEquals("[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]", JSONArray.toJSONString(matrix));
	}
}