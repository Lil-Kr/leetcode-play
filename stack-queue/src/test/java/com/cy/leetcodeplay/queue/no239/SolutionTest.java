package com.cy.leetcodeplay.queue.no239;

import com.cy.common.util.PrintString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
		int k = 3;

		int[] res1 = solution.maxSlidingWindow(nums, k);
		Assertions.assertEquals("[3,3,5,5,6,7]", PrintString.printIntArray(res1));
	}
}