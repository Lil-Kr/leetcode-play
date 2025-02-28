package com.cy.leetcodeplay.matrix.linkedlist.no24;

import com.cy.leetcodeplay.matrix.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 4};
		ListNode head = new ListNode(nums);
		ListNode res1 = solution.swapPaiars(head);
		System.out.println(res1.toString());
		Assertions.assertEquals("2 -> 1 -> 4 -> 3 -> null", res1.toString());
	}

	@Test
	public void test2() {
		int[] nums = {1,2,3};
		ListNode head = new ListNode(nums);
		ListNode res1 = solution.swapPaiars(head);
		System.out.println(res1.toString());
		Assertions.assertEquals("2 -> 1 -> 3 -> null", res1.toString());
	}
}