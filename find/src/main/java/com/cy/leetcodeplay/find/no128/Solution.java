package com.cy.leetcodeplay.find.no128;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Lil-K
 * @Date: 2024/9/7
 * @Description: no.128. Longest Consecutive Sequence
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @return
	 */
	public int longestConsecutive(int[] nums) {
		Set<Integer> res = new HashSet<>();

		for (int num : nums) {
			res.add(num);
		}

		int longestStreak = 0;

		for (int num : res) {
			/**
			 * 只有当 num 是序列的起始点时才开始计算
			 * 检查还有没有比 num 更小的元素
			 */
			if (!res.contains(num - 1)) {
				int currentNum = num; //
				int currentStreak = 1; // 记录连续字符串的长度

				// 继续向上查找连续的数字
				while (res.contains(currentNum + 1)) {
					currentNum++;
					currentStreak++;
				}

				// 更新最长序列长度
				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}
		return longestStreak;
	}
}
