package com.cy.leetcodeplay.find.no242;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "anagram", t = "nagaram";
		boolean res1 = solution.isAnagram2(s, t);
		Assertions.assertEquals(true, res1);
	}

}