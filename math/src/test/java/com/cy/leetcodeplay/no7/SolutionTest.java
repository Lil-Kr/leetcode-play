package com.cy.leetcodeplay.no7;

import com.cy.leetcodeplay.math.no7.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int x = 123;
		int res1 = solution.reverse(x);
		Assertions.assertEquals(321, res1);
	}

	@Test
	public void test2() {
		int x = -123;
		int res1 = solution.reverse(x);
		Assertions.assertEquals(-321, res1);

		Arrays.sort("abc".toCharArray());
	}
}