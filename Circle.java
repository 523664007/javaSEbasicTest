package com.y.test;
/**
 * @author gjy
 * @since 2019.08.08
 * @version1.0 
 * */
public class Circle {
		
	 Point p ;  				//圆心
	 double r;                  //半径
	public Circle(Point p,int r) {
		this.p = p;
		this.r = r;
	}
	                           //计算当前图形的面积 
	public double getArea() {
		return Math.PI*this.r*this.r; 
	}
	                           //计算当前图形是否包含指定的点
	public boolean contains(Point p2) {
	double instance = this.p.getInstance(p2);
	    if(instance <= r) {
	    	return true;
	    }else {
	    	return false;
	    }	
				
	}
	
	
	
}
