package com.cy.leetcodeplay.findtable.no155;

import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/7
 * @Description: no.155. Min Stack
 */
public class MinStack {

	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);
		if (minStack.isEmpty() || val <= minStack.peek()) {
			minStack.push(val);
		}
	}

	public void pop() {
		int poppedValue = stack.pop();
		if (minStack.peek() == poppedValue) {
			minStack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
