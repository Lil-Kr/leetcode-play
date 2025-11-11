package com.cy.leetcodeplay.binarytree.bst.no669;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2025/11/11
 * @Description: no.669. Trim a Binary Search Tree
 * link: https://leetcode.com/problems/trim-a-binary-search-tree/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param root
	 * @param low
	 * @param high
	 * @return
	 */
	public TreeNode trimBST(TreeNode root, int low, int high) {
		if (root == null) return null;

		if (root.val < low) {
			return trimBST(root.right, low, high);
		}
		if (root.val > high) {
			return trimBST(root.left, low, high);
		}

		root.left = trimBST(root.left, low, high);
		root.right = trimBST(root.right, low, high);
		return root;
	}
}