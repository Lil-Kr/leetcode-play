package com.cy.leetcodeplay.find.no349;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: Lil-K
 * @Date: 2024/9/4
 * @Description:
 */
public class Solution {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> res1 = new TreeSet<>();
		for (int i = 0; i < nums1.length; i++) {
			res1.add(nums1[i]);
		}

		Set<Integer> res2 = new TreeSet<>();
		for (int i = 0; i < nums2.length; i++) {
			if (res1.contains(nums2[i])) {
				res2.add(nums2[i]);
			}
		}
		return res2.stream().mapToInt(Integer::intValue).toArray();
	}
}
