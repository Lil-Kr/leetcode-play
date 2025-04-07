package com.cy.leetcodeplay.greedy.no763;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "ababcbacadefegdehijhklij";
		List<Integer> res = solution.partitionLabels(s);
		Assertions.assertEquals("[9,7,8]", JSONArray.toJSONString(res));
	}

	@Test
	public void test2() {
		String s = "eccbbbbdec";
		List<Integer> res = solution.partitionLabels(s);
		Assertions.assertEquals("[10]", JSONArray.toJSONString(res));
	}
}