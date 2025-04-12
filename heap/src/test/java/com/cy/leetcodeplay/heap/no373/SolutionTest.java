package com.cy.leetcodeplay.heap.no373;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] num1 = {1, 7, 11}, num2 = {2, 4, 6};
		int k = 3;
		List<List<Integer>> res = solution.kSmallestPairs(num1, num2, k);
		Assertions.assertEquals("[[1,2],[1,4],[1,6]]", JSONArray.toJSONString(res));
	}

	@Test
	public void test2() {
		int[] num1 = {1, 1, 2}, num2 = {1, 2, 3};
		int k = 2;
		List<List<Integer>> res = solution.kSmallestPairs(num1, num2, k);
		Assertions.assertEquals("[[1,1],[1,1]]", JSONArray.toJSONString(res));
	}
}