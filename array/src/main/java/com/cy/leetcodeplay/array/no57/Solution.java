package com.cy.leetcodeplay.array.no57;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2025/4/3
 * @Description: no.57. Insert Interval
 * link: https://leetcode.com/problems/insert-interval/description/
 */
public class Solution {

	/**
	 *
	 * @param intervals
	 * @param newInterval
	 * @return:
	 */
	public int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> result = new ArrayList<>();
		if (intervals == null || intervals.length == 0) {
			return new int[][]{newInterval};
		}

		int n = intervals.length;
		int i = 0;

		while (i < n && intervals[i][1] < newInterval[0]) {
			result.add(intervals[i]);
			i++;
		}

		// 合并所有与 newInterval 重叠的区间
		while (i < n && intervals[i][0] <= newInterval[1]) {
			newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
			newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
			i++;
		}
		result.add(newInterval); // 添加合并后的新区间

		// 添加剩余的区间
		while (i < n) {
			result.add(intervals[i]);
			i++;
		}

		return result.toArray(new int[result.size()][]);
	}
}
