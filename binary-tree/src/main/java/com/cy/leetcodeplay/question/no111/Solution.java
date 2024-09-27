package com.cy.leetcodeplay.question.no111;


import com.cy.common.util.printtree.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description: no.111. Minimum Depth of Binary Tree
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @return
	 */
	public int minDepth(TreeNode root) {
		if (root == null) return 0;

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		int depth = 1;
		while (!queue.isEmpty()) {
			int time = queue.size();
			for (int i = 0; i < time; i++) {
				TreeNode node = queue.poll();

				// 如果遇到叶子节点, 直接返回当前深度
				if (node.left == null && node.right == null) {
					return depth;
				}

				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
			depth++;
		}

		return depth;
	}
}
