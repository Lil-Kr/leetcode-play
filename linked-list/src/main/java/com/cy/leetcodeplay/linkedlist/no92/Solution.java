package com.cy.leetcodeplay.linkedlist.no92;

import com.cy.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/8
 * @Description: no.92. Reverse Linked List II
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @param left
	 * @param right
	 * @return
	 */
	public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;

		for (int i = 0; i < left - 1; i++) {
			prev = prev.next;
		}

		ListNode reverseStart = prev.next;
		ListNode curr = reverseStart.next;

		for (int i = 0; i < right - left; i++) {
			reverseStart.next = curr.next;
			curr.next = prev.next;
			prev.next = curr;
			curr = reverseStart.next;
		}

		return dummy.next;
	}
}