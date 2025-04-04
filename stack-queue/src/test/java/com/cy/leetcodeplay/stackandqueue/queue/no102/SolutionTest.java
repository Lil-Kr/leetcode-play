package com.cy.leetcodeplay.stackandqueue.queue.no102;

import org.junit.jupiter.api.Test;
import java.util.ArrayDeque;
import java.util.Queue;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(3);
		queue.add(1);
		queue.add(2);

		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.remove());
		System.out.println(queue.peek());
	}

}