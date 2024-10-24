package com.cy.leetcodeplay.binarytree.bst.no235;

import com.cy.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/16
 * @Description: no. 235. Lowest Common Ancestor of a Binary Search Tree
 *
 * 公共 root的情况为以下
 *  1. p q 其中一个就是公共root
 *  2.
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @param p
	 * @param q
	 * @return
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		assert (p != null && q != null);

		/**
		 * p.val < root.val && q.val < root.val
		 * 递归遍历左子树
		 */
		if (p.val < root.val && q.val < root.val)
			return lowestCommonAncestor(root.left, p, q);

		/**
		 * p.val > root.val && q.val > root.val
		 * 递归遍历右子树
		 */
		if (p.val > root.val && q.val > root.val)
			return lowestCommonAncestor(root.right, p, q);

		/**
		 * 最后一种情况: q < root, p > root 或者 q > root, p < root
		 */
		return root;
	}
}