package com.cy.leetcodeplay.array.no859;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1 () {
		String s = "ab", goal = "ba";

		boolean res1 = solution.buddyStrings(s, goal);
		Assertions.assertEquals(true, res1);
	}

}