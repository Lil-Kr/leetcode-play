package com.cy.leetcodeplay.stackandqueue.queue.no347;

import com.cy.leetcodeplay.common.util.PrintString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,1,1,2,2,3};
		int k = 2;
		int[] res1 = solution.topKFrequent(nums, k);
		Assertions.assertEquals("[1,2]", PrintString.printIntArray(res1));
	}
}