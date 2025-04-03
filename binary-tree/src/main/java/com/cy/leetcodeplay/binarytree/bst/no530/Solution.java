package com.cy.leetcodeplay.binarytree.bst.no530;

import com.cy.leetcodeplay.matrix.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/17
 * @Description: no.530. Minimum Absolute Difference in BST
 *
 * 中序遍历
 */
public class Solution {

	private int minAbsVal = Integer.MAX_VALUE;
	private TreeNode prev = null;

	/**
	 *
	 * @param root
	 * @return
	 */
	public int getMinimumDifference(TreeNode root) {
		if (root == null) return 0;
		inOrder(root);
		return minAbsVal;
	}

	private void inOrder(TreeNode node) {
		if (node == null) return;

		inOrder(node.left);

		if (prev != null) {
			minAbsVal = Math.min(minAbsVal, Math.abs(prev.val - node.val));
		}

		prev = node;
		inOrder(node.right);
	}
}
