package com.leetcode.algorithm;
/**
 * 山脉数组的峰顶索引
 * [一句话功能简述]
 * @Title: PeakIndexMountainArray_852.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月2日
 * @version V1.0
 */
 /**
  *[题目描述]我们把符合下列属性的数组 A 称作山脉：A.length >= 3
  *存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
  *给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 */
public class PeakIndexMountainArray_852 {
	
	public int peakIndexInMountainArray(int[] A) {
		for (int i = 0; i < A.length-1; i++) {
			if(A[i]>A[i+1])
				return i;
		}
		return 0;
    }

	public static void main(String[] args) {
		int[] A = new int[]{0,2,1,0};
		int index = new PeakIndexMountainArray_852().peakIndexInMountainArray(A);
		System.out.println(index);
	}

}
