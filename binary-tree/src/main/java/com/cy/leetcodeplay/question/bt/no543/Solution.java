package com.cy.leetcodeplay.question.bt.no543;

import com.cy.common.util.printtree.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/7
 * @Description: no.543. Diameter of Binary Tree
 */
public class Solution {

	private int num = 0;

	/**
	 * 后序遍历
	 * @param root
	 * @return
	 */
	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null) return 0;
		deep(root);
		return num;
	}

	private int deep(TreeNode node) {
		if (node == null) return 0;

		int l = deep(node.left);
		int r = deep(node.right);

		num = Math.max(num, l + r);
		return Math.max(l, r) + 1;
	}
}