package com.cy.leetcodeplay.binarytree.bt.no110;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description: no.110. Balanced Binary Tree
 * link: https://leetcode.com/problems/balanced-binary-tree/
 */
public class Solution {

	/**
	 * solution1: dfs
	 * @param root
	 * @return
	 */
	public boolean isBalanced(TreeNode root) {
		return dfs(root) != -1;
	}

	private int dfs(TreeNode node) {
		if (node == null) return 0;

		// 递归检查左子树的高度
		int l = dfs(node.left);
		// 递归检查右子树的高度
		int r = dfs(node.right);

		// 检查当前节点是否平衡
		if (Math.abs(l - r) > 1) return -1; // 高度差超过1, 不平衡

		// 返回当前节点的高度
		return Math.max(l, r) + 1;
	}

}
