package com.cy.leetcodeplay.binarytree.bst.no173;

import com.cy.leetcodeplay.matrix.common.entity.TreeNode;

import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/10/17
 * @Description: no.173. Binary Search Tree Iterator
 */
public class BSTIterator {

	private Stack<TreeNode> stack;

	public BSTIterator(TreeNode root) {
		stack = new Stack<>();
		pushAllLeft(root);
	}

	public int next() {
		TreeNode node = stack.pop();
		pushAllLeft(node.right);
		return node.val;
	}

	public boolean hasNext() {
		return !stack.isEmpty();
	}

	private void pushAllLeft(TreeNode node) {
		while (node != null) {
			stack.push(node);
			node = node.left;
		}
	}
}
