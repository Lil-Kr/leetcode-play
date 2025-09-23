package com.cy.leetcodeplay.dp.no2111;

/**
 * @Author: Lil-K
 * @Date: 2025/9/22
 * @Description: no.2111. Minimum Operations to Make the Array K-Increasing
 * link: https://leetcode.com/problems/minimum-operations-to-make-the-array-k-increasing/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	private static int MAXN = 100001;
	private static int[] nums = new int[MAXN];
	private static int[] ends = new int[MAXN];

	/**
	 * solution1: dp + binary search
	 * @param arr
	 * @param k
	 * @return
	 */
	public int kIncreasing(int[] arr, int k) {
		int n = arr.length;
		int ans = 0;
		for (int i = 0, size; i < k; i ++) {
			size = 0;
			for (int j = i; j < n; j += k) {
				nums[size] = arr[j];
				size ++;
			}
			ans += size - lengthOfNoDecreasing(size);
		}
		return ans;
	}

	private int lengthOfNoDecreasing(int size) {
		int len = 0;
		for (int i = 0, find; i < size; i ++) {
			find = bs1(len, nums[i]);
			if (find == -1) {
				ends[len++] = nums[i];
			} else {
				ends[find] = nums[i];
			}
		}
		return len;
	}

	private int bs1(int len, int num) {
		int l = 0, r = len - 1, mid = -1, index = -1;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (num < ends[mid]) {
				index = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return index;
	}
}