package com.cy.leetcodeplay.question.bt.no112;

import com.cy.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/28
 * @Description: no.112. Path Sum
 */
public class Solution {

	/**
	 * 递归
	 * @param root
	 * @param targetSum
	 * @return
	 */
	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) return false;
		if (root.left == null && root.right == null) return root.val == targetSum;

		if (hasPathSum(root.left, targetSum - root.val)) return true;

		if (hasPathSum(root.right, targetSum - root.val)) return true;

		return false;
	}
}