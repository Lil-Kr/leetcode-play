package com.cy.leetcodeplay.greedy.no435;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/4/7
 * @Description: no.435. Non-overlapping Intervals
 * link: https://leetcode.com/problems/non-overlapping-intervals/
 */
public class Solution {

	/**
	 * 1. 先排序
	 * @param intervals
	 * @return
	 */
	public int eraseOverlapIntervals(int[][] intervals) {
		if (intervals.length == 0) return 0;
		// 以结尾排序
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
		int count = 1; // 至少选中一个区间
		int end = intervals[0][1];

		for (int i = 1; i < intervals.length; i++) {
			// 不重叠
			if (intervals[i][0] >= end) {
				count++;
				end = intervals[i][1];
			}
		}

		// 总的区间数 - 最多可选不重叠区间数 = 最少移除的区间数
		return intervals.length - count;
	}


}