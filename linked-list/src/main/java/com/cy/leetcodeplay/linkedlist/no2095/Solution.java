package com.cy.leetcodeplay.linkedlist.no2095;

import com.cy.leetcodeplay.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2025/8/27
 * @Description: no.2095. Delete the Middle Node of a Linked List
 * link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
 * todo: 未录入Anki
 */
public class Solution {

	public ListNode deleteMiddle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}

		int size = 0;
		ListNode dummy = new ListNode();
		dummy.next = head;
		while (dummy.next != null) {
			size++;
			dummy = dummy.next;
		}

		int mid = size / 2;

		ListNode dummyRes = new ListNode();
		ListNode res = dummyRes;
		dummyRes.next = head;
		for (int i = 0; i < mid; i++) {
			dummyRes = dummyRes.next;
		}

		ListNode del = dummyRes.next;
		dummyRes.next = del.next;
		del.next = null;

		return res.next;
	}
}