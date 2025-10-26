package com.cy.leetcodeplay.dpgroupallpackage.no139;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "leetcode";
		String[] wordDict = {"leet", "code"};
		boolean res = solution.wordBreak(s, Arrays.asList(wordDict));
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test2() {
		String s = "applepenapple";
		String[] wordDict = {"apple", "pen"};
		boolean res = solution.wordBreak(s, Arrays.asList(wordDict));
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test3() {
		String s = "aaaaa";
		String[] wordDict = {"a","aa","b"};
		boolean res = solution.wordBreak(s, Arrays.asList(wordDict));
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test4() {
		String s = "catsandog";
		String[] wordDict = {"cats","dog","sand","and","cat"};
		boolean res = solution.wordBreak(s, Arrays.asList(wordDict));
		Assertions.assertEquals(false, res);
	}

	// =================== dp ===================

	@Test
	public void test21() {
		String s = "leetcode";
		String[] wordDict = {"leet", "code"};
		boolean res = solution.wordBreak2(s, Arrays.asList(wordDict));
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test22() {
		String s = "applepenapple";
		String[] wordDict = {"apple", "pen"};
		boolean res = solution.wordBreak2(s, Arrays.asList(wordDict));
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test23() {
		String s = "aaaaa";
		String[] wordDict = {"a","aa","b"};
		boolean res = solution.wordBreak2(s, Arrays.asList(wordDict));
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test24() {
		String s = "catsandog";
		String[] wordDict = {"cats","dog","sand","and","cat"};
		boolean res = solution.wordBreak2(s, Arrays.asList(wordDict));
		Assertions.assertEquals(false, res);
	}
}