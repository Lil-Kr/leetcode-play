package com.cy.leetcodeplay.question.no98;

import com.cy.common.util.printtree.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/14
 * @Description: no.98. Validate Binary Search Tree
 */
public class Solution {

	private TreeNode prev = null;

	/**
	 * 中序遍历
	 * @param root
	 * @return
	 */
	public boolean isValidBST(TreeNode root) {
		return inOrder(root);
	}

	private boolean inOrder(TreeNode node) {
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
	 * 解法二: 中序遍历
	 * @param root
	 * @return
	 */
	public boolean isValidBST2(TreeNode root) {
		return isValidBST2(root, null, null);
	}

	private boolean isValidBST2(TreeNode node, Integer lower, Integer upper) {
		if (node == null) {
			return true; // 空树是合法的二叉搜索树
		}

		int val = node.val;

		// 检查当前节点是否满足上下界的限制
		if (lower != null && val <= lower) {
			return false;
		}
		if (upper != null && val >= upper) {
			return false;
		}

		// 递归检查左子树和右子树
		if (!isValidBST2(node.left, lower, val)) {
			return false;
		}
		if (!isValidBST2(node.right, val, upper)) {
			return false;
		}

		return true;
	}
}