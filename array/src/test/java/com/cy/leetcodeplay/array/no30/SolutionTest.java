package com.cy.leetcodeplay.array.no30;

import com.cy.leetcodeplay.array.no30.Solution;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "barfoothefoobarman";
		String[] words = {"foo","bar"};

		solution.findSubstring(s, words);
	}
}