package com.cy.leetcodeplay.question.bst.no530;

import com.cy.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/17
 * @Description: no.530. Minimum Absolute Difference in BST
 */
public class Solution {

	private int minAbsVal = Integer.MAX_VALUE;
	private TreeNode prev = null;

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
