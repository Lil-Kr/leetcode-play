package com.cy.leetcodeplay.stackandqueue.stack.no735;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] asteroids = {5, 10, -5};
		int[] res = solution.asteroidCollision(asteroids);
		Assertions.assertEquals("[5,10]", JSONArray.toJSONString(res));
	}

	@Test
	public void test2() {
		int[] asteroids = {8, -8};
		int[] res = solution.asteroidCollision(asteroids);
		Assertions.assertEquals("[]", JSONArray.toJSONString(res));
	}

	@Test
	public void test3() {
		int[] asteroids = {10,2,-5};
		int[] res = solution.asteroidCollision(asteroids);
		Assertions.assertEquals("[10]", JSONArray.toJSONString(res));
	}
}