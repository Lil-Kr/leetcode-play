package com.cy.leetcodeplay.find.no350;

import java.util.*;

/**
 * @Author: Lil-K
 * @Date: 2024/9/4
 * @Description:
 */
public class Solution {

	/**
	 * 解法一
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1.length < 1 || nums2.length < 1) return new int[]{};

		Map<Integer, Integer> map1 = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
		}

		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < nums2.length; i++) {
			if (map1.containsKey(nums2[i]) && map1.getOrDefault(nums2[i], 0) > 0) {
				res.add(nums2[i]);
				map1.put(nums2[i], map1.getOrDefault(nums2[i], 0) - 1);
			}
		}

		return res.stream().mapToInt(Integer:: intValue).toArray();
	}

	/**
	 * 解法二: 双指针, 在leetcode平台上性能更好
	 * 1. 先排序
	 * 2. 双指针比较
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersect2(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i = 0, j = 0;
		List<Integer> res = new ArrayList<>();

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				res.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}

		// Convert List to int[]
		int[] result = new int[res.size()];
		for (int k = 0; k < res.size(); k++) {
			result[k] = res.get(k);
		}

		return result;
	}

}
