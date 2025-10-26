package com.cy.leetcodeplay.binarytree.bst.no875;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/26
 * @Description: no.875. Koko Eating Bananas
 * link: https://leetcode.com/problems/koko-eating-bananas/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1:
	 * @param piles
	 * @return
	 */
	public int minEatingSpeed(int[] piles, int h) {
		int l = 1, r = Arrays.stream(piles).max().getAsInt();
		int ans = 0, m = 0;

		// 二分
		while (l <= r) {
			m = l + ((r - l) >> 1);
			// [l ... m] 处达标, 看是否还有更小更合适的答案
			if (f1(piles, m) <= h) {
				ans = m;
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return ans;
	}

	/**
	 * @param piles
	 * @param speed
	 * @return 吃完所有的香蕉所需要的小时数
	 */
	private long f1(int[] piles, int speed) {
		long ans = 0;
		for (int pile : piles) {
			// 向上取整数
			ans += (pile + speed - 1) / speed;
		}
		return ans;
	}
}