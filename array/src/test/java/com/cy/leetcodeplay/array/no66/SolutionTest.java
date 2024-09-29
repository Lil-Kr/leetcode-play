package com.cy.leetcodeplay.array.no66;

import com.cy.common.util.PrintString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] digits = {1,2,3};
		int[] res1 = solution.plusOne(digits);
		Assertions.assertEquals("[1,2,4]", PrintString.printIntArray(res1));
	}

	@Test
	public void test2() {
		int[] digits = {4,3,2,1};
		int[] res1 = solution.plusOne(digits);
		Assertions.assertEquals("[4,3,2,2]", PrintString.printIntArray(res1));
	}

	@Test
	public void test3() {
		int[] digits = {9};
		int[] res1 = solution.plusOne(digits);
		Assertions.assertEquals("[1,0]", PrintString.printIntArray(res1));
	}
}