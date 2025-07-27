package com.cy.leetcodeplay.binarytree.bt.no124;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/14
 * @Description: no.124. Binary Tree Maximum Path Sum
 *
 * 1. 后序遍历树：
 *    * 对于每一个节点，计算以它为根的 单边最大路径和（只选择左子树或右子树其中之一，或者不选），以及 全局最大路径和（既可以左子树，也可以右子树，同时加上当前节点的值）.
 * 2. 递归函数：
 *    * 返回经过当前节点的单边最大路径和，也就是当前节点可以提供给它的父节点的最大贡献值.
 *    * 同时在递归过程中，更新全局最大路径和.
 * 3. 路径和的定义：
 *    1. 单边最大路径和：通过当前节点的单侧路径和，即 max(左子树路径和, 右子树路径和, 0)，表示我们可以选择当前节点以及左/右子树的某一侧，或者不选择任何子树.
 *    2. 全局最大路径和：当前节点的值 + 左子树路径和 + 右子树路径和，这表示路径经过当前节点时，可以选择连接左右子树.
 */
public class Solution {

	private int maxSum = Integer.MIN_VALUE; // 用于存储最大路径和
	/**
	 * 后序遍历
	 * @param root
	 * @return
	 */
	public int maxPathSum(TreeNode root) {
		if (root == null) return 0;

		dfs(root);
		return maxSum;
	}

	private int dfs(TreeNode node) {
		if (node == null) return 0;

		int l = Math.max(dfs(node.left), 0);
		int r = Math.max(dfs(node.right), 0); // -->

		// 更新当前最大路径和（左 + 右 + 当前）
		int currentPathSum = node.val + l + r;
		maxSum = Math.max(maxSum, currentPathSum);

		// 返回当前子树的最大贡献值，供父节点选择
		return node.val + Math.max(l, r);
	}

}