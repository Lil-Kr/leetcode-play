package com.cy.leetcodeplay.linkedlist.no143;

import com.cy.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/13
 * @Description: no.143. Reorder List
 */
public class Solution {


	/**
	 *
	 * @param head
	 */
	public void reorderList(ListNode head) {
		if (head == null || head.next == null) return;

		ListNode cur = head;
		ListNode mid = getMid(cur);

		ListNode right = reverse(mid);
		ListNode left = head;

		while (right != null) {
			ListNode next = right;
			right = right.next;

			next.next = left.next;
			left.next = next;
			left = left.next.next;
		}
	}

	/**
	 * 查找中间位置
	 * 该方法 通过链表的中点进行截断，并直接返回第二部分，适合分割链表并需要返回两部分链表的情况
	 * @param node
	 * @return
	 */
	public static ListNode getMid(ListNode node) {
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

	public static ListNode reverse(ListNode node) {
		ListNode prev = null;
		ListNode cur = node;

		while (cur != null) {
			ListNode next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}

}
