package com.cy.leetcodeplay.array.no605;

/**
 * @Author: Lil-K
 * @Date: 2025/8/24
 * @Description: no.605. Can Place Flowers
 * https://leetcode.com/problems/can-place-flowers/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param flowerbed
	 * @param n
	 * @return
	 */
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int len = flowerbed.length;

		for (int i = 0; i < len; i++) {
			if (flowerbed[i] == 0) {
				boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
				boolean rightEmpty = (i == len - 1) || (flowerbed[i + 1] == 0);

				if (leftEmpty && rightEmpty) {
					flowerbed[i] = 1; // 种花
					n--;
					if (n == 0) return true; // 提前返回
				}
			}
		}

		return n <= 0;
	}
}