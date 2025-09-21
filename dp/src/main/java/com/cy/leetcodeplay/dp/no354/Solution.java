package com.cy.leetcodeplay.dp.no354;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/21
 * @Description: no.354. Russian Doll Envelopes
 * link: https://leetcode.com/problems/russian-doll-envelopes/description/
 *
 * todo: 未录入Anki
 * seams like no.300
 */
public class Solution {

	/**
	 * solution1: dp + binary search
	 * @param envelopes
	 * @return
	 */
	public int maxEnvelopes(int[][] envelopes) {
		int n = envelopes.length;
		Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
		int[] ends = new int[n];
		int len = 0;
		for (int i = 0, find, num; i < n; i ++) {
			num = envelopes[i][1];
			find = bs1(ends, len, num);
			if (find == -1) {
				ends[len] = num;
				len ++;
			} else {
				ends[find] = num;
			}
		}
		return len;
	}

	private int bs1(int[] ends, int len, int num) {
		int l = 0, r = len - 1, mid = -1, index = -1;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (num <= ends[mid]) {
				r = mid - 1;
				index = mid;
			} else {
				l = mid + 1;
			}
		}
		return index;
	}
}