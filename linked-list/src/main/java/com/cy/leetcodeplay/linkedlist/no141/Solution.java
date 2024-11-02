package com.cy.leetcodeplay.linkedlist.no141;

import com.cy.leetcodeplay.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/11
 * @Description:
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @return
	 */
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) return false;

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
}
