package com.cy.leetcodeplay.matrix.findtable.no454;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/9/6
 * @Description: no.454. 4Sum II
 *
 */
public class Solution {

	/**
	 * 根据数据规模, 可以将后两个数组的所有组合放到 Map 中, 并记录频次, 这里是为了记录值相同而索引不同的情况
	 * @param nums1
	 * @param nums2
	 * @param nums3
	 * @param nums4
	 * @return
	 */
	public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		Map<Integer, Integer> record = new HashMap<>();

		/**
		 * 初始化查找表
		 */
		for (int i = 0; i < nums3.length; i++) {
			for (int j = 0; j < nums4.length; j++) {
				int sum = nums3[i] + nums4[j];
				record.put(sum, record.getOrDefault(sum, 0) + 1);
			}
		}

		int res = 0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				int sum = nums1[i] + nums2[j];
				int count = record.getOrDefault(0 - sum, 0);
				if (record.getOrDefault(0 - sum, 0) > 0) {
					res += count;
				}
			}
		}

		return res;
	}
}
