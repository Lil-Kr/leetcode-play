package com.cy.leetcodeplay.stackandqueue.queue.no637;

import com.cy.leetcodeplay.stackandqueue.classes.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/24
 * @Description: no.637. Average of Levels in Binary Tree
 *
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @return
	 */
	public List<Double> averageOfLevels(TreeNode root) {
		if (root == null) return new ArrayList<>();

		List<Double> res = new ArrayList<>();

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int k = queue.size();
			double sum = 0;
			for (int i = 0; i < k; i++) {
				TreeNode node = queue.poll();
				sum += node.val;

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}
			}

			res.add(sum / k);
		}
		return res;
	}
}