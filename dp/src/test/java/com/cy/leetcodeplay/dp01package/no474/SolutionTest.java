package com.cy.leetcodeplay.dp01package.no474;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String[] strs = {"10","0001","111001","1","0"};
		int m = 5, n = 3;
		int res = solution.findMaxForm(strs, m, n);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		String[] strs = {"10","0","1"};
		int m = 1, n = 1;
		int res = solution.findMaxForm(strs, m, n);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test3() {
		String[] strs = {"00011","00001","00001","0011","111"};
		int m = 8, n = 5;
		int res = solution.findMaxForm(strs, m, n);
		Assertions.assertEquals(3, res);
	}

	// ==================== dp ====================
	@Test
	public void test21() {
		String[] strs = {"10","0001","111001","1","0"};
		int m = 5, n = 3;
		int res = solution.findMaxForm2(strs, m, n);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test22() {
		String[] strs = {"10","0","1"};
		int m = 1, n = 1;
		int res = solution.findMaxForm2(strs, m, n);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test23() {
		String[] strs = {"00011","00001","00001","0011","111"};
		int m = 8, n = 5;
		int res = solution.findMaxForm2(strs, m, n);
		Assertions.assertEquals(3, res);
	}
}