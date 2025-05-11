package com.cy.leetcodeplay.binarytree.bt.no108;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: no.108. Convert Sorted Array to Binary Search Tree
 * link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 */
public class Solution {

	/**
	 * 通过递归构建
	 * @param nums
	 * @return
	 */
	public TreeNode sortedArrayToBST(int[] nums) {
		return buildTree(nums, 0, nums.length - 1);
	}

	private TreeNode buildTree(int[] nums, int l, int r) {
		if (l > r) {
			return null; // 基础情况: 如果左索引大于右索引, 返回 null
		}

		int mid = l + (r - l) / 2;
		TreeNode root = new TreeNode(nums[mid]);

		// 递归构建左子树和右子树1
		root.left = buildTree(nums, l, mid - 1);
		root.right = buildTree(nums, mid + 1, r);

		return root;
	}
}
