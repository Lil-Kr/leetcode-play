package com.cy.leetcodeplay.dpoptimizeenumeration.no514;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String ring = "godding", key = "gd";
		int res = solution.findRotateSteps(ring, key);
		Assertions.assertEquals(4, res);
	}

	@Test
	public void test2() {
		String ring = "xrrakuulnczywjs", key = "jrlucwzakzussrlckyjjsuwkuarnaluxnyzcnrxxwruyr";
		int res = solution.findRotateSteps(ring, key);
		Assertions.assertEquals(204, res);
	}

	@Test
	public void test3() {
		String ring = "edcba", key = "abcde";
		int res = solution.findRotateSteps(ring, key);
		Assertions.assertEquals(10, res);
	}
}