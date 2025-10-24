package com.cy.leetcodeplay.greedy.no630;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Author: Lil-K
 * @Date: 2025/10/24
 * @Description: no.630. Course Schedule III
 * link: https://leetcode.com/problems/course-schedule-iii/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: greedy
	 * O(n * logn)
	 * @param courses
	 * @return
	 */
	public int scheduleCourse(int[][] courses) {
		Arrays.sort(courses, (a, b) -> a[1] - b[1]);
		PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
		int time = 0;
		for (int[] course : courses) {
			if (time + course[0] <= course[1]) {
				heap.offer(course[0]);
				time += course[0];
			} else {
				if (!heap.isEmpty() && heap.peek() > course[0]) {
					time += course[0] - heap.poll();
					heap.offer(course[0]);
				}
			}
		}
		return heap.size();
	}
}