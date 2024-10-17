package com.cy.leetcodeplay.question.bst.no450;

import com.cy.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/16
 * @Description: no. 450. Delete Node in a BST
 */
public class Solution {

	/**
	 * 删除元素
	 * @param root
	 * @param key
	 * @return
	 */
	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) return null;
		return remove(root, key);
	}

	/**
	 * 删除节点
	 * @param node
	 * @param key
	 * @return
	 */
	private TreeNode remove(TreeNode node, int key) {
		if (node == null) return null;

		if (key < node.val) {
			node.left = remove(node.left, key);
			return node;
		} else if (key > node.val) {
			node.right = remove(node.right, key);
			return node;
		} else { // ==
			if (node.left == null) {
				TreeNode right = node.right;
				node.right = null;
				return right;
			} else if (node.right == null) {
				TreeNode left = node.left;
				node.left = null;
				return left;
			} else {
				TreeNode successor = getMin(node.right);
				successor.right = removeMin(node.right);
				successor.left = node.left;

				node.left = node.right = null;
				return successor;
			}
		}
	}

	/**
	 * 删除最小节点
	 * @param node
	 * @return
	 */
	private TreeNode removeMin(TreeNode node) {
		if (node.left == null) {
			// 保存右节点, 作为删除节点后新的二分搜索树的根
			TreeNode rightNode = node.right;
			// 删除右节点
			node.right = null;
			return rightNode;
		}

		node.left = removeMin(node.left);
		return node;
	}

	/**
	 * 获取最小值
	 * @param node
	 * @return
	 */
	private TreeNode getMin(TreeNode node) {
		if (node.left == null) return node;
		return getMin(node.left);
	}

}