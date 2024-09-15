package com.cy.leetcodeplay.linkedlist.no25;

import com.cy.leetcodeplay.classes.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/15
 * @Description: no.25. Reverse Nodes in k-Group
 */
public class Solution {

	public ListNode reverseKGroup(ListNode head, int k) {
		if (head == null || head.next == null || k < 2) return null;

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;

		while (true) {
			ListNode end = prev;
			for (int i = 0; i < k && end != null; i++) {
				end = end.next;
			}
			if (end == null) break;

			/**
			 * 锁定待反转链表的范围
			 */
			ListNode start = prev.next;
			ListNode nextGroup = end.next;

			ListNode prevNode = null, cur = start;
			while (cur != nextGroup) {
				ListNode next = cur.next;
				cur.next = prevNode;
				prevNode = cur;
				cur = next;
			}

			/**
			 * 1. end: 反转后的链表头
			 * 2. 将后续未处理的链表结到 start.next, 同时prev也被修改
			 * 3. 继续下一轮循环
			 */
			prev.next = end;
			start.next = nextGroup;

			prev = start;
		}
		return dummy.next;
	}
}