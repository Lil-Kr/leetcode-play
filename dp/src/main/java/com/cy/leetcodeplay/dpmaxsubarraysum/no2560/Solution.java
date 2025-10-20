package com.cy.leetcodeplay.dpmaxsubarraysum.no2560;

/**
 * @Author: Lil-K
 * @Date: 2025/9/17
 * @Description: no.2560. House Robber IV
 * link: https://leetcode.com/problems/house-robber-iv/description/
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
	public int minCapability(int[] nums, int k) {
		int n = nums.length;
		/**
		 * int max = Arrays.stream(nums).max().getAsInt();
		 * int min = Arrays.stream(nums).min().getAsInt();
		 */
		int l = nums[0], r = nums[0];
		for (int i = 1; i < n; i ++) {
			l = Math.min(l, nums[i]);
			r = Math.max(r, nums[i]);
		}

		int mid, ans = 0;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (f1(nums, n, mid) >= k) {
				ans = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return ans;
	}

	private int f1(int[] nums, int n, int ability) {
		if (n == 1) return nums[0] <= ability ? 1 : 0;

		if (n == 2) return (nums[0] <= ability || nums[1] <= ability) ? 1 : 0;

		int[] dp = new int[n];
		dp[0] = nums[0] <= ability ? 1 : 0;
		dp[1] = (nums[0] <= ability || nums[1] <= ability) ? 1 : 0;
		for (int i = 2; i < n; i ++) {
			dp[i] = Math.max(dp[i - 1], (nums[i] <= ability ? 1 : 0) + dp[i - 2]);
		}
		return dp[n - 1];
	}

	/**
	 * solution2: dp + space compression
	 * @param nums
	 * @param k
	 * @return
	 */
	public int minCapability2(int[] nums, int k) {
		int n = nums.length;
		/**
		 * int max = Arrays.stream(nums).max().getAsInt();
		 * int min = Arrays.stream(nums).min().getAsInt();
		 */
		int l = nums[0], r = nums[0];
		for (int i = 1; i < n; i ++) {
			l = Math.min(l, nums[i]);
			r = Math.max(r, nums[i]);
		}

		int mid, ans = 0;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (f2(nums, n, mid) >= k) {
				ans = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return ans;
	}

	private int f2(int[] nums, int n, int ability) {
		if (n == 1) return nums[0] <= ability ? 1 : 0;
		if (n == 2) return (nums[0] <= ability || nums[1] <= ability) ? 1 : 0;

		int prepre = nums[0] <= ability ? 1 : 0;
		int pre = (nums[0] <= ability || nums[1] <= ability) ? 1 : 0;
		for (int i = 2, cur; i < n; i ++) {
			cur = Math.max(pre, (nums[i] <= ability ? 1 : 0) + prepre);
			prepre = pre;
			pre = cur;
		}
		return pre;
	}

	/**
	 * solution3: greedy
	 * @param nums
	 * @param k
	 * @return
	 */
	public int minCapability3(int[] nums, int k) {
		int n = nums.length;
		/**
		 * int max = Arrays.stream(nums).max().getAsInt();
		 * int min = Arrays.stream(nums).min().getAsInt();
		 */
		int l = nums[0], r = nums[0];
		for (int i = 1; i < n; i ++) {
			l = Math.min(l, nums[i]);
			r = Math.max(r, nums[i]);
		}

		int mid, ans = 0;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (f3(nums, n, mid) >= k) {
				ans = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return ans;
	}

	public int f3(int[] nums, int n, int ability) {
		int ans = 0;
		for (int i = 0; i < n; i ++) {
			if (nums[i] <= ability) {
				ans ++;
				// 有能力偷时, 再次 i ++, 因为题目要求为偷间隔房间
				i ++;
			}
		}
		return ans;
	}

}