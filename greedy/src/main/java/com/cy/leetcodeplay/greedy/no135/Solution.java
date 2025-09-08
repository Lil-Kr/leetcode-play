package com.cy.leetcodeplay.greedy.no135;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/8/18
 * @Description: no.135. Candy
 * link: https://leetcode.com/problems/candy/description/
 * todo: 未录入Anki
 */
public class Solution {

	public int candy(int[] ratings) {
		int n = ratings.length;
		int[] candies = new int[n];

		// Step 1: 每人至少 1 颗
		Arrays.fill(candies, 1);

		// Step 2: 从左到右
		for (int i = 1; i < n; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candies[i] = candies[i - 1] + 1;
			}
		}

		// Step 3: 从右到左
		for (int i = n - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				candies[i] = Math.max(candies[i], candies[i + 1] + 1);
			}
		}

		// Step 4: 累加
		int total = 0;
		for (int c : candies) {
			total += c;
		}
		return total;
	}
}