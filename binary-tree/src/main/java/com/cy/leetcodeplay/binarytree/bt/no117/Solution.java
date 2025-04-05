package com.cy.leetcodeplay.binarytree.bt.no117;


import com.cy.leetcodeplay.common.entity.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2025/4/5
 * @Description: no.117. Populating Next Right Pointers in Each Node II
 * link: https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
 */
public class Solution {

	/**
	 * 与 116 不同的是, no.117 不是完全二叉树, 是不平衡的二叉树, 不能直接遍历
	 * @param root
	 * @return
	 */
	public Node connect(Node root) {
		if (root == null) return null;

		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			Node prev = null;
			for (int i = 0; i < size; i++) {
				Node cur = queue.poll();

				if (prev != null) {
					prev.next = cur;
				}
				prev = cur;

				if(cur.left != null) {
					queue.offer(cur.left);
				}

				if(cur.right != null) {
					queue.offer(cur.right);
				}
			}
		}

		return root;
	}
}