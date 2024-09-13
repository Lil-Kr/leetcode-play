package com.cy.leetcodeplay.linkedlist.no148;

import com.cy.leetcodeplay.classes.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/12
 * @Description: no.148. Sort List
 * 归并排序
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @return
	 */
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) return head;

		// 获取mid的位置
		ListNode mid = getMid(head);
		ListNode left = sortList(head); // 对左半部分排序
		ListNode right = sortList(mid); // 对右半部分排序

		return merge(left, right);
	}

	/**
	 * 归并
	 * @param left
	 * @param right
	 * @return
	 */
	private ListNode merge(ListNode left, ListNode right) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;

		// 合并两个已排序的链表
		while (left != null && right != null) {
			if (left.val < right.val) {
				current.next = left;
				left = left.next;
			} else {
				current.next = right;
				right = right.next;
			}
			current = current.next;
		}

		// 连接剩余的节点
		if (left != null) {
			current.next = left;
		} else {
			current.next = right;
		}

		return dummy.next; // 返回合并后的链表
	}

	/**
	 * 获取mid的位置
	 * 这里mid是偏多的那一侧
	 * @param node
	 * @return
	 */
	private static ListNode getMid(ListNode node) {
		ListNode slow = node;
		ListNode fast = node.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode mid = slow.next;
		slow.next = null;
		return mid;
	}
}
