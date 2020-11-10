package com.leetcode.algorithm;
/**
 * 两数之和
 * [一句话功能简述]
 * @Title: TwoSum_1.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月17日
 * @version V1.0
 */
 /**
  *[题目描述]给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
  *你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
  *
  *给定 nums = [2, 7, 11, 15], target = 9
  *因为 nums[0] + nums[1] = 2 + 7 = 9
  *所以返回 [0, 1]
 */
public class TwoSum_1 {
	
	
    public int[] twoSum(int[] nums, int target) {
        int[] val = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
        	for (int j = i + 1; j < nums.length; j++) {
    			if(nums[i] + nums[j] == target){
    				val[0] = i;
    				val[1] = j;
    				return val;
    			}
    		}
		}
        return val;
    }


	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 11, 15};
		int[] val = new TwoSum_1().twoSum(nums, 9);
		System.out.println(val[0] + "," + val[1]);
	}

}
