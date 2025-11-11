package com.cy.leetcodeplay.binarytree.bst.no98;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/14
 * @Description: no.98. Validate Binary Search Tree
 * link: https://leetcode.com/problems/validate-binary-search-tree
 */
public class Solution {

	private TreeNode prev = null;

	/**
	 * solution1: in-order
	 * @param root
	 * @return
	 */
	public boolean isValidBST(TreeNode root) {
		return inOrder(root);
	}

	private boolean inOrder(TreeNode node) {
		// 这个判断条件很关键
		if (node == null) return true;

		// 递归遍历左子树
		if (!inOrder(node.left)) return false;

		/**
		 * 检查当前节点是否比前一个节点大(严格递增)
		 * 右子树的元素 <= 根节点元素
		 */
		if (prev != null && node.val <= prev.val) {
			return false;
		}

		/**
		 * 更新前一个节点为当前节点
		 */
		prev = node;

		// 递归遍历右子树
		return inOrder(node.right);
	}

	/**
	 * solution2: queue + in-order
	 * @param root
	 * @return
	 */
	public boolean isValidBST2(TreeNode root) {
		if (root == null) return true;
		return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean validate(TreeNode node, long left, long right) {
		if (node == null) return true;
		if (node.val <= left || node.val >= right) return false;

		return validate(node.left, left, node.val) && validate(node.right, node.val, right);
	}
}