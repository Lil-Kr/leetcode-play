package com.cy.leetcodeplay.findtable.no12;

import com.cy.leetcodeplay.findtable.no12.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int num = 3749;
		String res1 = solution.intToRoman(num);
		Assertions.assertEquals("MMMDCCXLIX", res1);
	}

	@Test
	public void test2() {
		int num = 58;
		String res1 = solution.intToRoman(num);
		Assertions.assertEquals("LVIII", res1);
	}
}