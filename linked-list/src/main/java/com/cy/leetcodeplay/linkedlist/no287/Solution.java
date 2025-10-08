package com.cy.leetcodeplay.linkedlist.no287;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Lil-K
 * @Date: 2024/9/14
 * @Description: no.287. Find the Duplicate Number
 */
public class Solution {

	/**
	 * 解法一: 性能慢一些
	 * @param nums
	 * @return:
	 */
	public int findDuplicate(int[] nums) {
		Set<Integer> res = new HashSet<>();

		for (int num : nums) {
			if (res.contains(num)) {
				return num;
			}
			res.add(num);
		}
		return 0;
	}

	/**
	 * solution2: 利用链表环的概念
	 * @param nums
	 * @return:
	 */
	public int findDuplicate2(int[] nums) {
		int slow = nums[0];
		int fast = nums[nums[0]];

		while (slow != fast) {
			slow = nums[slow];
			fast = nums[nums[fast]];
		}

		/**
		 * 找到环的入口
		 */
		fast = 0;
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
	}
}
