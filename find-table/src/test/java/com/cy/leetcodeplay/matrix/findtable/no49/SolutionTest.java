package com.cy.leetcodeplay.matrix.findtable.no49;


import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.findtable.no49.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> res1 = solution.groupAnagrams(strs);

		Assertions.assertEquals(3, res1.size());
	}

	@Test
	public void test2() {
		String[] strs = {"a"};
		List<List<String>> res1 = solution.groupAnagrams(strs);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals(1, res1.size());
	}
}