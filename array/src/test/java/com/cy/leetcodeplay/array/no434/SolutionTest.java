package com.cy.leetcodeplay.array.no434;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1(){
		String s1 = "Hello, my name is John";
		int res1 = solution.countSegments(s1);
		Assertions.assertEquals(5, res1);


		String s2 = "  , Hello, my name is John";
		int res2 = solution.countSegments(s2);
		Assertions.assertEquals(6, res2);

	}

}