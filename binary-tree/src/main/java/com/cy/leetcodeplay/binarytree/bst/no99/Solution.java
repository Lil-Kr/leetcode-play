package com.cy.leetcodeplay.binarytree.bst.no99;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/17
 * @Description: no.99. Recover Binary Search Tree
 * link: https://leetcode.com/problems/recover-binary-search-tree/description/
 */
public class Solution {

	/**
	 * 记录第一个元素
	 */
	private TreeNode first = null;

	/**
	 * 记录第二个元素
	 */
	private TreeNode second = null;

	/**
	 * 初始化 prev, 以最小值赋值
	 */
	private TreeNode prev = new TreeNode(Integer.MIN_VALUE);

	/**
	 * solution1: in-order
	 * @param root
	 */
	public void recoverTree(TreeNode root) {
		// 使用中序遍历找到两个错误的节点
		inOrder(root);

		// 交换两个错误节点的值
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
	}

	private void inOrder(TreeNode node) {
		if (node == null) return;

		/**
		 * 遍历左子树
		 */
		inOrder(node.left);

		/**
		 * 找到第一个错误的节点, 前一个节点 > 当前节点
		 */
		if (first == null && prev.val > node.val) {
			first = prev;
		}

		/**
		 * 找到第二个错误的节点, 前一个节点 > 当前节点
		 */
		if (first != null && prev.val > node.val) {
			second = node;
		}

		/**
		 * 更新前一个节点
		 */
		prev = node;
		inOrder(node.right);
	}
}
