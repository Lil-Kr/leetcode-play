package com.cy.leetcodeplay.binarytree.bt.no111;


import com.cy.common.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description: no.111. Minimum Depth of Binary Tree
 */
public class Solution {

	/**
	 * 利用队列
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

	/**
	 * 递归
	 * @param root
	 * @return
	 */
	public int minDepth2(TreeNode root) {
		if (root == null) return 0;

		if (root.left == null && root.right == null) return 1;

		if (root.left == null) {
			return 1 + minDepth2(root.right);
		}

		if (root.right == null) {
			return 1 + minDepth2(root.left);
		}

		return 1 + Math.min(minDepth2(root.left), minDepth2(root.right));
	}

}
