package com.y.test;
/** 
 *@author gjy
 * @since 2019.08.08
 * @version1.0 
 * */
public class Point {
	int x;
	int y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
    public Point(int c) {
        this(c,c);
    }
    public double getInstance() {
    	return Math.sqrt(this.x*this.x+this.y+this.y);
    }
    public double getInstance(int x1,int y1) {
    	return Math.sqrt(Math.pow(this.x-x1, 2)+Math.pow(this.y-y1, 2));
    }
    public double getInstance(Point p) {
    	return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
    }
}