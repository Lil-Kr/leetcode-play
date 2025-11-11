package com.cy.leetcodeplay.binarytree.bt.no337;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2025/11/11
 * @Description: no.337. House Robber III
 * link: https://leetcode.com/problems/house-robber-iii/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * global variable
	 * yes: 偷 头节点 的最大收益
	 * no: 不偷 都节点 的最大收益
	 */
	private int yes, no;

	public int rob(TreeNode root) {
		f1(root);
		return Math.max(yes, no);
	}

	private void f1(TreeNode node) {
		if (node == null) {
			yes = no = 0;
		} else {
			int y = node.val;
			int n = 0;

			f1(node.left);
			y += no;
			n += Math.max(yes, no);

			f1(node.right);
			y += no;
			n += Math.max(yes, no);

			yes = y;
			no = n;
		}
	}
}