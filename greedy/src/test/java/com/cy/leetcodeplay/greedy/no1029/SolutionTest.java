package com.cy.leetcodeplay.greedy.no1029;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
		int res = solution.twoCitySchedCost(costs);
		Assertions.assertEquals(110, res);
	}

	@Test
	public void test2() {
		int[][] costs = {{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}};
		int res = solution.twoCitySchedCost(costs);
		Assertions.assertEquals(1859, res);
	}
}