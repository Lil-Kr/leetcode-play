package com.cy.leetcodeplay.array.no881;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] people = {1,2};
		int limit = 3;
		int res = solution.numRescueBoats(people, limit);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test2() {
		int[] people = {3,2,2,1};
		int limit = 3;
		int res = solution.numRescueBoats(people, limit);
		Assertions.assertEquals(3, res);
	}

	@Test
	public void test3() {
		int[] people = {3,5,3,4};
		int limit = 5;
		int res = solution.numRescueBoats(people, limit);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test4() {
		int[] people = {2, 9, 9};
		int limit = 8;
		int res = solution.numRescueBoats(people, limit);
		Assertions.assertEquals(3, res);
	}
}