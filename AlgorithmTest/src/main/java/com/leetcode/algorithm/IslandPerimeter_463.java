package com.leetcode.algorithm;
/**
 * 岛屿的周长
 * [一句话功能简述]
 * @Title: IslandPerimeter_463.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月2日
 * @version V1.0
 */
 /**
  *[题目描述]给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
  *网格中的格子水平和垂直方向相连（对角线方向不相连）。
  *整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
  *岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。
  *格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。
  *计算这个岛屿的周长。
 */
public class IslandPerimeter_463 {
	public int islandPerimeter(int[][] grid) {
		int count = 0;//记录陆地的个数
		boolean flag = false;
		int jrcnt = 0;//
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1){
					count ++ ;
					if(flag)
						jrcnt+=2;
					flag = true;
				}else{
					flag = false;
				}
			}
			flag = false;
		}
		return 4*count - jrcnt - islandPerimeter2(grid);
	}
	
	public int islandPerimeter2(int[][] grid) {
		boolean flag = false;
		int jrcnt = 0;//
		for (int i = 0; i < grid[0].length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if(grid[j][i] == 1){
					if(flag)
						jrcnt+=2;
					flag = true;
				}else{
					flag = false;
				}
			}
			flag = false;
		}
		return jrcnt;
	}

	public static void main(String[] args) {
		int[][] grid = new int[4][4];
		
		grid[0] = new int[]{0,1,0,0};
		grid[1] = new int[]{1,1,1,0};
		grid[2] = new int[]{0,1,0,0};
		grid[3] = new int[]{1,1,0,0};
		
		int ret = new IslandPerimeter_463().islandPerimeter(grid);
		System.out.println(ret);
	}

}
