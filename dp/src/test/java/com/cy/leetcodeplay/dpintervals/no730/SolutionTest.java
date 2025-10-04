package com.cy.leetcodeplay.dpintervals.no730;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "bccb";
		int res = solution.countPalindromicSubsequences(s);
		Assertions.assertEquals(6, res);
	}

	@Test
	public void test2() {
		String s = "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba";
		int res = solution.countPalindromicSubsequences(s);
		Assertions.assertEquals(104860361, res);
	}

	@Test
	public void test3() {
		String s = "bcbacbabdcbcbdcbddcaaccdcbbcdbcabbcdddadaadddbdbbbdacbabaabdddcaccccdccdbabcddbdcccabccbbcdbcdbdaada";
		int res = solution.countPalindromicSubsequences(s);
		Assertions.assertEquals(117990582, res);
	}
}