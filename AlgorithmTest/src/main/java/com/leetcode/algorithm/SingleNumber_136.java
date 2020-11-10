package com.leetcode.algorithm;
/**
 * 只出现一次的数字
 * [一句话功能简述]
 * @Title: SingleNumber_136.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月15日
 * @version V1.0
 */
 /**
  * [题目描述]给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
  * 输入: [4,1,2,1,2]
  * 输出: 4
  * 说明:
  * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class SingleNumber_136 {
	
	public int singleNumber(int[] nums) {
		int val = 0;
		for (int i = 0; i < nums.length; i++) {
			val ^= nums[i];
		}
		
		return val;
    }
	
	public static void main(String[] args) {
		int[] nums = new int[]{4,1,2,1,2};
		int val = new SingleNumber_136().singleNumber(nums);
		System.out.println(val);
	}

}