package com.cy.leetcodeplay.question.bt.no404;

import com.cy.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/28
 * @Description: no.404. Sum of Left Leaves
 */
public class Solution {

	/**
	 * 递归
	 * 不用管右边的树结构
	 * @param root
	 * @return
	 */
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) return 0;
		if (root.left == null && root.right == null) return 0;

		int sum = 0;
		/**
		 * 判断 root.left.left == null && root.left.right == null
		 * 这一步很关键
		 */
		if (root.left != null && root.left.left == null && root.left.right == null) {
			sum += root.left.val;
		}

		sum += sumOfLeftLeaves(root.left);
		sum += sumOfLeftLeaves(root.right);
		return sum;
	}
}