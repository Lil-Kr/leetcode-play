package com.cy.leetcodeplay.dplis.luogu.no5;

/**
 * @Author: Lil-K
 * @Date: 2025/10/22
 * @Description:
 * 题目: 有一次修改机会的最长不降子序列
 *  给定一个长度为n的数组, 和一个整数k
 *  只有一次机会可以讲其中连续的k个数全修改成任意一个值
 *  这次机会你可以用也可以不用, 请返回最长不降子序列长度
 *  1 <= k, n <= 10^5
 *  1 <= arr[i] <= 10^6
 *
 *  link: https://www.luogu.com.cn/problem/P8776
 *
 * todo: 未录入Anki
 */
public class Solution {

	private static int max = (int) Math.pow(10, 5) + 1;
	private static int[] right = new int[max];

	/**
	 * solution1:
	 * @return
	 */
	public int lengthOfLIS(int[] nums, int k) {
		int n = nums.length;
		int len = 0;
		int ans = 0;

		for (int i = 0, j = k, find, left; j < n; i ++, j ++) {
			find = bs(len, nums[j]);
			left = find == -1 ? len : find;
			ans = Math.max(ans, left + k + right[j]);
		}

		return 0;
	}

	private int bs(int len, int num) {
		return 0;
	}
}