package com.cy.leetcodeplay.stackandqueue.queue.no199;

import com.cy.leetcodeplay.stackandqueue.classes.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/24
 * @Description: no.199. Binary Tree Right Side View
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @return
	 */
	public List<Integer> rightSideView(TreeNode root) {
		if (root == null) return new ArrayList<>();

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);

		List<Integer> res = new ArrayList<>();
		while (!queue.isEmpty()) {
			int k = queue.size();
			for (int i = 0; i < k; i++) {
				TreeNode node = queue.poll();
				/**
				 * 1. 按照先左再右的顺序入队
				 * 2. 获取最后一个元素的值, 只有left, 就只获取left的值
				 */
				if (i + 1 == k) {
					res.add(node.val);
				}
				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}
			}
		}
		return res;
	}
}
