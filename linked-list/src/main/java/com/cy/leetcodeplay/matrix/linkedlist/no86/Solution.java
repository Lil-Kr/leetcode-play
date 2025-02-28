package com.cy.leetcodeplay.matrix.linkedlist.no86;

import com.cy.leetcodeplay.matrix.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/9
 * @Description: no.86. Partition List
 * link: https://leetcode.com/problems/partition-list/
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @param x
	 * @return
	 */
	public ListNode partition(ListNode head, int x) {
		if (head == null) {
			return head;
		}

		ListNode lessHead = new ListNode(0);
		ListNode greaterHead = new ListNode(0);

		ListNode less = lessHead;
		ListNode greater = greaterHead;

		while (head != null) {
			if (head.val < x) {
				less.next = head;
				less = less.next;
			} else {
				greater.next = head;
				greater = greater.next;
			}
			head = head.next;
		}

		// 必须置为null, 因为上面代码中 greater.next = head, 不清空的话less接起来的链表可能不正确
		greater.next = null;
		less.next = greaterHead.next;
		return lessHead.next;
	}
}
