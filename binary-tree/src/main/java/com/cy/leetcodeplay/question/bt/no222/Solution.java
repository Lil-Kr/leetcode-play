package com.cy.leetcodeplay.question.bt.no222;

import com.cy.common.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description: no.222. Count Complete Tree Nodes
 * 完全二叉树的特点:
 *
 */
public class Solution {

	/**
	 * 使用队列辅助, 如果完全二叉树比较大, 性能不是最优
	 * @param root
	 * @return
	 */
	public int countNodes(TreeNode root) {
		if (root == null) return 0;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int count = 0;

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				count++;
				if (node.left != null) {
					queue.offer(node.left);
				}

				if (node.right != null) {
					queue.offer(node.right);
				}
			}
		}
		return count;
	}

	/**
	 * 递归 + 完全二叉树性质
	 * 高度只会相差 1
	 * @param root
	 * @return
	 */
	public int countNodes2(TreeNode root) {
		if (root == null) return 0;

		int leftHeight = getLeftHeight(root);
		int rightHeight = getRightHeight(root);
		
		// 如果左子树高度等于右子树高度, 说明左子树是满二叉树
		if (leftHeight == rightHeight) {
			return (1 << leftHeight) - 1;
		} else {
			// 否则, 递归计算左右子树的节点数
			return 1 + countNodes(root.left) + countNodes(root.right);
		}
	}

	private int getLeftHeight(TreeNode node) {
		int height = 0;
		while (node != null) {
			height++;
			node = node.left;
		}
		return height;
	}

	// 获取右子树的高度
	private int getRightHeight(TreeNode node) {
		int height = 0;
		while (node != null) {
			height++;
			node = node.right;
		}
		return height;
	}
}