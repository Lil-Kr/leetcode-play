package com.cy.leetcodeplay.binarytree.bst.no783;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/16
 * @Description: no.783. Minimum Distance Between BST Nodes
 *
 */
public class Solution {

	private int min = Integer.MAX_VALUE;
	private TreeNode prev = null;

	/**
	 * 中序遍历, 得到一个顺序的数组
	 * @param root
	 * @return
	 */
	public int minDiffInBST(TreeNode root) {
		if (root == null) return 0;
		inOrder(root);
		return min;
	}

	private void inOrder(TreeNode node) {
		if (node == null) return;

		inOrder(node.left);
		/**
		 * 根节点.val - prev.val
		 */
		if (prev != null) {
			min = Math.min(min, node.val - prev.val);
		}

		/**
		 * 这一步等同于移动指针
		 */
		prev = node;
		inOrder(node.right);
	}
}