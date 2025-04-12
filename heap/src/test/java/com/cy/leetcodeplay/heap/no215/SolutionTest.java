package com.cy.leetcodeplay.heap.no215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Random;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test() {
		int[] nums = {3,2,1,5,6,4};

		int left = 0, right = nums.length - 1;
		Random rand = new Random();
		int i = rand.nextInt(right - left + 1) + left;
		System.out.println(i);
	}

	@Test
	public void test1() {
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		int res = Solution.findKthLargest(nums, k);

		Assertions.assertEquals(res, 5);
	}

	@Test
	public void test2() {
		int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
		int k = 4;
		int res = Solution.findKthLargest(nums, k);

		Assertions.assertEquals(res, 4);
	}

	@Test
	public void test3() {
		int[] nums = {3,2,3,1,2,4,5,5,6,5};
		int k = 1;
		int res = Solution.findKthLargest(nums, k);

		Assertions.assertEquals(res, 6);
	}

	@Test
	public void test4() {
		int[] nums = {3,2,3,1,2,4,5,5,6,5};
		int k = 5;
		int res = Solution.findKthLargest(nums, k);

		Assertions.assertEquals(res, 4);
	}

	@Test
	public void test5() {
		int[] nums = {3,2,3,1,2,4,5,5,6,5};
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int i = 0; i < nums.length; i++) {
			minHeap.offer(nums[i]);
		}
		System.out.println(minHeap.peek());
	}

}