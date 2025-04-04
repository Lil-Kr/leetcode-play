package com.cy.leetcodeplay.matrix.findtable.no136;

import com.cy.leetcodeplay.findtable.no136.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1() {
		int[] nums = {2, 2, 1};
		int res1 = solution.singleNumber2(nums);
		System.out.println(res1);
		Assertions.assertEquals(1, res1);
	}

	@Test
	public void test_2() {
		int[] nums = {4,1,2,1,2};
		int res1 = solution.singleNumber2(nums);
		System.out.println(res1);
		Assertions.assertEquals(4, res1);
	}

}