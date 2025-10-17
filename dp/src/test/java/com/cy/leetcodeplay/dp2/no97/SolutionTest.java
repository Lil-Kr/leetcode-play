package com.cy.leetcodeplay.dp2.no97;

import com.cy.leetcodeplay.dp2.no97.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		boolean res = solution.isInterleave(s1, s2, s3);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test2() {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
		boolean res = solution.isInterleave(s1, s2, s3);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test3() {
		String s1 = "a", s2 = "", s3 = "c";
		boolean res = solution.isInterleave(s1, s2, s3);
		Assertions.assertEquals(false, res);
	}

	// =============== dp ===============

	@Test
	public void test21() {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		boolean res = solution.isInterleave2(s1, s2, s3);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test22() {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
		boolean res = solution.isInterleave2(s1, s2, s3);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test23() {
		String s1 = "a", s2 = "", s3 = "c";
		boolean res = solution.isInterleave2(s1, s2, s3);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test31() {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		boolean res = solution.isInterleave3(s1, s2, s3);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test32() {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
		boolean res = solution.isInterleave3(s1, s2, s3);
		Assertions.assertEquals(false, res);
	}

	@Test
	public void test33() {
		String s1 = "a", s2 = "", s3 = "c";
		boolean res = solution.isInterleave3(s1, s2, s3);
		Assertions.assertEquals(false, res);
	}
}