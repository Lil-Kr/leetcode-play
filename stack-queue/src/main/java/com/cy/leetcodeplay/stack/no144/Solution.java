package com.cy.leetcodeplay.stack.no144;

import com.cy.leetcodeplay.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/21
 * @Description: no.144. Binary Tree Preorder Traversal
 * BST的前序遍历
 */
public class Solution {

	/**
	 * 解法一: 递归
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();

		preorderTraversal(root, res);
		return res;
	}

	public void preorderTraversal(TreeNode node, List<Integer> res) {
		if (node != null) {
			res.add(node.val);
			preorderTraversal(node.left, res);
			preorderTraversal(node.right, res);
		}
	}

	/**
	 * 解法二: 使用栈
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal2(TreeNode root) {
		if (root == null) return new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> res = new ArrayList<>();

		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			res.add(node.val);

			if (node.right != null) {
				stack.push(node.right);
			}

			if (node.left != null) {
				stack.push(node.left);
			}
		}
		return res;
	}
}
