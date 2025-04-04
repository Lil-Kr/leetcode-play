package com.cy.leetcodeplay.matrix.linkedlist.no2;

import com.cy.leetcodeplay.linkedlist.no2.Solution;
import com.cy.leetcodeplay.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] l1 = {9, 4, 3}, l2 = {5, 6, 4};
		ListNode node1 = new ListNode(l1);
		ListNode node2 = new ListNode(l2);
		ListNode res1 = solution.addTwoNumbers(node1, node2);
		System.out.println(res1);
		Assertions.assertEquals("4 -> 1 -> 8 -> null", res1.toString());
	}

	@Test
	public void test2() {
		int[] l1 = {1,1,3}, l2 = {9,9,6};
		ListNode node1 = new ListNode(l1);
		ListNode node2 = new ListNode(l2);
		ListNode res1 = solution.addTwoNumbers(node1, node2);
		System.out.println(res1);
		Assertions.assertEquals("0 -> 1 -> 0 -> 1 -> null", res1.toString());
	}

	@Test
	public void test3() {
		int[] l1 = {9,9,9,9,9,9,9}, l2 = {9,9,9,9};
		ListNode node1 = new ListNode(l1);
		ListNode node2 = new ListNode(l2);
		ListNode res1 = solution.addTwoNumbers(node1, node2);
		System.out.println(res1);
		Assertions.assertEquals("8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1 -> null", res1.toString());
	}
}