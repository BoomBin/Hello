package com.bin.FISDEmo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 应用FileInputStream类，
 * 编写应用程序，从磁盘上读取一个Java程序，
 * 并将源程序代码显示在屏幕上。
 * 被读取的文件路径为：E:/myjava/Hello.java）
 * @author jiabin
 *
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		byte[] buf = new byte[2056];
		try {
			FileInputStream fis = new FileInputStream("/Users/jianbo/Desktop/StringPut.java");
			int bytes = fis.read(buf,0,2056);
			String str = new String(buf,0,bytes);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
