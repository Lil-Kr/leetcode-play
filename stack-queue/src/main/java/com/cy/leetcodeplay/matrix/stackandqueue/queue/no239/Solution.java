package com.cy.leetcodeplay.matrix.stackandqueue.queue.no239;

import java.util.*;

/**
 * @Author: Lil-K
 * @Date: 2024/9/26
 * @Description: no.239. Sliding Window Maximum
 *
 * 使用双端队列:
 *  1. 队列中的每个元素是当前窗口中可能的最大值的索引
 *  2. 在队列的头部, 始终保留当前窗口的最大值
 *  
 * 1. 当窗口移动时, 将过期的索引（即队列中不再属于当前窗口范围的索引）移出队列
 * 2. 将新的元素索引加入队列前, 移除队列中所有小于新元素的元素, 因为这些元素在当前窗口中不会再有机会成为最大值
 * 3. 队列的头部始终是当前窗口的最大值索引
 */
public class Solution {


	/**
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length < 1 || k > nums.length) return nums;

		/**
		 * 创建双端队列
		 */
		Deque<Integer> deque = new LinkedList<>();  // 双端队列, 存储索引
		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			/**
			 * 如果队列头部元素已经不在窗口中, 移除它
			 */
			if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
				deque.pollFirst();
			}

			/**
			 * 移除队列中所有小于 当前元素的元素
			 */
			while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
				deque.pollLast();
			}

			deque.offerLast(i);
			/**
			 * 当我们走到第 k 个元素时, 队列头部元素就是当前窗口的最大值
			 */
			if (i >= k - 1) {
				res.add(nums[deque.peekFirst()]);
			}
		}

		return res.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * 这个解法超时了
	 * @param nums
	 * @param k
	 * @return
	 */
	public int[] maxSlidingWindowDemo(int[] nums, int k) {
		if (nums.length < 1 || k > nums.length) return nums;

		int l = 0, r = 0;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
			(a, b) -> b - a
		);

		while (r < k) {
			maxHeap.offer(nums[r]);
			r++;
		}

		List<Integer> res = new ArrayList<>();
		res.add(maxHeap.peek());

		if (r >= nums.length) return res.stream().mapToInt(Integer::intValue).toArray();

		while (r < nums.length) {
			maxHeap.remove(nums[l]);
			l++;

			maxHeap.offer(nums[r]);
			if (maxHeap.size() != k) {
				return new int[]{};
			}

			res.add(maxHeap.peek());
			r++;
		}
		return res.stream().mapToInt(Integer::intValue).toArray();
	}
}