package com.cy.leetcodeplay.binarytree.bt.no102;


import com.cy.leetcodeplay.common.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/24
 * @Description: no.102. Binary Tree Level Order Traversal
 * link: https://leetcode.com/problems/binary-tree-level-order-traversal/description/
 */
public class Solution {

	/**
	 * 层序遍历
	 * @param root
	 * @return
	 */
	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) return new ArrayList<>();

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);
		List<List<Integer>> res = new ArrayList<>();
		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
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