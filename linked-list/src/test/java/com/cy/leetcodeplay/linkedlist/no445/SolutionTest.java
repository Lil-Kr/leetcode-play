package com.cy.leetcodeplay.linkedlist.no445;

import com.cy.leetcodeplay.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] l1 = {7,2,4,3}, l2 = {5,6,4};
		ListNode node1 = new ListNode(l1);
		ListNode node2 = new ListNode(l2);
		ListNode res1 = solution.addTwoNumbers(node1, node2);
		System.out.println(res1);
		Assertions.assertEquals("7 -> 8 -> 0 -> 7 -> null", res1.toString());
	}

	@Test
	public void test2() {
		int[] l1 = {2,4,3}, l2 = {5,6,4};
		ListNode node1 = new ListNode(l1);
		ListNode node2 = new ListNode(l2);
		ListNode res1 = solution.addTwoNumbers(node1, node2);
		System.out.println(res1);
		Assertions.assertEquals("8 -> 0 -> 7 -> null", res1.toString());
	}
}