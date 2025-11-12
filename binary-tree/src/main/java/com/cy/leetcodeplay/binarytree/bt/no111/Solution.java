package com.cy.leetcodeplay.binarytree.bt.no111;


import com.cy.leetcodeplay.common.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description: no.111. Minimum Depth of Binary Tree
 * link: https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 */
public class Solution {

	/**
	 * solution1:
	 * @param root
	 * @return
	 */
	public int minDepth(TreeNode root) {
		if (root == null) return 0;

		if (root.left == null && root.right == null) return 1;

		if (root.left == null) {
			return 1 + minDepth(root.right);
		}

		if (root.right == null) {
			return 1 + minDepth(root.left);
		}

		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

	/**
	 * solution2:
	 * @param root
	 * @return
	 */
	public int minDepth2(TreeNode root) {
		if (root == null) return 0;

		if (root.left == null && root.right == null) return 1;

		int l = Integer.MAX_VALUE, r = Integer.MAX_VALUE;
		if (root.left != null) {
			l = minDepth(root.left);
		}

		if (root.right != null) {
			r = minDepth(root.right);
		}

		return 1 + Math.min(l, r);
	}

	/**
	 * 利用队列
	 * @param root
	 * @return
	 */
	public int minDepth3(TreeNode root) {
		if (root == null) return 0;

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		int depth = 1;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();

				// 如果遇到叶子节点为 null, 直接返回当前深度
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
			depth ++;
		}
		return depth;
	}
}
