package com.cy.leetcodeplay.matrix.stackandqueue.queue.no692;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
		int k = 2;

		List<String> res1 = solution.topKFrequent(words, k);
		Assertions.assertEquals("[\"i\",\"love\"]", JSONArray.toJSONString(res1));
	}

	@Test
	public void test2() {
		String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
		int k = 4;

		List<String> res1 = solution.topKFrequent(words, k);
		Assertions.assertEquals("[\"the\",\"is\",\"sunny\",\"day\"]", JSONArray.toJSONString(res1));
	}
}