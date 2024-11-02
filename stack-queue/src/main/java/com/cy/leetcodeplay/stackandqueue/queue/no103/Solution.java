package com.cy.leetcodeplay.stackandqueue.queue.no103;

import com.cy.leetcodeplay.stackandqueue.classes.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/24
 * @Description: no.103. Binary Tree Zigzag Level Order Traversal
 * 要求你按层次遍历二叉树，并在每一层的顺序上交替（即奇数层从左到右，偶数层从右到左）。
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @return
	 */
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		if (root == null) return new ArrayList<>();

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);
		boolean sign = true; // true: 偶数, false: 奇数
		List<List<Integer>> res = new ArrayList<>();
		while (!queue.isEmpty()) {
			int k = queue.size();
			List<Integer> list = new ArrayList<>();
			sign = !sign;

			for (int i = 0; i < k; i++) {
				TreeNode node = queue.poll();
				if (sign) {
					list.add(0,node.val);
				} else {
					list.add(node.val);
				}

				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			if (list.size() > 0) res.add(list);
		}
		return res;
	}
}