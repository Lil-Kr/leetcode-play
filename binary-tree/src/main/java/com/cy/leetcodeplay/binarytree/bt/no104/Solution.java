package com.cy.leetcodeplay.binarytree.bt.no104;


import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description: no.104. Maximum Depth of Binary Tree
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
		if (root == null) return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return Math.max(left, right) + 1;
	}
}