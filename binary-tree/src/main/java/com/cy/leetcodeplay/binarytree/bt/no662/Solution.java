package com.cy.leetcodeplay.binarytree.bt.no662;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2025/11/11
 * @Description: no.662. Maximum Width of Binary Tree
 * link: https://leetcode.com/problems/maximum-width-of-binary-tree/description/
 * todo: 未录入Anki
 */
public class Solution {

	private int max = 3001;

	/**
	 * solution1:
	 * @param root
	 * @return
	 */
	public int widthOfBinaryTree(TreeNode root) {
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