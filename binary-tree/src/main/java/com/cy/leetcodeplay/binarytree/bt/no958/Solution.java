package com.cy.leetcodeplay.binarytree.bt.no958;

import com.cy.leetcodeplay.common.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2025/11/11
 * @Description: no.958. Check Completeness of a Binary Tree
 * link: https://leetcode.com/problems/check-completeness-of-a-binary-tree/description/
 *
 * todo: 未录入Anki
 *
 * 1. 有右无左: return false
 * 2. 子节点不全的那一层, 必须全是叶子节点
 */
public class Solution {

	/**
	 * solution1: bfs (lever travers)
	 * @param root
	 * @return
	 */
	public boolean isCompleteTree(TreeNode root) {
		if (root == null) return true;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		// 是否遇到过左右子节点不全的情况
		boolean leaf = false;
		while (! queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();

				if ((node.left == null && node.right != null) || (leaf && (node.left != null || node.right != null))) {
					return false;
				}
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
				// 子节点不全, node 自己必须是叶子节点
				if (node.left == null || node.right == null) {
					leaf = true;
				}
			}
		}
		return true;
	}
}