package com.y.test;
/**
 * @author gjy
 * @since 2019.08.08
 * @version1.0 
 * */
public class Circle {
		
	 Point p ;  				//Բ��
	 double r;                  //�뾶
	public Circle(Point p,int r) {
		this.p = p;
		this.r = r;
	}
	                           //���㵱ǰͼ�ε���� 
	public double getArea() {
		return Math.PI*this.r*this.r; 
	}
	                           //���㵱ǰͼ���Ƿ����ָ���ĵ�
	public boolean contains(Point p2) {
	double instance = this.p.getInstance(p2);
	    if(instance <= r) {
	    	return true;
	    }else {
	    	return false;
	    }	
				
	}
	
	
	
}
