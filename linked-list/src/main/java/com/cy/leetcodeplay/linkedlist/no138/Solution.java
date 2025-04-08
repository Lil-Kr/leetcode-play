package com.cy.leetcodeplay.linkedlist.no138;

import com.cy.leetcodeplay.common.entity.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2025/4/8
 * @Description: no. 138. Copy List with Random Pointer
 * link: https://leetcode.com/problems/copy-list-with-random-pointer/description/
 */
public class Solution {

	/**
	 *
	 * @param head
	 * @return
	 */
	public Node copyRandomList(Node head) {
		if (head == null) return null;

		Map<Node, Node> map = new HashMap<>();

		// 第一步: 复制所有节点
		Node cur = head;
		while (cur != null) {
			map.put(cur, new Node(cur.val));
			cur = cur.next;
		}

		// 第二步: 赋值 next 和 random 指针
		cur = head;
		while (cur != null) {
			Node copy = map.get(cur);
			copy.next = map.get(cur.next);
			copy.random = map.get(cur.random);
			cur = cur.next;
		}

		return map.get(head);
	}
}