package com.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 键盘行
 * [一句话功能简述]
 * @Title: KeyboardRow.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年7月31日
 * @version V1.0
 */
 /**
  *[题目描述]给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 */
public class KeyboardRow_500 {

	public String[] findWords(String[] words) {
		
		String[] ret = null;
		List<String> retlist = new ArrayList<>();
		
		Map<String, List<String>> map = new HashMap<>();
		map.put("1", new ArrayList<String>());
		map.put("2", new ArrayList<String>());
		map.put("3", new ArrayList<String>());
		List<String> list1 = Arrays.asList(new String[]{"q","w","e","r","t","y","u","i","o","p"});
		List<String> list2 = Arrays.asList(new String[]{"a","s","d","f","g","h","j","k","l"});
		List<String> list3 = Arrays.asList(new String[]{"z","x","c","v","b","n","m"});
		map.get("1").addAll(list1);
		map.get("2").addAll(list2);
		map.get("3").addAll(list3);
		
		List<String> list11 = map.get("1");
		List<String> list22 = map.get("2");
		List<String> list33 = map.get("3");
		for(String str : words){
			String word = str;
			int flag = 0;
			for(int i = 0;i <word.length();i++){
				String s = word.charAt(i) + "";
				s = s.toLowerCase();
				if(list11.contains(s)){
					if(flag != 2 && flag != 3)
						flag = 1;
					else{
						flag = 0;
						break;
					}
				}else if(list22.contains(s)){
					if(flag != 1 && flag != 3)
						flag = 2;
					else{
						flag = 0;
						break;
					}
				}else if(list33.contains(s)){
					if(flag != 2 && flag != 1)
						flag = 3;
					else{
						flag = 0;
						break;
					}
				}
			}
			
			if(flag != 0){
				retlist.add(word);
			}
			
		}
		
		ret = retlist.toArray(new String[retlist.size()]);
		
		return ret;
	}

	public static void main(String[] args) {
		String[] words = new  String[]{"Hello", "Alaska", "Dad", "Peace"};
		String[] ret = new KeyboardRow_500().findWords(words);
		List<String> r = Arrays.asList(ret);
		System.out.println(r);
	}
}
