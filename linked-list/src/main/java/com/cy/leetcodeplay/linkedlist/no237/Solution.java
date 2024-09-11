package com.cy.leetcodeplay.linkedlist.no237;

import com.cy.leetcodeplay.classes.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/11
 * @Description: no.237. Delete Node in a Linked List
 */
public class Solution {

	/**
	 *
	 * @param node
	 */
	public void deleteNode(ListNode node) {
		if (node == null) return;
		if (node.next == null) return;

		node.val = node.next.val;
		ListNode del = node.next;
		node.next = del.next;
		del = null;
	}
}
