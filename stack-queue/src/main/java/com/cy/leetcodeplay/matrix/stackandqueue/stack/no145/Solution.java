package com.cy.leetcodeplay.matrix.stackandqueue.stack.no145;

import com.cy.leetcodeplay.matrix.stackandqueue.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/21
 * @Description: no.145. Binary Tree Postorder Traversal
 *
 * link: https://leetcode.com/problems/binary-tree-postorder-traversal/description/
 */
public class Solution {

	/**
	 * 后序遍历
	 * @param root
	 * @return
	 */
	public List<Integer> postorderTraversal(TreeNode root) {
		if (root == null) return new ArrayList<>();

		List<Integer> res = new ArrayList<>();
		postorderTraversal(root, res);
		return res;
	}

	private void postorderTraversal(TreeNode node, List<Integer> res) {
		if (node == null) return;

		if (node.left != null) postorderTraversal(node.left, res);
		if (node.right != null) postorderTraversal(node.right, res);
		res.add(node.val);
	}

	/**
	 * 利用栈求解
	 * @param root
	 * @return
	 */
	public List<Integer> postorderTraversal2(TreeNode root) {
		if (root == null) return new ArrayList<>();

		Stack<TreeNode> stack = new Stack<>();
		List<Integer> res = new ArrayList<>();
		TreeNode prev = null;  // 记录前一个访问的节点
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode curr = stack.peek();

			// 当前节点的左右子树都已经处理, 或当前是叶子节点, 处理当前节点
			if ((curr.left == null && curr.right == null)
					|| (prev != null && (prev == curr.left || prev == curr.right))
				) {
				res.add(curr.val);
				stack.pop();
				prev = curr;  // 标记当前节点为已访问
			} else {
				// 先将右子树压入栈, 再将左子树压入栈(因为栈是后进先出, 左子树先处理)
				if (curr.right != null) {
					stack.push(curr.right);
				}
				if (curr.left != null) {
					stack.push(curr.left);
				}
			}
		}
		return res;
	}


	/**
	 * 使用栈实现方式二
	 * @param
	 * @return:
	 */
	private class Command {
		public String s;
		public TreeNode node;

		public Command(String commend, TreeNode node) {
			this.s = commend;
			this.node = node;
		}
	}

	public List<Integer> postorderTraversal3(TreeNode root) {
		if (root == null) return new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		Stack<Command> stack = new Stack<>();
		stack.push(new Command("go", root));

		while (!stack.isEmpty()) {
			Command pop = stack.pop();
			if (pop.s.equals("print")) {
				res.add(pop.node.val);
			} else {
				assert pop.s.equals("go");
				stack.push(new Command("print", pop.node));

				if (pop.node.right != null) {
					stack.push(new Command("go", pop.node.right));
				}

				if (pop.node.left != null) {
					stack.push(new Command("go", pop.node.left));
				}

			}
		}
		return res;
	}
}