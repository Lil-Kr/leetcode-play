package com.cy.leetcodeplay.findtable.no560;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/9/25
 * @Description: no.560. Subarray Sum Equals K
 *
 * 前缀和
 */
public class Solution {

	/**
	 * @param nums
	 * @param k
	 * @return
	 */
	public int subarraySum(int[] nums, int k) {
		// 创建一个哈希表来存储前缀和出现的次数
		Map<Integer, Integer> prefixSumMap = new HashMap<>();
		// 初始化, 前缀和为0出现一次 (即没有元素时的前缀和), 这一步很关键
		prefixSumMap.put(0, 1);

		// 当前前缀和
		int currentSum = 0;

		// 记录满足条件的子数组数量
		int count = 0;

		// 遍历数组中的每个元素
		for (int num : nums) {
			// 累加当前的前缀和
			currentSum += num;

			// 如果当前前缀和减去k的结果存在于哈希表中, 表示有一个子数组和为k
			if (prefixSumMap.containsKey(currentSum - k)) {
				count += prefixSumMap.get(currentSum - k); // 增加满足条件的子数组个数
			}

			// 更新哈希表中当前前缀和出现的次数
			prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
		}
		return count;
	}
}