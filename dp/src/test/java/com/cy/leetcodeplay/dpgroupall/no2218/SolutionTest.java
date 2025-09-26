package com.cy.leetcodeplay.dpgroupall.no2218;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		List<List<Integer>> piles = new ArrayList<>();
		List<Integer> pile1 = new ArrayList<>();
		pile1.add(1);
		pile1.add(100);
		pile1.add(3);

		List<Integer> pile2 = new ArrayList<>();
		pile2.add(7);
		pile2.add(8);
		pile2.add(9);

		piles.add(pile1);
		piles.add(pile2);

		int k = 2;
		int res = solution.maxValueOfCoins(piles, k);
		Assertions.assertEquals(101, res);
	}
}