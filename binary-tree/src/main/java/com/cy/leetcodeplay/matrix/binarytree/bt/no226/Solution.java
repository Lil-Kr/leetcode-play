package com.cy.leetcodeplay.matrix.binarytree.bt.no226;


import com.cy.leetcodeplay.matrix.common.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description: no.226. Invert Binary Tree
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @return
	 */
	public TreeNode invertTree(TreeNode root) {
		if (root == null) return root;

		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		invertTree(root.left);
		invertTree(root.right);
		return root;
	}


	/**
	 * 解法二: 层序遍历
	 * @param root
	 * @return
	 */
	public TreeNode invertTree2(TreeNode root) {
		if (root == null) return null;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();

			// 交换左右子树
			TreeNode temp = node.left;
			node.left = node.right;
			node.right = temp;

			if (node.left != null) queue.offer(node.left);

			if (node.right != null) queue.offer(node.right);
		}
		return root;
	}
}