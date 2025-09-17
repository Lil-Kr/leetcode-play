package com.cy.leetcodeplay.dp.no62;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int m = 3, n = 7;
		int res = solution.uniquePaths(m, n);
		Assertions.assertEquals(28, res);
	}

	@Test
	public void test2() {
		int m = 3, n = 2;
		int res = solution.uniquePaths(m, n);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test3() {
		int m = 51, n = 9;
		int res = solution.uniquePaths2(m, n);
		Assertions.assertEquals(1916797311, res);
	}

	@Test
	public void test4() {
		int m = 3, n = 7;
		int res = solution.uniquePaths2(m, n);
		Assertions.assertEquals(28, res);
	}

	@Test
	public void test5() {
		int m = 3, n = 2;
		int res = solution.uniquePaths2(m, n);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test6() {
		int m = 3, n = 2;
		int res = solution.uniquePaths3(m, n);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test7() {
		int m = 3, n = 7;
		int res = solution.uniquePaths3(m, n);
		Assertions.assertEquals(28, res);
	}

	@Test
	public void test8() {
		int m = 51, n = 9;
		int res = solution.uniquePaths3(m, n);
		Assertions.assertEquals(1916797311, res);
	}

	@Test
	public void test9() {
		int m = 3, n = 2;
		int res = solution.uniquePaths4(m, n);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test10() {
		int m = 3, n = 7;
		int res = solution.uniquePaths4(m, n);
		Assertions.assertEquals(28, res);
	}

	@Test
	public void test11() {
		int m = 51, n = 9;
		int res = solution.uniquePaths4(m, n);
		Assertions.assertEquals(1916797311, res);
	}
}