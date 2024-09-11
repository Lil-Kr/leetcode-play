package com.cy.leetcodeplay.find.no220;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,2,4,3,1};
		int indexDiff = 3, valueDiff = 0;
		boolean res1 = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);

	}

	@Test
	public void test2() {
		Map<String, String> mapS = new HashMap<>();
//		mapS.putIfAbsent()
	}

}