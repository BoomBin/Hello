package com.bin.Cricle;

public class Cylinder extends Circle{
	private double hight;
	
	Cylinder(double r,double h){
		super(r);
		hight = h;
	}
	
	public double getVolume() {
		
		return getArea()*hight;
	}
	public void showVolume() {
		System.out.println("圆柱体积="+getVolume());
	}
	public void showPerimeter() {
		System.out.println("圆柱底的周长="+getPerimeter());
	}
}
