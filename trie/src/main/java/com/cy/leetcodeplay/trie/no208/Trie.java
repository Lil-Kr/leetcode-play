package com.cy.leetcodeplay.trie.no208;

/**
 * @Author: Lil-K
 * @Date: 2025/4/9
 * @Description: no.208. Implement Trie (Prefix Tree)
 * link: https://leetcode.com/problems/implement-trie-prefix-tree/description/
 */
public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode node = root;
		for (char c : word.toCharArray()) {
			int index = c - 'a';
			if (node.children[index] == null) {
				node.children[index] = new TrieNode();
			}
			node = node.children[index];
		}
		node.isEnd = true;
	}

	public boolean search(String word) {
		TrieNode node = searchPrefix(word);
		return node != null && node.isEnd;
	}

	public boolean startsWith(String prefix) {
		return searchPrefix(prefix) != null;
	}

	/**
	 * 辅助方法: 查找前缀对应的最后一个节点
	 *
	 * @param prefix
	 * @return
	 */
	private TrieNode searchPrefix(String prefix) {
		TrieNode node = root;
		for (char c : prefix.toCharArray()) {
			int index = c - 'a';
			if (node.children[index] == null) return null;
			node = node.children[index];
		}
		return node;
	}

	class TrieNode {
		TrieNode[] children = new TrieNode[26];
		boolean isEnd = false;
	}
}
