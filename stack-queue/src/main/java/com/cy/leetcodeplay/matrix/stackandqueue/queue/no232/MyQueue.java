package com.cy.leetcodeplay.matrix.stackandqueue.queue.no232;

import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/24
 * @Description: no.232. Implement Queue using Stacks
 */
public class MyQueue {


	private Stack<Integer> inStack;
	private Stack<Integer> outStack;

	public MyQueue() {
		inStack = new Stack<>();
		outStack = new Stack<>();
	}

	public void push(int x) {
		inStack.push(x);
	}

	public int pop() {
		moveToOut();
		return outStack.pop();
	}

	public int peek() {
		moveToOut();
		return outStack.peek();
	}

	private void moveToOut() {
		if (outStack.isEmpty()) {
			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
	}

	public boolean empty() {
		return inStack.isEmpty() && outStack.isEmpty();
	}
}
