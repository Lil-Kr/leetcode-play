package com.cy.leetcodeplay.linkedlist.no445;

import com.cy.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/9
 * @Description: no.445. Add Two Numbers II
 */
public class Solution {

	/**
	 * 先反转链表
	 * @param l1
	 * @param l2
	 * @return:
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return null;
		}

		l1 = reverserLinkedList(l1);
		l2 = reverserLinkedList(l2);

		int carry = 0;
		ListNode dummy = new ListNode(-1);
		ListNode cur = dummy;
		while (l1 != null || l2 != null) {
			int sum = carry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			carry = sum / 10;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
		}

		if (carry > 0) cur.next = new ListNode(carry);

		return reverserLinkedList(dummy.next);
	}

	/**
	 * 反转链表
	 * @param node
	 */
	public static ListNode reverserLinkedList(ListNode node) {
		ListNode pre = null;
		ListNode cur = node;
		while(cur != null) {
			ListNode next = cur.next;
			// 反向指向前一个节点(反转)
			cur.next = pre;
			// 移动pre的位置
			pre = cur;
			// 移动cur指针
			cur = next;
		}
		return pre;
	}
}
