package com.leetcode.algorithm;

/**
 * 描述： 一维数组的动态和
 * 作者： Faep
 * 创建时间： 2020-11-10 09:19
 * 版本： [1.0, 2020-11-10]
 * 版权： Faep
 */
public class DynamicSumArray_1480 {
    /**
     * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     *
     * 请返回 nums 的动态和。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,6,10]
     * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
     * 示例 2：
     *
     * 输入：nums = [1,1,1,1,1]
     * 输出：[1,2,3,4,5]
     * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
     * 示例 3：
     *
     * 输入：nums = [3,1,2,10,1]
     * 输出：[3,4,6,16,17]
     *  
     *
     * 提示：
     *
     * 1 <= nums.length <= 1000
     * -10^6 <= nums[i] <= 10^6
     */

    public int[] runningSum(int[] nums) {
        int sumNum = 0;
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sumNum += nums[i];
            newArray[i] = sumNum;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int[] ret = new DynamicSumArray_1480().runningSum(arr);
        for (int i : ret) {
            System.out.println(i);
        }
    }


}
