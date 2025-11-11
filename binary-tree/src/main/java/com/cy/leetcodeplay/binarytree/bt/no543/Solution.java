package com.cy.leetcodeplay.binarytree.bt.no543;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/7
 * @Description: no.543. Diameter of Binary Tree
 * link: https://leetcode.com/problems/diameter-of-binary-tree/
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
		dfs(root);
		return num;
	}

	private int dfs(TreeNode node) {
		if (node == null) return 0;

		int l = dfs(node.left);
		int r = dfs(node.right);

		num = Math.max(num, l + r);
		return Math.max(l, r) + 1;
	}
}