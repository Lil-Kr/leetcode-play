package com.cy.leetcodeplay.array.no387;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "leetcode";
		int res1 = solution.firstUniqChar(s);
		Assertions.assertEquals(0, res1);
	}
}