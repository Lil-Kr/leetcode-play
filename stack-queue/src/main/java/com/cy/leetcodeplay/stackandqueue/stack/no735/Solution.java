package com.cy.leetcodeplay.stackandqueue.stack.no735;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: Lil-K
 * @Date: 2025/9/3
 * @Description: no.735. Asteroid Collision
 * link: https://leetcode.com/problems/asteroid-collision/description/
 *
 * todo: 未录入Anki
 * Monotonic Stack
 */
public class Solution {

	/**
	 *
	 * @param asteroids
	 * @return
	 */
	public int[] asteroidCollision(int[] asteroids) {
		Deque<Integer> stack = new ArrayDeque<>();
		int n = asteroids.length;

		for (int i = 0; i < n; i ++) {
			boolean alive = true;

			while (alive && asteroids[i] < 0 && !stack.isEmpty() && stack.peek() > 0) {
				if (stack.peek() < -asteroids[i]) {
					stack.pop();
					continue;
				} else if (stack.peek() == -asteroids[i]) {
					stack.pop();
				}
				alive = false;
			}
			if (alive) {
				stack.push(asteroids[i]);
			}
		}

		int[] res = new int[stack.size()];
		for (int i = stack.size() - 1; i >= 0; i --) {
			res[i] = stack.pop();
		}
		return res;
	}
}