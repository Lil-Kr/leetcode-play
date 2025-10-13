package com.cy.leetcodeplay.dpoptimizeenumeration.no514;

/**
 * @Author: Lil-K
 * @Date: 2025/10/13
 * @Description: no.514. Freedom Trail
 * link: https://leetcode.com/problems/freedom-trail/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	private static int MAXN = 101;

	private static int MAXC = 26;

	private static int[] ring = new int[MAXN];

	private static int[] key = new int[MAXN];

	private static int[] size = new int[MAXC];

	private static int[][] where = new int[MAXC][MAXN];

	private static int[][] dp = new int[MAXN][MAXN];

	/**
	 * solution1: recursive
	 * @param ring
	 * @param key
	 * @return
	 */
	public int findRotateSteps(String ring, String key) {
		int n = ring.length(), m = key.length();
		builder(n, m, ring, key);
		return f1(n, m,0,0);
	}

	private void builder(int n, int m, String r, String k) {
		for (int i = 0; i < MAXC; i ++) {
			size[i] = 0;
		}

		for (int i = 0, v; i < n; i ++) {
			v = r.charAt(i) - 'a';
			where[v][size[v] ++] = i;
			ring[i] = v;
		}
		for (int i = 0; i < m; i ++) {
			key[i] = k.charAt(i) - 'a';
		}
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				dp[i][j] = -1;
			}
		}
	}

	/**
	 * 指针当前指着轮盘 i 位置的字符, 要搞定key[j ... ] 所有字符, 返回最小代价
	 * @param i
	 * @param j
	 * @return
	 */
	private int f1(int n, int m, int i, int j) {
		// k 等于 m 的长度
		if (j == m) return 0;
		if (dp[i][j] != -1) return dp[i][j];

		int ans;
		if (ring[i] == key[j]) {
			// 1: 按一下 btn 的操作
			ans = 1 + f1(n, m, i, j + 1);
		} else {
			// ring[i] != key[j]
			/**
			 * 轮盘处在 i 的位置
			 * jump1: 顺时针找到最近的 key[j] 字符在轮盘什么位置
			 * distance1: 从 i 顺时针走向 jump1 有多远
			 */
			int jump1 = clock(i, key[j]);
			int distance1 = jump1 > i ? (jump1 - i) : (n - i + jump1);

			/**
			 * jump2: 逆时针找到最近的 key[j] 字符在轮盘的什么位置
			 * distance2: 从 i 顺时针走向 jump2 有多远
			 */
			int jump2 = counterClock(i, key[j]);
			int distance2 = (i > jump2 ? (i - jump2) : (i + n - jump2));
			ans = Math.min(distance1 + f1(n, m, jump1, j), distance2 + f1(n, m, jump2, j));
		}
		dp[i][j] = ans;
		return ans;
	}

	// 顺时针找到最近的 v 在轮盘哪个位置
	private int clock(int i, int v) {
		int l = 0, r = size[v] - 1, mid;
		int[] sorted = where[v];
		int find = -1;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (sorted[mid] > i) {
				find = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return find != -1 ? sorted[find] : sorted[0];
	}

	// 逆时针找到最近的 v 在轮盘哪个位置
	private int counterClock(int i, int v) {
		int l = 0, r = size[v] - 1, mid;
		int[] sorted = where[v];
		int find = -1;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (sorted[mid] < i) {
				find = mid;
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return find != -1 ? sorted[find] : sorted[size[v] - 1];
	}
}