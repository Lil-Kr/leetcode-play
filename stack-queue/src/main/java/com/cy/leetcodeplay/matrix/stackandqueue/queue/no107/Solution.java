package com.cy.leetcodeplay.matrix.stackandqueue.queue.no107;

import com.cy.leetcodeplay.matrix.stackandqueue.classes.TreeNode;

import java.util.*;

/**
 * @Author: Lil-K
 * @Date: 2024/9/24
 * @Description: no.107. Binary Tree Level Order Traversal II
 *
 * 自底向上层序遍历
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @return
	 */
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null) return new ArrayList<>();

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);

		List<List<Integer>> res = new ArrayList<>();
		Stack<List<Integer>> stack = new Stack<>();
		while (!queue.isEmpty()) {
			int k = queue.size();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < k; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}
			}

			if (list.size() > 0) stack.push(list);
		}

		while (!stack.isEmpty()) {
			res.add(stack.pop());
		}
		return res;
	}
}