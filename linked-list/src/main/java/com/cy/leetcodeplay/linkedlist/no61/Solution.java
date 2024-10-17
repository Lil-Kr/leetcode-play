package com.cy.leetcodeplay.linkedlist.no61;

import com.cy.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/11
 * @Description: no.61. Rotate List
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @param k
	 * @return
	 */
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null) {
			return head;
		}

		// calculate linked list length
		int length = 1;
		ListNode cur = head;
		while (cur.next != null) {
			cur = cur.next;
			length++;
		}

		// 判断是否还需要旋转
		k = k % length;
		if (k == 0) {
			return head;
		}

		// 旋转操作
		cur.next = head; // 形成环
		int rotateCount = length - k;
		ListNode endNode = cur;
		for (int i = 0; i < rotateCount; i++) {
			endNode = endNode.next;
		}
		ListNode start = endNode.next;
		endNode.next = null;

		return start;
	}
}
