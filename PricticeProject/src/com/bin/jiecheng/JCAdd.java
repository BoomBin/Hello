package com.bin.jiecheng;

/**
 * 编写一个Java程序在屏幕上输出1！+2！+3！+……+10！的和
 * 
 * @author jiabin
 *
 */
public class JCAdd {
	/**
	 
		
	
	int  i,j,mul,sum=0;
		for(i=1;i<=10;i++) {
			mul=1;
			for(j=1;j<=i;j++) {
				mul=mul*j;
			}
		    sum=sum+mul;
		}
		System.out.println("1！+2！+3！+……+10！= "+sum);
	*/
	public static void main( String args[] ) {
		int sum ,totalSum = 0;
		for(int i=1;i<=10;i++) {
			sum = 1;
			for(int j=1;j<=i;j++) {
				sum = j*sum;
			}
			totalSum = totalSum + sum;
		}
		System.out.println("和是："+totalSum);
		
	}

}
