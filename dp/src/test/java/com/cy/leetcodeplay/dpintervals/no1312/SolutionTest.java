package com.cy.leetcodeplay.dpintervals.no1312;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "zzazz";
		int res = solution.minInsertions(s);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test2() {
		String s = "mbadm";
		int res = solution.minInsertions(s);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test3() {
		String s = "leetcode";
		int res = solution.minInsertions(s);
		Assertions.assertEquals(5, res);
	}

	// ================ dp ================

	@Test
	public void test21() {
		String s = "zzazz";
		int res = solution.minInsertions2(s);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test22() {
		String s = "mbadm";
		int res = solution.minInsertions2(s);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test23() {
		String s = "leetcode";
		int res = solution.minInsertions2(s);
		Assertions.assertEquals(5, res);
	}

	// ================ dp + space compression ================

	@Test
	public void test31() {
		String s = "zzazz";
		int res = solution.minInsertions3(s);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test32() {
		String s = "mbadm";
		int res = solution.minInsertions3(s);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test33() {
		String s = "leetcode";
		int res = solution.minInsertions3(s);
		Assertions.assertEquals(5, res);
	}
}