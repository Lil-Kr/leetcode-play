package com.cy.leetcodeplay.array.no58;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "Hello World";
		int res1 = solution.lengthOfLastWord(s);
		Assertions.assertEquals(5, res1);
	}

	@Test
	public void test2() {
		String s = "   fly me   to   the moon  ";
		int res1 = solution.lengthOfLastWord(s);
		Assertions.assertEquals(4, res1);
	}

	@Test
	public void test3() {
		String s = "luffy is still joyboy";
		int res1 = solution.lengthOfLastWord(s);
		Assertions.assertEquals(6, res1);
	}
}