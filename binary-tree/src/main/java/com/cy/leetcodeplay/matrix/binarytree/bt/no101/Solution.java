package com.cy.leetcodeplay.matrix.binarytree.bt.no101;

import com.cy.leetcodeplay.matrix.common.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description: no.101. Symmetric Tree
 * 对称树
 */
public class Solution {

	/**
	 * 使用队列
	 * @param root
	 * @return
	 */
	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;

		if (root.left == null || root.right == null) {
			if (root.left != null || root.right != null) {
				return false;
			}
		}
		Queue<TreeNode> queueLeft = new LinkedList<>();
		queueLeft.offer(root.left);

		Queue<TreeNode> queueRight = new LinkedList<>();
		queueRight.offer(root.right);

		while (!queueLeft.isEmpty() && !queueRight.isEmpty()) {
			TreeNode nodeL = queueLeft.poll();
			TreeNode nodeR = queueRight.poll();

			if (nodeL == null && nodeR == null) continue;

			if (nodeL == null || nodeR == null || nodeL.val != nodeR.val) return false;

			/**
			 * 左边入队的顺序与右边相反
			 */
			queueLeft.offer(nodeL.left);
			queueLeft.offer(nodeL.right);

			/**
			 * 先右再左
			 */
			queueRight.offer(nodeR.right);
			queueRight.offer(nodeR.left);
		}
		return queueLeft.isEmpty() && queueRight.isEmpty();
	}

	/**
	 * 递归:
	 * 1. 如果两棵树都为空, 它们是镜像的。
	 * 2. 如果其中一个为空, 另一个不为空, 它们不是镜像的。
	 * 3. 如果两棵树的根节点的值相同, 递归比较它们的左子树和右子树, 继续检查。
	 * @param root
	 * @return
	 */
	public boolean isSymmetric2(TreeNode root) {
		if (root == null) return true;
		return isMirror(root.left, root.right);
	}

	private boolean isMirror(TreeNode left, TreeNode right) {
		if (left == null && right == null) return true;

		if (left == null || right == null || left.val != right.val) return false;
		return isMirror(left.left, right.right)
			&& isMirror(left.right, right.left);
	}
}