package com.cy.leetcodeplay.binarytree.bt.no662;

import com.cy.leetcodeplay.common.entity.TreeNode;
import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2025/11/11
 * @Description: no.662. Maximum Width of Binary Tree
 * link: https://leetcode.com/problems/maximum-width-of-binary-tree/description/
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: queue
	 * @param root
	 * @return
	 */
	public int widthOfBinaryTree(TreeNode root) {
		if (root == null) return 0;

		Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
		queue.offer(new Pair<>(root, 1));
		int distance = 0;
		while (! queue.isEmpty()) {
			int size = queue.size();
			// 记录下一轮的最左边数字的编号
			int left = queue.peek().getValue();
			int right;

			for (int i = 0; i < size; i++) {
				Pair<TreeNode, Integer> cur = queue.poll();
				TreeNode node = cur.getKey();

				// 记录当前节点与最左边的节点的距离
				int parent = cur.getValue();
				right = parent;

				if (node.left != null) {
					queue.offer(new Pair<>(node.left, parent * 2));
				}

				if (node.right != null) {
					queue.offer(new Pair<>(node.right, parent * 2 + 1));
				}
				distance = Math.max(distance, right - left + 1);
			}
		}
		return distance;
	}

	private int max = 3001;

	/**
	 * solution2: array queue
	 * @param root
	 * @return
	 */
	public int widthOfBinaryTree2(TreeNode root) {
		if (root == null) return 0;

		int l = 0, r = 0;

		TreeNode[] nq = new TreeNode[max];
		int[] iq = new int[max];
		nq[r] = root;
		iq[r] = 1; // root number is 1
		r ++;

		int ans = 1;

		while (l < r) {
			int size = r - l;
			ans = Math.max(ans, iq[r - 1] - iq[l] + 1);
			for (int i = 0; i < size; i++) {
				TreeNode node = nq[l];
				int id = iq[l ++];
				if (node.left != null) {
					nq[r] = node.left;
					iq[r ++] = id * 2;
				}
				if (node.right != null) {
					nq[r] = node.right;
					iq[r ++] = id * 2 + 1;
				}
			}
		}
		return ans;
	}
}