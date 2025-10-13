package com.cy.leetcodeplay.dpoptimizeenumeration.no1235;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/13
 * @Description: no.1235. Maximum Profit in Job Scheduling
 * link: https://leetcode.com/problems/maximum-profit-in-job-scheduling/
 *
 * todo: 未录入Anki
 */
public class Solution {

//	private static int maxn = (int)Math.pow(10, 4) * 5 + 1;
//	private static int[][] jobs = new int[maxn][3];
//	private static int[] dp = new int[maxn];

	/**
	 *
	 * @param startTime
	 * @param endTime
	 * @param profit
	 * @return
	 */
	public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
		int n = startTime.length;
		int[][] jobs = new int[n][3];

		for (int i = 0; i < n; i ++) {
			jobs[i][0] = startTime[i];
			jobs[i][1] = endTime[i];
			jobs[i][2] = profit[i];
		}

		Arrays.sort(jobs, (a, b) -> a[1] - b[1]);

		int[] dp = new int[n];
		dp[0] = jobs[0][2];

		for (int i = 1, start; i < n; i ++) {
			start = jobs[i][0];
			dp[i] = jobs[i][2];
			// 从 0 开始, 枚举机算所有的工作收益
			if (jobs[0][1] <= start) {
				dp[i] += dp[find(i - 1, start, jobs)];
			}
			dp[i] = Math.max(dp[i], dp[i - 1]);
		}
		return dp[n - 1];
	}

	// jobs[0 ... i]范围上, 找到结束时间 <= start, 最右的下标
	private int find(int i, int start, int[][] jobs) {
		int l = 0, r = i, mid, index = 0;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (jobs[mid][1] <= start) {
				index = mid;
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return index;
	}
}