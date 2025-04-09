package com.cy.leetcodeplay.findtable.no451;

import com.cy.leetcodeplay.findtable.no451.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "tree";
		String res1 = solution.frequencySort(s);
		Assertions.assertEquals("eert", res1);
	}

	@Test
	public void test2() {
		String s = "raaeaedere";
		String res1 = solution.frequencySort(s);
		Assertions.assertEquals("eeeeaaarrd", res1);
	}

}