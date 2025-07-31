package com.cy.leetcodeplay.string.no68;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
		int maxWidth = 16;
		List<String> list = solution.fullJustify(words, maxWidth);
		String res = JSONArray.toJSONString(list);
		System.out.println(res);
		Assertions.assertEquals("[\"This    is    an\",\"example  of text\",\"justification.  \"]", res);
	}
}