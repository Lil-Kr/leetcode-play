package com.cy.leetcodeplay.find.no220;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1 () {
		int[] nums = {1,2,3,1};
		int indexDiff = 3, valueDiff = 0;
		boolean res1 = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);

	}

}