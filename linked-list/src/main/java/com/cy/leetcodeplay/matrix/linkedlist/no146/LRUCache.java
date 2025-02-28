package com.cy.leetcodeplay.matrix.linkedlist.no146;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/9/16
 * @Description: no.146. LRU Cache
 */
public class LRUCache {

	class Node {
		int key;
		int value;
		Node prev, next;
		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	private Map<Integer, Node> map;
	private int capacity;
	/**
	 * 双向链表记录每个键的使用顺序, 最近使用的键放在链表头, 最少使用的键放在链表尾部
	 */
	private Node head, tail;

	public LRUCache() {}

	public LRUCache(int capacity) {
		this.map = new HashMap<>();
		this.capacity = capacity;
		/**
		 * 初始化虚拟头节点
		 */
		this.head = new Node(-1, -1);
		this.tail = new Node(-1, -1);
		head.next = tail;
		tail.next = head;
	}

	public int get(int key) {
		if (!this.map.containsKey(key)) {
			return -1;
		}
		/**
		 * 提升节点为常用节点
		 */
		Node node = map.get(key);
		removeNode(node);
		insertToHead(node);
		return node.value;
	}

	/**
	 * 添加新元素
	 * 1. 检查容积是否满
	 * 2. 满的话移除
	 * @param key
	 * @param value
	 */
	public void put(int key, int value) {
		if (map.containsKey(key)) {
			Node node = map.get(key);
			node.value = value;
			removeNode(node);
			insertToHead(node);
		} else {
			if (map.size() == capacity) {
				// 淘汰最后一个
				Node last = tail.prev;
				removeNode(last);
				map.remove(last.key);
			}
			Node newNode = new Node(key, value);
			insertToHead(newNode);
			map.put(key, newNode);
		}
	}

	/**
	 * 移除node
	 * @param node
	 */
	private void removeNode(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	/**
	 * 将节点插入到链表头部（标记为最近使用）
	 * @param node
	 */
	public void insertToHead(Node node) {
		node.next = head.next;
		node.prev = head;

		head.next.prev = node;
		head.next = node;
	}

}