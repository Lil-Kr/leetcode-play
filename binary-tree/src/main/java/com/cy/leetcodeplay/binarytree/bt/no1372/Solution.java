package com.cy.leetcodeplay.binarytree.bt.no1372;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2025/10/26
 * @Description: no.1372. Longest ZigZag Path in a Binary Tree
 * link: https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	private int ans = 0;

	/**
	 * solution1: DFS
	 * @param root
	 * @return
	 */
	public int longestZigZag(TreeNode root) {
		if (root == null) return 0;
		dfs(root.left, 0, 1);
		dfs(root.right, 1, 1);
		return ans;
	}

	private void dfs(TreeNode node, int direction, int length) {
		if (node == null) return;

		ans = Math.max(ans, length);

		// last step direction is left
		if (direction == 0) {
			dfs(node.right, 1, length + 1);
			dfs(node.left, 0, 1);
		} else {
			// last step direction is right
			dfs(node.left, 0, length + 1);
			dfs(node.right, 1, 1);
		}
	}

	/**
	 * solution2:
	 * @param root
	 * @return
	 */
	public int longestZigZag2(TreeNode root) {
		if (root == null) return 0;
		// 从 root 开始, 方向随意 (0 或 1 都行), 长度从 0 开始
		dfs2(root, 0, 0);
		return ans;
	}

	private void dfs2(TreeNode node, int direction, int length) {
		if (node == null) return;

		ans = Math.max(ans, length);

		// 如果上一步是 '向左' 走的，那么下一步应该 '向右'
		dfs(node.left, 0, direction == 1 ? length + 1 : 1);
		dfs(node.right, 1, direction == 0 ? length + 1 : 1);
	}

}