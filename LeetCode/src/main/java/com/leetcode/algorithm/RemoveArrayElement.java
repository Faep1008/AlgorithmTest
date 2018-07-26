package com.leetcode.algorithm;
/**
 * 移除元素
 * [一句话功能简述]
 * @Title: RemoveArrayElement.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年7月26日
 * @version V1.0
 */
 /**
  *[题目描述]给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
  *不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
  *元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
  *给定 nums = [0,1,2,2,3,0,4,2], val = 2,
  *函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
  *注意这五个元素可为任意顺序。
  *你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveArrayElement {

	public int removeElement(int[] nums, int val) {
		int index = nums.length - 1;
		int count = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == val) {
				int num = nums[i];
				nums[i] = nums[index];
				nums[index] = num;
				index--;
				count++;
			}
		}
		return nums.length - count;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int count = new RemoveArrayElement().removeElement(nums, val);
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.print(nums[i]);
		}
	}
}
