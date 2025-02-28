package com.cy.leetcodeplay.matrix.findtable.no220;

import org.junit.jupiter.api.Test;

import java.util.TreeSet;

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
		TreeSet<Integer> res = new TreeSet<>();
		res.add(1);
		res.add(2);
		res.add(6);
		res.add(7);
		res.add(9);

		System.out.println(res.ceiling(7));
	}

}