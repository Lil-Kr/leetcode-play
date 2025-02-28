package com.cy.leetcodeplay.matrix.linkedlist.no142;

import com.cy.leetcodeplay.matrix.common.entity.ListNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/11
 * @Description: no.142. Linked List Cycle II
 *
 * link: https://leetcode.com/problems/linked-list-cycle-ii/description/
 *
 * 环的特点:
 *  当链表中存在环时，环的部分形成了一个闭合的循环。假设环的起始节点为 C，环的长度为 L
 *  当快慢指针相遇的时候:
 *    1. 说明存在环
 *    2. 并且 slow 在环中的某个位置
 *  相遇点与环的起始节点的关系
 *    1. 设 A 为链表头到环的起始节点 C 的长度，B 为环内从 C 到相遇点的长度。
 *    2. 当 slow 指针在环内某个位置时，slow 和 fast 相遇的条件是
 *      1. slow 移动的总步数为 A + B + kL（其中 k 是一个整数，表示在环内转了多少圈）。
 *      2. slow 移动的总步数为 A + B + kL（其中 k 是一个整数，表示在环内转了多少圈）。
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @return
	 */
	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null) return null;

		ListNode slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow) {
				ListNode entry = head;
				while (entry != slow) {
					entry = entry.next;
					slow = slow.next;
				}
				return entry;
			}
		}
		return null;
	}
}
