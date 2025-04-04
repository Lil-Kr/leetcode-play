package com.cy.leetcodeplay.linkedlist.no147;

import com.cy.leetcodeplay.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/12
 * @Description: no.147. Insertion Sort List
 */
public class Solution {

	/**
	 * 4 -> 2 -> 1 -> 3
	 * @param head
	 * @return
	 */
	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null) return head;

		ListNode dummy = new ListNode(0);
		ListNode current = head;

		while (current != null) {
			ListNode nextTemp = current.next;

			ListNode prev = dummy; // 第一次为 dummy 只有1个节点
			while (prev.next != null && prev.next.val < current.val) {
				prev = prev.next;
			}

			current.next = prev.next;
			prev.next = current;
			current = nextTemp;
		}
		return dummy.next;
	}
}
