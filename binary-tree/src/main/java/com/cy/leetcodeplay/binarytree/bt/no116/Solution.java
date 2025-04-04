package com.cy.leetcodeplay.binarytree.bt.no116;

import com.cy.leetcodeplay.common.entity.Node;

/**
 * @Author: Lil-K
 * @Date: 2025/4/5
 * @Description: no.116. Populating Next Right Pointers in Each Node
 * link: https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
 */
public class Solution {

	/**
	 * 完全二叉树直接遍历
	 * @param root
	 * @return
	 */
	public Node connect(Node root) {
		if (root == null) return null;

		if (root.left != null) {
			root.left.next = root.right;
			if (root.next != null) {
				root.right.next = root.next.left;
			}
			connect(root.left);
			connect(root.right);
		}
		return root;
	}
}