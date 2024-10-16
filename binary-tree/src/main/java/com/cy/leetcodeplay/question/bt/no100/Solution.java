package com.cy.leetcodeplay.question.bt.no100;

import com.cy.common.util.printtree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description: no.100. Same Tree
 */
public class Solution {

	/**
	 * recursion
	 * 1. if both node is null, return true。
	 * 2. if one of node is null, return false。
	 * 3. if node1 not equals node2, return false。
	 * 4. compare left child node and right child is or not different
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) return true;

		if (p == null || q == null || p.val != q.val) return false;

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

	/**
	 * level traversal: use Queue
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean isSameTree2(TreeNode p, TreeNode q) {
		if (p == null && q == null) return true;

		Queue<TreeNode> queue1 = new LinkedList<>();
		Queue<TreeNode> queue2 = new LinkedList<>();

		queue1.offer(p);
		queue2.offer(q);

		while (!queue1.isEmpty() && !queue2.isEmpty()) {
			TreeNode node1 = queue1.poll();
			TreeNode node2 = queue2.poll();

			if (node1 == null || node2 == null || node1.val != node2.val) return false;

			if (node1.left != null || node2.left != null) {
				if (node1.left == null || node2.left == null) {
					return false;
				}
				queue1.offer(node1.left);
				queue2.offer(node2.left);
			}

			if (node1.right != null || node2.right != null) {
				if (node1.right == null || node2.right == null) {
					return false;
				}
				queue1.offer(node1.right);
				queue2.offer(node2.right);
			}
		}

		return true;
	}

}