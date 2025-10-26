package com.cy.leetcodeplay.binarytree.bt.no1161;

import com.cy.leetcodeplay.common.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: Lil-K
 * @Date: 2025/10/26
 * @Description: no.1161. Maximum Level Sum of a Binary Tree
 * link: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @return
	 */
	public int maxLevelSum(TreeNode root) {
		if (root == null) return 0;

		Deque<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		int max = root.val, level = 1, ans = 1;
		while (!queue.isEmpty()) {
			int k = queue.size();
			int sum = 0;
			for (int i = 0; i < k; i ++) {
				TreeNode node = queue.poll();
				sum += node.val;

				if (node.left != null) queue.offer(node.left);
				if (node.right != null) queue.offer(node.right);
			}
			if (sum > max) {
				ans = level;
			}
			max = Math.max(max, sum);
			level ++;
		}
		return ans;
	}
}