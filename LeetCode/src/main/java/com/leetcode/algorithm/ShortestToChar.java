package com.leetcode.algorithm;
/**
 * 字符的最短距离
 * 
 * @Title: ShortestToChar.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年7月31日
 * @version V1.0
 */
 /**
  *[题目描述]给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
  *字符串 S 的长度范围为 [1, 10000]。
  *C 是一个单字符，且保证是字符串 S 里的字符。
  *S 和 C 中的所有字母均为小写字母。
 */
public class ShortestToChar {

	public int[] shortestToCharTest(String S, char C) {
		int[] distances = new int[S.length()];
		for(int i = 0;i < S.length(); i++){
			char c = S.charAt(i);
			if(c == C)
				distances[i] = 0;
			else{
				//当前元素的位置是i
				
				//i之前的字符串
				String s1 = S.substring(0, i);
				int d1 = s1.lastIndexOf(C);
				
				//i之后的字符串
				String s2 = S.substring(i + 1);
				int d2 = s2.indexOf(C);
				
				if(d1 != -1 && d2 != -1){
					d1 = i - d1;
					d2 = d2 + 1;
					distances[i] = Math.min(d1, d2);
				}
				else if(d1 == -1){
					distances[i] = d2 + 1;
				}
				else if(d2 == -1){
					distances[i] = i - d1;
				}
			}
		}
		return distances;
	}

	public static void main(String[] args) {
		String S = "aaba";
		char C = 'b';
		int[] d = new ShortestToChar().shortestToCharTest(S, C);
		for(int i=0;i<d.length;i++){
			System.out.print(d[i]+",");
		}
	}
}
