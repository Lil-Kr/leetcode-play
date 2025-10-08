package com.cy.leetcodeplay.array.no1431;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> res = solution.kidsWithCandies(candies, extraCandies);
		Assertions.assertEquals("[true,true,true,false,true]", JSONArray.toJSONString(res));
	}

	@Test
	public void test2() {
		int[] candies = {4,2,1,1,2};
		int extraCandies = 1;
		List<Boolean> res = solution.kidsWithCandies(candies, extraCandies);
		Assertions.assertEquals("[true,false,false,false,false]", JSONArray.toJSONString(res));
	}

	@Test
	public void test3() {
		int[] candies = {12,1,12};
		int extraCandies = 10;
		List<Boolean> res = solution.kidsWithCandies(candies, extraCandies);
		Assertions.assertEquals("[true,false,true]", JSONArray.toJSONString(res));
	}
}