package com.cy.leetcodeplay.binarytree.bt.no230;

import com.cy.leetcodeplay.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/14
 * @Description: no.230. Kth Smallest Element in a BST
 */
public class Solution {

	private int count = 0; // 用于记录当前遍历到的节点序号
	private int res = 0; // 用于存储结果

	/**
	 * 中序遍历
	 * @param root
	 * @param k
	 * @return
	 */
	public int kthSmallest(TreeNode root, int k) {
		inOrder(root, k);
		return res;
	}

	private void inOrder(TreeNode node, int k) {
		if (node == null) return;

		inOrder(node.left, k);
		count++;
		if (count == k) {
			res = node.val;
			return;
		}

		inOrder(node.right, k);
	}

	/**
	 * 解法二: a more concise way to write
	 * @param root
	 * @param k
	 * @return
	 */
	public int kthSmallest2(TreeNode root, int k) {
		if (root == null) return 0;
		List<Integer> res = new ArrayList<>();
		inOrder(root, res, k);
		return res.get(k - 1);
	}

	private void inOrder(TreeNode node, List<Integer> res, int k) {
		if (node == null) return;

		inOrder(node.left, res, k);
		if (res.size() == k) {
			return;
		}
		res.add(node.val);
		inOrder(node.right, res, k);
	}
}
