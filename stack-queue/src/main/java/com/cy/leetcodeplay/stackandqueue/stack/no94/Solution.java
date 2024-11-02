package com.cy.leetcodeplay.stackandqueue.stack.no94;

import com.cy.leetcodeplay.stackandqueue.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/21
 * @Description: no.94. Binary Tree Inorder Traversal
 */
public class Solution {

	/**
	 * 解法一: 递归
	 * @param root
	 * @return
	 */
	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null) return new ArrayList<>();

		List<Integer> res = new ArrayList<>();
		inorderTraversal(root, res);
		return res;
	}

	/**
	 *
	 * @param node
	 * @param res
	 */
	private void inorderTraversal(TreeNode node, List<Integer> res) {
		if (node == null) return;

		inorderTraversal(node.left, res);
		res.add(node.val);
		inorderTraversal(node.right, res);
	}

	/**
	 * 解法二: 递归
	 * @param root
	 * @return
	 */
	public List<Integer> inorderTraversal2(TreeNode root) {
		if (root == null) return new ArrayList<>();

		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;
		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}

			// 处理当前节点
			current = stack.pop();
			res.add(current.val);

			// 遍历右子树
			current = current.right;
		}
		return res;
	}
}