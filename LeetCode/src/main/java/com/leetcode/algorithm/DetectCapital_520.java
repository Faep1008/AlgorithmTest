package com.leetcode.algorithm;
/**
 * 检测大写字母
 * [一句话功能简述]
 * @Title: DetectCapital.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年7月31日
 * @version V1.0
 */
 /**
  *[题目描述]给定一个单词，你需要判断单词的大写使用是否正确。
  *我们定义，在以下情况时，单词的大写用法是正确的：
  *全部字母都是大写，比如"USA"。
  *单词中所有字母都不是大写，比如"leetcode"。
  *如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
  *否则，我们定义这个单词没有正确使用大写字母。
 */
public class DetectCapital_520 {
	
	/**
	 * A->65
	 * Z->90
	 * a->97
	 * z->122
	 * @param word
	 * @return
	 */
	public boolean detectCapitalUse(String word) {
		boolean flag = true;
		
		//大写是true，小写是false
		boolean first = word.charAt(0) < 91 ? true:false;
		//true上一个是大写，false上一个是小写
		boolean beforeone = true;
		for(int i=1;i<word.length();i++){
			
			char c = word.charAt(i);
			//如果第一个是小写，就必须全部是小写
			if(!first && c < 91)
				return false;
			//如果第一个是大写
			//后面的全部是大写
			if(i>1 && beforeone && c > 96)
				return false;
			//后面的全部小写
			if(i>1 && !beforeone && c < 91)
				return false;
			if(c < 91)
				beforeone = true;
			else
				beforeone = false;
		}
		return flag;
    }
	
	public static void main(String[] args) {
		boolean ret = new DetectCapital_520().detectCapitalUse("GSole");
		System.out.println(ret);
	}

}
