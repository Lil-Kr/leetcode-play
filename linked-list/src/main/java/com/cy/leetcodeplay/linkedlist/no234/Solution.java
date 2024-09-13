package com.cy.leetcodeplay.linkedlist.no234;

import com.cy.leetcodeplay.classes.ListNode;

import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/13
 * @Description: no.234. Palindrome Linked List
 */
public class Solution {

	/**
	 * 解法一: 借助栈结构
	 * @param head
	 * @return
	 */
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) return true;

		ListNode cur = head;
		Stack<Integer> stack = new Stack<>();
		ListNode mid = getMid(cur, stack);
		while (mid != null) {
			Integer pop = stack.pop();
			if (pop != mid.val) {
				return false;
			}
			mid = mid.next;
		}

		return true;
	}

	public static ListNode getMid(ListNode node, Stack<Integer> stack) {
		ListNode slow = node;
		ListNode fast = node;
		while (fast != null && fast.next != null) {
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null) {
			slow = slow.next;
		}
		ListNode mid = slow;
		return mid;
	}

	/**
	 * 解法二: 通过反转后半部分的链表
	 * @param head
	 * @return
	 */
	public boolean isPalindrome2(ListNode head) {
		if (head == null || head.next == null) return true;

		ListNode cur = head;
		ListNode mid = getMid(cur);
		ListNode reverseList = reverse(mid);

		ListNode firstHalf = head;
		ListNode secondHalf = reverseList;
		while (secondHalf != null) {
			if (firstHalf.val != secondHalf.val) {
				return false;
			}
			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
		}
		return true;
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

	/**
	 * 适合需要在链表中点之后处理链表的场景, 例如在回文检测中, 跳过中点以确保分割后部分能正确比较
	 * @param node
	 * @return
	 */
	public static ListNode getMid(ListNode node) {
		ListNode slow = node;
		ListNode fast = node;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		if (fast != null) {
			slow = slow.next;
		}
		return slow;
	}
}
