package com.cy.leetcodeplay.binarytree.bst.no700;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2025/9/2
 * @Description: no.700. Search in a Binary Search Tree
 * link: https://leetcode.com/problems/search-in-a-binary-search-tree/description/
 */
public class Solution {

	/**
	 * bst search
	 * @param root
	 * @param val
	 * @return
	 */
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) return null;
		if (root.val == val) {
			return root;
		} else if (val < root.val) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}
	}
}