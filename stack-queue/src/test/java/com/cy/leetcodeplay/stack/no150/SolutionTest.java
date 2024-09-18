package com.cy.leetcodeplay.stack.no150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String[] tokens = {"2", "1", "+", "3", "*"};
		int res1 = solution.evalRPN(tokens);
		Assertions.assertEquals(9, res1);
	}

	@Test
	public void test2() {
		String[] tokens = {"4", "13", "5", "/", "+"};
		int res1 = solution.evalRPN(tokens);
		Assertions.assertEquals(6, res1);
	}

	@Test
	public void test3() {
		String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		int res1 = solution.evalRPN(tokens);
		Assertions.assertEquals(22, res1);
	}

	@Test
	public void test4() {
		String[] tokens = {"10","9","3","+","-11","*","6","/","*","17","+","5","+"};
		int res1 = solution.evalRPN(tokens);
		Assertions.assertEquals(-198, res1);
	}
}