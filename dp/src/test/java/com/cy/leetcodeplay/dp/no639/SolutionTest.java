package com.cy.leetcodeplay.dp.no639;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "*";
		int res1 = solution.numDecodings4(s);
		System.out.println(res1);
		Assertions.assertEquals(9, res1);
	}

	@Test
	public void test2() {
		String s = "1*";
		int res1 = solution.numDecodings4(s);
		System.out.println(res1);
		Assertions.assertEquals(18, res1);
	}

	@Test
	public void test3() {
		String s = "*********";
		int res1 = solution.numDecodings4(s);
		System.out.println(res1);
		Assertions.assertEquals(291868912, res1);
	}

	@Test
	public void test4() {
		String s = "7*9*3*6*3*0*5*4*9*7*3*7*1*8*3*2*0*0*6*";
		int res1 = solution.numDecodings4(s);
		System.out.println(res1);
		Assertions.assertEquals(196465252, res1);
	}
}