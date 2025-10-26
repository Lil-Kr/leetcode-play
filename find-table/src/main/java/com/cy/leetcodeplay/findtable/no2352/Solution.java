package com.cy.leetcodeplay.findtable.no2352;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2025/10/25
 * @Description: no.2352. Equal Row and Column Pairs
 * link: https://leetcode.com/problems/equal-row-and-column-pairs/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: hash table
	 * @param grid
	 * @return
	 */
	public int equalPairs(int[][] grid) {
		int n = grid.length;
		Map<String, Integer> map = new HashMap<>();

		for (int[] row : grid) {
			String key = Arrays.toString(row);
			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		int count = 0;
		for (int col = 0; col < n; col ++) {
			int[] column = new int[n];
			for (int r = 0; r < n; r ++) {
				column[r] = grid[r][col];
			}
			String key = Arrays.toString(column);
			count += map.getOrDefault(key, 0);
		}
		return count;
	}
}