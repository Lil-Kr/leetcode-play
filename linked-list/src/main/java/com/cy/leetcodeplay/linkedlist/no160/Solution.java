package com.cy.leetcodeplay.linkedlist.no160;

import com.cy.leetcodeplay.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/18
 * @Description: no.160. Intersection of Two Linked Lists
 *
 * link: https://leetcode.com/problems/intersection-of-two-linked-lists/
 *
 * 如果链表 A 和链表 B 有交点, 那么指针在某一时刻将会在交点相遇.
 * 如果链表 A 和链表 B 没有交点, 指针会同时到达链表的末尾, 指向 null.
 * 通过交替遍历 A 和 B, 两个指针会同步前进, 并且如果存在交点, 会在交点相遇；如果不存在交点, 则同时为 null, 结束循环.
 */
public class Solution {

	/**
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) return null;

		ListNode curA = headA;
		ListNode curB = headB;

		/**
		 * 两个指针不断向前走, 直到相遇
		 */
		while (curA != curB) {
			// 如果pA走到了链表A的末尾, 就指向链表B的头
			curA = curA == null ? headB : curA.next;

			// 如果pB走到了链表B的末尾, 就指向链表A的头
			curB = curB == null ? headA : curB.next;
		}

		// 如果有交点, 返回交点的节点, 否则返回null
		return curA;
	}
}
