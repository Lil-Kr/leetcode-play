package com.cy.leetcodeplay.linkedlist.no83;

import com.cy.leetcodeplay.classes.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/9
 * @Description: no.83. Remove Duplicates from Sorted List
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @return
	 */
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode cur = head;

		while (cur != null && cur.next != null) {
			if (cur.val == cur.next.val) {
				ListNode del = cur.next;
				cur.next = del.next;
				del = null;
			} else {
				cur = cur.next;
			}
		}
		return head;
	}
}