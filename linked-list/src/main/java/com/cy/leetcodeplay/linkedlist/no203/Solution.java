package com.cy.leetcodeplay.linkedlist.no203;

import com.cy.leetcodeplay.classes.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/9
 * @Description: no.203. Remove Linked List Elements
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @param val
	 * @return
	 */
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return head;
		}

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode cur = dummy;

		while (cur.next != null) {
			if (cur.next.val != val) {
				cur = cur.next;
				continue;
			}
			ListNode delNode = cur.next;
			cur.next = delNode.next;
			delNode = null;
		}
		return dummy.next;
	}
}
