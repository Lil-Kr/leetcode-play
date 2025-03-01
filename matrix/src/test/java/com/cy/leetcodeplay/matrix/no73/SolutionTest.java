package com.cy.leetcodeplay.matrix.no73;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		solution.setZeroes(matrix);
		Assertions.assertEquals("[[1,0,1],[0,0,0],[1,0,1]]", JSONArray.toJSONString(matrix));
	}

	@Test
	public void test2() {
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		solution.setZeroes(matrix);
		Assertions.assertEquals("[[0,0,0,0],[0,4,5,0],[0,3,1,0]]", JSONArray.toJSONString(matrix));
	}
}