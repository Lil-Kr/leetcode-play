package com.cy.common.util.printtree;

/**
 * @Author: Lil-K
 * @Date: 2024/9/21
 * @Description:
 */
public class TreeNode<E extends Comparable<E>> {

	public E val;
	public TreeNode left, right;

	public TreeNode() {
		this(null,null,null);
	}

	public TreeNode(E val) {
		this(val,null,null);
	}

	public TreeNode(E val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
