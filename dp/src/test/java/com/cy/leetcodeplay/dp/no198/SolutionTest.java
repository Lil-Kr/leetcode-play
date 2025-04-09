package com.cy.leetcodeplay.dp.no198;

import com.cy.leetcodeplay.dp.no198.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 1};
		int res1 = solution.rob2(nums);
		Assertions.assertEquals(4, res1);
	}

}