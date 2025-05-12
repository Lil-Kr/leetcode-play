package com.cy.leetcodeplay.binarytree.bt.no114;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/16
 * @Description: no.114. Flatten Binary Tree to Linked List
 * link: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 */
public class Solution {

	/**
	 *
	 * @param root
	 */
	public void flatten(TreeNode root) {
		if (root == null) return;

		flatten(root.left);
		flatten(root.right);

		TreeNode tempR = root.right;

		root.right = root.left;
		root.left = null;

		TreeNode cur = root;
		while (cur.right != null) {
			cur = cur.right;
		}
		cur.right = tempR;
	}
}
