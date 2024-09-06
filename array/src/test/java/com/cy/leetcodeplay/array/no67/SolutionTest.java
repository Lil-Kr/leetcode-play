package com.cy.leetcodeplay.array.no67;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test_1 () {
		String a = "1010";
		String b = "1011";
		String res1 = solution.addBinary(a, b);
		System.out.println(res1);
		Assertions.assertEquals("10101", res1);
	}

	@Test
	public void test_2 () {
		String a = "11";
		String b = "01";
		String res1 = solution.addBinary(a, b);
		System.out.println(res1);
		Assertions.assertEquals("100", res1);
	}

	@Test
	public void test_3 () {
		String a = "1110";
		String b = "1111";
		String res1 = solution.addBinary(a, b);
		System.out.println(res1);
		Assertions.assertEquals("11101", res1);
	}

	@Test
	public void test4 () {

	}
}