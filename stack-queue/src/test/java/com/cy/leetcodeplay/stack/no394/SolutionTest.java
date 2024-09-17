package com.cy.leetcodeplay.stack.no394;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "3[a]2[bc]";
		String res1 = solution.decodeString(s);
		Assertions.assertEquals("aaabcbc", res1);
	}

	@Test
	public void test2() {
		String s = "2[abc]3[cd]ef";
		String res1 = solution.decodeString(s);
		Assertions.assertEquals("abcabccdcdcdef", res1);
	}

	@Test
	public void test3() {
		String s = "3[a2[c]]";
		String res1 = solution.decodeString(s);
		Assertions.assertEquals("accaccacc", res1);
	}

//	@Test
//	public void test4() {
//		String s = "3[a2[b4[c]]]";
//		String res1 = solution.decodeString(s);
//		Assertions.assertEquals("abccccbccccabccccbccccabccccbcccc", res1);
//	}
}