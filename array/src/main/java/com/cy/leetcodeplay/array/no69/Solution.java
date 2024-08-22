package com.cy.leetcodeplay.array.no69;

/**
 * @Author: Lil-K
 * @Date: 2024/8/22
 * @Description:
 */
public class Solution {
	public int mySqrt(int x) {
		if (x < 2) return x;

		int l = 2, r = x / 2;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			long res = (long) mid * (long) mid;
			if (res == x) {
				return mid;
			} else if (res < x) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return r;
	}
}
