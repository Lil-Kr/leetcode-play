package com.cy.leetcodeplay.question.bst.no109;

import com.cy.common.entity.ListNode;
import com.cy.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/10/17
 * @Description: no.109. Convert Sorted List to Binary Search Tree
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @return
	 */
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) return null;
		/**
		 * 只有一个节点时, 返回TreeNode
		 */
		if (head.next == null) return new TreeNode(head.val);

		ListNode prev = null;
		ListNode mid = getMid(head, prev);

		TreeNode root = new TreeNode(mid.val);

		root.left = sortedListToBST(head);
		root.right = sortedListToBST(mid.next);

		return root;
	}

	/**
	 * 获取中间位置, 并切为两段
	 * @param node
	 * @return
	 */
	private ListNode getMid(ListNode node, ListNode prev) {
		ListNode slow = node;
		ListNode fast = node;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		/**
		 * 切断, 为两端linked
		 */
		if (prev != null) prev.next = null;

		ListNode mid = slow;
		return mid;
	}
}
