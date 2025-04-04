package com.cy.leetcodeplay.matrix.dp.fibonacci;

import com.cy.leetcodeplay.dp.fibonacci.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int n = 5;
		int res1 = solution.fib(n);
		Assertions.assertEquals(5, res1);
	}

	@Test
	public void test2() {
		int n = 40;
		int res1 = solution.fib(n);
//		Assertions.assertEquals(6765, res1);

		System.out.println(solution.getNum());
	}
}