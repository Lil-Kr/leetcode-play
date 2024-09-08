package com.cy.leetcodeplay.linkedlist.no206;

/**
 * @Author: Lil-K
 * @Date: 2024/9/8
 * @Description: no.206. Reverse Linked List
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		ListNode prev = null, cur = head;

		while (cur != null) {
			ListNode next = cur.next;

			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}