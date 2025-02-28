package com.cy.leetcodeplay.matrix.binarytree.bt.no110;

import com.cy.leetcodeplay.matrix.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description: no.110. Balanced Binary Tree
 */
public class Solution {

	/**
	 * 递归
	 * @param root
	 * @return
	 */
	public boolean isBalanced(TreeNode root) {
		return checkHeight(root) != -1;
	}

	private int checkHeight(TreeNode node) {
		if (node == null) return 0;

		// 递归检查左子树的高度
		int leftHeight = checkHeight(node.left);
		if (leftHeight == -1) return -1; // 左子树不平衡, 返回-1

		// 递归检查右子树的高度
		int rightHeight = checkHeight(node.right);
		if (rightHeight == -1) return -1; // 右子树不平衡, 返回-1

		// 检查当前节点是否平衡
		if (Math.abs(leftHeight - rightHeight) > 1) return -1; // 高度差超过1, 不平衡

		// 返回当前节点的高度
		return Math.max(leftHeight, rightHeight) + 1;
	}

}
