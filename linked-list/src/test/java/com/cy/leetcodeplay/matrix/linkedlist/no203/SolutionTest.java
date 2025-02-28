package com.cy.leetcodeplay.matrix.linkedlist.no203;

import com.cy.leetcodeplay.matrix.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] head = {1,2,6,3,4,5,6};
		int val = 6;
		ListNode linked = new ListNode(head);
		ListNode res1 = solution.removeElements(linked, val);
		System.out.println(res1);
		Assertions.assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> null", res1.toString());
	}

	@Test
	public void test2() {
		int[] head = {7,7,7,7};
		int val = 7;
		ListNode linked = new ListNode(head);
		ListNode res1 = solution.removeElements(linked, val);
		System.out.println(res1);
		Assertions.assertEquals("null", String.valueOf(res1));
	}

	@Test
	public void test3() {
		int[] head = {1};
		int val = 1;
		ListNode linked = new ListNode(head);
		ListNode res1 = solution.removeElements(linked, val);
		System.out.println(res1);
		Assertions.assertEquals("null", String.valueOf(res1));
	}
}