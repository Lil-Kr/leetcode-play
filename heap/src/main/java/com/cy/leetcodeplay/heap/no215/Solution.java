package com.cy.leetcodeplay.heap.no215;

import com.cy.leetcodeplay.common.util.CommonUtil;

import java.util.Random;

/**
 * @Author: Lil-K
 * @Date: 2024/4/10
 * @Description: 215. Kth Largest Element in an Array
 *  使用单路快排, 占用内存比较大, 耗时, 处理大量重复元素会有严重倾斜问题
 *  使用双路快排, 能解决问题, 但还是占用了大量内存, 在加入随机化处理时, 占用内存下降一些
 *  三路快排:
 *      不适用排序
 */
public class Solution {

	public static int findKthLargest(int[] nums, int k) {
		int left = 0, right = nums.length - 1;
		Random rand = new Random();
		while (true) {
			int p = left + rand.nextInt(right - left + 1);
			int newPivotIndex = partition(nums, left, right, p);
			if (newPivotIndex == nums.length - k) {
				return nums[newPivotIndex];
			} else if (newPivotIndex > nums.length - k) {
				right = newPivotIndex - 1;
			} else {
				left = newPivotIndex + 1;
			}
		}
	}

	private static int partition(int[] nums, int left, int right, int p) {
		/**
		 * 固定标定点的元素
		 */
		int pivot = nums[p];

		CommonUtil.swap(nums, p, right);
		int storedIndex = left;
		for (int i = left; i < right; i++) {
			if (nums[i] < pivot) {
				CommonUtil.swap(nums, i, storedIndex);
				storedIndex++;
			}
		}
		CommonUtil.swap(nums, right, storedIndex);
		return storedIndex;
	}
}
