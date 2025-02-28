package com.cy.leetcodeplay.matrix.findtable.no155;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinStackTest {

	private MinStack minStack = new MinStack();

	@Test
	public void test1() {
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		int min = minStack.getMin();
		System.out.println(min);
		Assertions.assertEquals(-3, min);
		minStack.pop();// 出栈
		minStack.top();// 查看栈顶元素
		int res2 = minStack.getMin();// -2
		System.out.println(res2);
		Assertions.assertEquals(-2, res2);

	}

}