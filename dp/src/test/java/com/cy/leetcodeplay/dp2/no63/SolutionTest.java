package com.cy.leetcodeplay.dp2.no63;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		int res = solution.uniquePathsWithObstacles(obstacleGrid);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test2() {
		int[][] obstacleGrid = {{0,1},{0,0}};
		int res = solution.uniquePathsWithObstacles(obstacleGrid);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test3() {
		int[][] obstacleGrid = {{0,0},{0,1}};
		int res = solution.uniquePathsWithObstacles(obstacleGrid);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test4() {
		int[][] obstacleGrid = {{0}};
		int res = solution.uniquePathsWithObstacles(obstacleGrid);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test5() {
		int[][] obstacleGrid = {{1}};
		int res = solution.uniquePathsWithObstacles(obstacleGrid);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test6() {
		int[][] obstacleGrid = {{1,0}};
		int res = solution.uniquePathsWithObstacles(obstacleGrid);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test7() {
		int[][] obstacleGrid = {{0,1,0}};
		int res = solution.uniquePathsWithObstacles(obstacleGrid);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test8() {
		int[][] obstacleGrid = {{0},{0},{1},{0}};
		int res = solution.uniquePathsWithObstacles(obstacleGrid);
		Assertions.assertEquals(0, res);
	}

	// ============== dp =============
	@Test
	public void test21() {
		int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		int res = solution.uniquePathsWithObstacles2(obstacleGrid);
		Assertions.assertEquals(2, res);
	}

	@Test
	public void test22() {
		int[][] obstacleGrid = {{0,1},{0,0}};
		int res = solution.uniquePathsWithObstacles2(obstacleGrid);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test23() {
		int[][] obstacleGrid = {{0,0},{0,1}};
		int res = solution.uniquePathsWithObstacles2(obstacleGrid);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test24() {
		int[][] obstacleGrid = {{0}};
		int res = solution.uniquePathsWithObstacles2(obstacleGrid);
		Assertions.assertEquals(1, res);
	}

	@Test
	public void test25() {
		int[][] obstacleGrid = {{1}};
		int res = solution.uniquePathsWithObstacles2(obstacleGrid);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test26() {
		int[][] obstacleGrid = {{1,0}};
		int res = solution.uniquePathsWithObstacles2(obstacleGrid);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test27() {
		int[][] obstacleGrid = {{0,1,0}};
		int res = solution.uniquePathsWithObstacles2(obstacleGrid);
		Assertions.assertEquals(0, res);
	}

	@Test
	public void test28() {
		int[][] obstacleGrid = {{0},{0},{1},{0}};
		int res = solution.uniquePathsWithObstacles2(obstacleGrid);
		Assertions.assertEquals(0, res);
	}
}