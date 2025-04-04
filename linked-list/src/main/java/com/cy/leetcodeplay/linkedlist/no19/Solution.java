package com.cy.leetcodeplay.linkedlist.no19;

import com.cy.leetcodeplay.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/11
 * @Description: no.19. Remove Nth Node From End of List
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return head;
		}

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode p1 = dummy;
		ListNode p2 = p1;

		int i = n + 1;
		while (i > 0) {
			p2 = p2.next;
			i--;
		}

		while (p2 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}

		ListNode del = p1.next;
		p1.next = del.next;
		del = null;

		return dummy.next;
	}
}
