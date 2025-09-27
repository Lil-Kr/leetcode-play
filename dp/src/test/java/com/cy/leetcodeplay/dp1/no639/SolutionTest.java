package com.cy.leetcodeplay.dp1.no639;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();
	private final String case2 = "7*9*3*6*3*0*5*4*9*7*3*7*1*8*3*2*0*0*6*";

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
		int res1 = solution.numDecodings4(case2);
		System.out.println(res1);
		Assertions.assertEquals(196465252, res1);
	}

	@Test
	public void test5() {
		int res1 = solution.numDecodings2(case2);
		System.out.println(res1);
		Assertions.assertEquals(196465252, res1);
	}

	@Test
	public void test6() {
		int res1 = solution.numDecodings3(case2);
		Assertions.assertEquals(196465252, res1);
	}
}