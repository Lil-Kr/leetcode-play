package com.cy.leetcodeplay.matrix.backtracking.no17;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.backtracking.no17.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String digits = "23";
		List<String> res1 = solution.letterCombinations(digits);
		System.out.println(JSONArray.toJSONString(res1));
		Assertions.assertEquals("[\"ad\",\"ae\",\"af\",\"bd\",\"be\",\"bf\",\"cd\",\"ce\",\"cf\"]", JSONArray.toJSONString(res1));
	}

}