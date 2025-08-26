package com.cy.leetcodeplay.string.no1071;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String str1 = "ABCABC", str2 = "ABC";

		String res = solution.gcdOfStrings(str1, str2);
		Assertions.assertEquals("ABC", res);
	}

	@Test
	public void test2() {
		String str1 = "ABABAB", str2 = "AB";

		String res = solution.gcdOfStrings(str1, str2);
		Assertions.assertEquals("AB", res);
	}

	@Test
	public void test3() {
		String str1 = "LEET", str2 = "CODE";

		String res = solution.gcdOfStrings(str1, str2);
		Assertions.assertEquals("", res);
	}
}