package com.cy.leetcodeplay.stackandqueue.stack.no144;

import com.cy.leetcodeplay.stackandqueue.classes.TreeNode;

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

	/** ================ 解法三 ================ **/

	private class Command {
		public String s;
		public TreeNode node;

		public Command(String commend, TreeNode node) {
			this.s = commend;
			this.node = node;
		}
	}

	/**
	 *
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal3(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null) return res;

		Stack<Command> stack = new Stack<>();
		stack.push(new Command("go", root));
		while (!stack.isEmpty()) {
			Command command = stack.pop();
			if (command.s.equals("print")) {
				res.add(command.node.val);
			} else {
				assert command.s.equals("go"); // 运行到这里一定要为 "go"
				if (command.node.right != null) {
					stack.push(new Command("go", command.node.right));
				}

				if (command.node.left != null) {
					stack.push(new Command("go", command.node.left));
				}

				stack.push(new Command("print", command.node));
			}
		}
		return res;
	}
}
