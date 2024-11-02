package com.cy.leetcodeplay.stackandqueue.stack.no145;

import com.cy.leetcodeplay.stackandqueue.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/21
 * @Description: no.145. Binary Tree Postorder Traversal
 * 解法二:
 * 利用指令步骤模拟出栈调用关系
 */
public class Solution2 {

	private class Command {
		public String s;
		public TreeNode node;

		public Command(String commend, TreeNode node) {
			this.s = commend;
			this.node = node;
		}
	}

	/**
	 * 使用栈实现方式二
	 * @param root
	 * @return:
	 */
	public List<Integer> postorderTraversal(TreeNode root) {
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
