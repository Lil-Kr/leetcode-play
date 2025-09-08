package com.cy.leetcodeplay.stackandqueue.queue.no933;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2025/8/27
 * @Description: no.933. Number of Recent Calls
 * link: https://leetcode.com/problems/number-of-recent-calls/description/
 * todo: 未录入Anki
 */
public class RecentCounter {
	private Queue<Integer> queue;

	public RecentCounter() {
		queue = new LinkedList<>();
	}

	public int ping(int t) {
		queue.offer(t); // 新请求入队

		// 移除所有超过 3000 毫秒之前的请求
		while (queue.peek() < t - 3000) {
			queue.poll();
		}

		return queue.size(); // 队列大小即为区间内请求数
	}
}
