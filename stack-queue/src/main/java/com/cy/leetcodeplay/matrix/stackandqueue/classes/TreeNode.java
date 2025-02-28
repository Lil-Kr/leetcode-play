package com.cy.leetcodeplay.matrix.stackandqueue.classes;

/**
 * @Author: Lil-K
 * @Date: 2024/9/21
 * @Description:
 */
public class TreeNode {

	public Integer val;
	public TreeNode left, right;

	public TreeNode() {
		this(null,null,null);
	}

	public TreeNode(Integer e) {
		this(e,null,null);
	}

	public TreeNode(Integer val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
