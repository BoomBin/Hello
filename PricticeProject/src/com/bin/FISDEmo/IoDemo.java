package com.bin.FISDEmo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 编写一个Java程序将当100,101,102,103,104,105
 * 个数以数组的形式写入到Dest.txt文件中，
 * 并以相反的顺序读出显示在屏幕上
 * @author jiabin
 *
 */
public class IoDemo {
	public static void main(String[] args) throws Exception {
		int data[] = {100,101,102,103,104,105};
		int t;
		DataOutputStream ops = new DataOutputStream(new FileOutputStream("dest.text"));
		for(int i=0;i<data.length;i++) {
			ops.writeInt(data[i]);	
		}
		ops.close();
		DataInputStream dis = new DataInputStream(new FileInputStream("dest.txt"));
		for(int i=data.length-1;i>=0;i--) {
			t = dis.readInt();
			System.out.println(" "+t);
		}
		dis.close();
	}
}
