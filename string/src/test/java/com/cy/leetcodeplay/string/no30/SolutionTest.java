package com.cy.leetcodeplay.string.no30;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "barfoothefoobarman";
		String[] words = {"foo", "bar"};
		List<Integer> res = solution.findSubstring(s, words);
		Assertions.assertEquals("[0,9]", JSONArray.toJSONString(res));
	}

	@Test
	public void test2() {
		String s = "wordgoodgoodgoodbestword";
		String[] words = {"word","good","best","word"};
		List<Integer> res = solution.findSubstring(s, words);
		Assertions.assertEquals("[]", JSONArray.toJSONString(res));
	}

	@Test
	public void test3() {
		String s = "barfoofoobarthefoobarman";
		String[] words = {"bar","foo","the"};
		List<Integer> res = solution.findSubstring(s, words);
		Assertions.assertEquals("[6,9,12]", JSONArray.toJSONString(res));
	}
}