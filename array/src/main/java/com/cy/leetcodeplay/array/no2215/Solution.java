package com.cy.leetcodeplay.array.no2215;

import java.util.*;

/**
 * @Author: Lil-K
 * @Date: 2025/8/25
 * @Description: no.2215. Find the Difference of Two Arrays
 * link: https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
 * todo: 未录入Anki
 */
public class Solution {

	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		Set<Integer> freq1 = new HashSet<>();
		Set<Integer> freq2 = new HashSet<>();

		for (int num : nums1)
			freq1.add(num);

		for (int num : nums2)
			freq2.add(num);

		List<Integer> res1 = new ArrayList<>();
		List<Integer> res2 = new ArrayList<>();

		for (int num : freq1) {
			if (!freq2.contains(num)) {
				res1.add(num);
			}
		}

		for (int num : freq2) {
			if (!freq1.contains(num)) {
				res2.add(num);
			}
		}

		return Arrays.asList(res1, res2);
	}
}