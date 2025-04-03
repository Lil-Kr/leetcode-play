package com.cy.leetcodeplay.binarytree.bt.no106;

import com.cy.leetcodeplay.matrix.common.entity.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/10/19
 * @Description: no.106. Construct Binary Tree from Inorder and Postorder Traversal
 *
 * 1. 后序遍历的最后一个元素是树的根节点。
 * 2. 在中序遍历中找到根节点的位置，这将帮助我们确定左子树和右子树的范围。
 * 3. 递归构造左子树和右子树。
 *
 *
 * case1:
 *    inorder = [9, 3, 15, 20, 7], // 中序遍历
 *    preorder = [9, 15, 7, 20, 3], // 后序遍历
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class Solution {

	private Map<Integer, Integer> inOrderMap = new HashMap<>();
	private int postIndex;

	/**
	 *
	 * @param inorder
	 * @param postorder
	 * @return
	 */
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		postIndex = postorder.length - 1;
		for (int i = 0; i < inorder.length; i++) {
			inOrderMap.put(inorder[i], i);
		}
		return buildTree(postorder, 0, inorder.length - 1);
	}

	/**
	 *
	 * @param postorder
	 * @param inStart
	 * @param inEnd
	 * @return
	 */
	private TreeNode buildTree(int[] postorder, int inStart, int inEnd) {
		if (inStart > inEnd) return null;

		/**
		 * 根据后续遍历, 构建root节点
		 */
		int rootNum = postorder[postIndex];
		postIndex--;
		TreeNode root = new TreeNode(rootNum);

		int inIndex = inOrderMap.get(rootNum);

		root.right = buildTree(postorder, inIndex + 1, inEnd);
		root.left = buildTree(postorder, inStart, inIndex - 1);
		return root;
	}
}
