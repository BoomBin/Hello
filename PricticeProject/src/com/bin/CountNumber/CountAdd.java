package com.bin.CountNumber;

import java.util.Scanner;

/**
 * 输入一行字符，
 * 分别统计出其中
 * 英文字母、空格、数字和其它字符的个数。  
 * @author jiabin
 *
 */
public class CountAdd {
	public static void main(String[] args) {
		int abcCount=0;//英文个数
		int spaceCount=0;//空格个数
		int numCount=0;//数字个数
		int otherCount=0;//其他字符
		Scanner scan = new Scanner(System.in);
		System.out.println("输入一组字符串");
		String str = scan.nextLine();//取出控制台的一行信息（刚输入的信息）
		char[] ch = str.toCharArray();//吧取出的字符串变成一个char数组
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				abcCount++;
			}else if(Character.isDigit(ch[i])) {
				numCount++;
			}else if(Character.isSpaceChar(ch[i])) {
				spaceCount++;
			}else{
				otherCount++;
			}
		}
		System.out.println("字母个数："+abcCount);
	}
}
