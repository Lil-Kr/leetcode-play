package com.cy.leetcodeplay.dpmaxsubarraysum.no689;

/**
 * @Author: Lil-K
 * @Date: 2025/10/19
 * @Description: no.689. Maximum Sum of 3 Non-Overlapping Subarrays
 * link: https://leetcode.com/problems/maximum-sum-of-3-non-overlapping-subarrays/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: dp
	 * @param nums
	 * @param k
	 * @return
	 */
	public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
		int n = nums.length;
		int[] sums = new int[n];
		for (int l = 0, r = 0, sum = 0; r < n; r ++) {
			sum += nums[r];
			// 维护窗口
			if (r - l + 1 == k) {
				sums[l] = sum;
				sum -= nums[l];
				l ++;
			}
		}

		/**
		 * prefix[i]: [0 .. i] 范围上所有长度为k的子数组中, 拥有最大累加和的子数组的开头位置是哪里
		 * 这部分为dp的方式求解
		 * 如果 k = 3; --> prefix[0 ... 2] 的值都为 0, 从 prefix[k] 开始填值
		 * prefix[3] = prefix[i - 1]
		 *
		 * l = 1 开始: 因为 sums[0] 与 sums[prefix[3 - 1]] 是相等的, 无意义
		 */
		int[] prefix = new int[n];
		for (int l = 1, r = k; r < n; l ++, r ++) {
			// > 而不是 >=, 因为题目要求返回结果较小的位置
			if (sums[l] > sums[prefix[r - 1]]) {
				prefix[r] = l;
			} else {
				prefix[r] = prefix[r - 1];
			}
		}

		/**
		 * suffix[i]: [0 ... i]
		 */
		int[] suffix = new int[n];
		suffix[n - k] = n - k;
		for (int l = n - k - 1; l >= 0; l --) {
			if (sums[l] >= sums[suffix[l + 1]]) {
				suffix[l] = l;
			} else {
				suffix[l] = suffix[l + 1];
			}
		}

		/**
		 * 左部分: [0 ... i - 1]
		 * 中间: [i ... j]
		 * 右部分: [j + 1 ... n - 1]
		 */
		int a = 0, b = 0, c = 0, max = 0;
		for (int i = k, j = 2 * k - 1, p, s, sum; j < n - k; i ++, j ++) {
			p = prefix[i - 1];
			s = suffix[j + 1];
			sum = sums[p] + sums[i] + sums[s];
			if (sum > max) {
				max = sum;
				a = p;
				b = i;
				c = s;
			}
		}
		return new int[]{a, b, c};
	}
}