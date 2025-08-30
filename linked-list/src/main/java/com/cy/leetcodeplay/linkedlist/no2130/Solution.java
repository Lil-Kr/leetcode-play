package com.cy.leetcodeplay.linkedlist.no2130;

import com.cy.leetcodeplay.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2025/8/30
 * @Description: no.2130. Maximum Twin Sum of a Linked List
 * link: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description
 * todo: 未录入题库
 */
public class Solution {

	public int pairSum(ListNode head) {
		if (head == null || head.next == null) return 0;

		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// revers last half
		ListNode halfNode = reverse(slow);

		int maxSum = 0;
		ListNode p1 = head, p2 = halfNode;
		while (p2 != null) {
			maxSum = Math.max(maxSum, p1.val + p2.val);
			p1 = p1.next;
			p2 = p2.next;
		}
		return maxSum;
	}

	private ListNode reverse(ListNode head) {
		ListNode prev = null, cur = head;
		while (cur != null) {
			ListNode next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}
}