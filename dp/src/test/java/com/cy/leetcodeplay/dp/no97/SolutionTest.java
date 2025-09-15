package com.cy.leetcodeplay.dp.no97;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		boolean res = solution.isInterleave2(s1, s2, s3);
		Assertions.assertEquals(true, res);
	}

	@Test
	public void test4() {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
		boolean res = solution.isInterleave2(s1, s2, s3);
		Assertions.assertEquals(false, res);
	}
}