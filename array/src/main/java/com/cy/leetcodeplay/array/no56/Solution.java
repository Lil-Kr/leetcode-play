package com.cy.leetcodeplay.array.no56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/8/30
 * @Description:
 */
public class Solution {

	public int[][] merge(int[][] intervals) {
		if (intervals.length == 1) {
			return intervals;
		}

		/**
		 * first sort
		 *
		 */
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

		List<int[]> res = new ArrayList<>();
		int[] currentInterval = intervals[0]; // init data index of 0

		for (int i = 1; i < intervals.length; i++) {
			if (currentInterval[1] >= intervals[i][0]) {
				currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
			} else {
				 // 添加当前的值
				res.add(currentInterval);
				currentInterval = intervals[i];
			}
		}

		res.add(currentInterval);
		return res.toArray(new int[res.size()][]);
	}
}
