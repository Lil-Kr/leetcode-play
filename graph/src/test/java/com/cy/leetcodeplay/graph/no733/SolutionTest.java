package com.cy.leetcodeplay.graph.no733;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		int sr = 1, sc = 1, color = 2;
		int[][] res = solution.floodFill(image, sr, sc, color);
		Assertions.assertEquals("[[2,2,2],[2,2,0],[2,0,1]]", JSONArray.toJSONString(res));
	}
}