package com.cy.leetcodeplay.matrix.findtable.no1;


import com.cy.leetcodeplay.matrix.common.util.PrintString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test_1() {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] res1 = solution.twoSum(nums, target);
		System.out.println(PrintString.printIntArray(res1));
		Assertions.assertEquals("[0,1]", PrintString.printIntArray(res1));
	}

	@Test
	public void test_2() {
		int[] nums = {3,2,4};
		int target = 6;
		int[] res1 = solution.twoSum(nums, target);
		System.out.println(PrintString.printIntArray(res1));
		Assertions.assertEquals("[1,2]", PrintString.printIntArray(res1));
	}
}