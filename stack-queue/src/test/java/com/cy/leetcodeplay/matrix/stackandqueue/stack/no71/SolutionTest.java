package com.cy.leetcodeplay.matrix.stackandqueue.stack.no71;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String path = "/home/";
		String res1 = solution.simplifyPath(path);
		Assertions.assertEquals("/home", res1);
	}

	@Test
	public void test2() {
		String path = "/home//foo/";
		String res1 = solution.simplifyPath(path);
		Assertions.assertEquals("/home/foo", res1);
	}

	@Test
	public void test3() {
		String path = "/home/user/Documents/../Pictures";
		String res1 = solution.simplifyPath(path);
		Assertions.assertEquals("/home/user/Pictures", res1);
	}

	@Test
	public void test4() {
		String path = "/.../a/../b/c/../d/./";
		String res1 = solution.simplifyPath(path);
		Assertions.assertEquals("/.../b/d", res1);
	}

	@Test
	public void test5() {
		String path = "/../";
		String res1 = solution.simplifyPath(path);
		Assertions.assertEquals("/", res1);
	}
}