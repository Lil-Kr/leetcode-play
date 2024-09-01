package com.cy.leetcodeplay.array.no443;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1() {
		char[] chars1 = new char[]{'a','a','a','b','b','c','c','c'};
		int res1 = solution.compress(chars1);
		Assertions.assertEquals(6, res1);

		char[] chars2 = new char[]{'a'};
		int res2 = solution.compress(chars2);
		Assertions.assertEquals(1, res2);

		char[] chars3 = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
		int res3 = solution.compress(chars3);
		Assertions.assertEquals(4, res3);

		char[] chars4 = new char[]{'a','b'};
		int res4 = solution.compress(chars4);
		Assertions.assertEquals(2, res4);
	}

}