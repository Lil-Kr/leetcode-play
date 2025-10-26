package com.cy.leetcodeplay.binarytree.bt.no1448;

import com.cy.leetcodeplay.common.entity.TreeNode;
import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: Lil-K
 * @Date: 2025/10/26
 * @Description: no.1448. Count Good Nodes in Binary Tree
 * link: https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: DFS
	 * @param root
	 * @return
	 */
	public int goodNodes(TreeNode root) {
		if (root == null) return 0;
		return dfs(root, root.val);
	}

	private int dfs(TreeNode node, Integer val) {
		if (node == null) return 0;

		int count = 0;
		if (node.val >= val) count ++;

		val = Math.max(val, node.val);

		count += dfs(node.left, val);
		count += dfs(node.right, val);

		return count;
	}

	/**
	 * solution2: BFS + Queue
	 * @param root
	 * @return
	 */
	public int goodNodes2(TreeNode root) {
		if (root == null) return 0;

		Deque<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
		queue.offer(new Pair<>(root, root.val));
		int ans = 0;
		while (!queue.isEmpty()) {
			Pair<TreeNode, Integer> pair = queue.poll();
			TreeNode node = pair.getKey();
			int maxVal = pair.getValue();

			if (node.val >= maxVal) ans ++;

			maxVal = Math.max(maxVal, node.val);

			if (node.left != null) queue.offer(new Pair<>(node.left, maxVal));
			if (node.right != null) queue.offer(new Pair<>(node.right, maxVal));
		}
		return ans;
	}
}