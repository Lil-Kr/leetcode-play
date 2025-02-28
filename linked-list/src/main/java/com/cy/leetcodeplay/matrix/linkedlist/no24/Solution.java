package com.cy.leetcodeplay.matrix.linkedlist.no24;

import com.cy.leetcodeplay.matrix.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/10
 * @Description: no.24. Swap Nodes in Pairs
 */
public class Solution {

	/**
	 * 1 -> 2 -> 3 -> 4
	 * @param head
	 * @return:
	 */
	public ListNode swapPaiars(ListNode head) {
		if (head == null) return null;

		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode prev = dummy;

		while (prev.next != null && prev.next.next != null) {
			ListNode node1 = prev.next;
			ListNode node2 = node1.next;
			ListNode next = node2.next;

			/**
			 * 交换 node1 和 node2
			 */
			node2.next = node1;
			node1.next = next;
			prev.next = node2;
			/**
			 * 维护prev指针
			 */
			prev = node1;
		}

		return dummy.next;
	}
}
