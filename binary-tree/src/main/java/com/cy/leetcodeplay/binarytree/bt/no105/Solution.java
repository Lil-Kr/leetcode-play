package com.cy.leetcodeplay.binarytree.bt.no105;

import com.cy.leetcodeplay.common.entity.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/10/19
 * @Description: no.105. Construct Binary Tree from Preorder and Inorder Traversal
 * link: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 *
 * 1.从前序遍历中提取根节点.
 * 2.根据根节点在中序遍历中的位置, 将中序遍历分割为左子树和右子树.
 * 3.递归构造左右子树.
 *
 * case1:
 *    preorder = [3,9,20,15,7], // 前序遍历
 *    inorder = [9,3,15,20,7], // 中序遍历
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class Solution {

	private int preIndex = 0;

	// 创建中序遍历值到索引的映射
	private Map<Integer, Integer> inOrderMap = new HashMap<>();

	/**
	 *
	 * @param preorder
	 * @param inorder
	 * @return
	 */
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder == null || inorder == null || preorder.length != inorder.length) return null;

		for (int i = 0; i < inorder.length; i++) {
			inOrderMap.put(inorder[i], i);
		}
		// 构建树
		return buildTree(preorder, 0, inorder.length - 1);
	}

	/**
	 *
	 * @param preorder
	 * @param inStart 0
	 * @param inEnd inorder.length - 1
	 * @return
	 */
	private TreeNode buildTree(int[] preorder, int inStart, int inEnd) {
		/**
		 * 如果没有节点可构造，返回 null
		 */
		if (inStart > inEnd) return null;

		/**
		 * 选择前序遍历的当前元素作为根节点
		 */
		int rootValue = preorder[preIndex];
		preIndex++;
		TreeNode root = new TreeNode(rootValue);

		/**
		 * 在中序遍历中找到根节点的位置
		 */
		int inIndex = inOrderMap.get(rootValue);

		/**
		 * 递归构建左子树和右子树
		 */
		root.left = buildTree(preorder, inStart, inIndex - 1);
		root.right = buildTree(preorder, inIndex + 1, inEnd);

		return root;
	}
}