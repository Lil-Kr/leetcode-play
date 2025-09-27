package com.cy.leetcodeplay.dp1.no646;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/22
 * @Description: no.646. Maximum Length of Pair Chain
 * link: https://leetcode.com/problems/maximum-length-of-pair-chain/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: dp + binary search
	 * @param pairs
	 * @return
	 */
	public int findLongestChain(int[][] pairs) {
		int n = pairs.length;
		Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
		int[] ends = new int[n];
		int len = 0;
		for (int i = 0, find; i < n; i ++) {
			find = bs1(ends, len, pairs[i][0]);
			if (find == -1) {
				ends[len] = pairs[i][1];
				len ++;
			} else {
				ends[find] = Math.min(ends[find], pairs[i][1]);
			}
		}
		return len;
	}

	/**
	 * find >= pairs[i][0] position
	 * @param ends
	 * @param len
	 * @param num
	 * @return
	 */
	private int bs1(int[] ends, int len, int num) {
		int l = 0, r = len - 1, mid = -1, index = -1;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (ends[mid] >= num) {
				index = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return index;
	}

	/**
	 * solution2: greedy
	 * best way
	 * @param pairs
	 * @return
	 */
	public int findLongestChain2(int[][] pairs) {
		int pre = Integer.MIN_VALUE, ans = 0;
		Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
		for (int[] pair : pairs) {
			if (pre < pair[0]) {
				pre = pair[1];
				ans++;
			}
		}
		return ans;
	}
}