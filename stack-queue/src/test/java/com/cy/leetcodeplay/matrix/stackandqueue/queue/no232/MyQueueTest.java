package com.cy.leetcodeplay.matrix.stackandqueue.queue.no232;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyQueueTest {

	private MyQueue myQueue = new MyQueue();

	@Test
	public void test1() {
		int[] nums = {1,2,3,4,5,6};
		for (int i = 0; i < nums.length; i++) {
			myQueue.push(nums[i]);
		}
		boolean res = myQueue.empty();
		Assertions.assertEquals(false, res);

		int res1 = myQueue.peek();
		Assertions.assertEquals(1, res1);

		myQueue.pop();
		int res2 = myQueue.pop();
		Assertions.assertEquals(2, res2);

		Assertions.assertEquals(3, myQueue.peek());

		for (int i = 0; i < 4; i++) {
			myQueue.pop();
		}
		Assertions.assertEquals(true, myQueue.empty());
	}
}