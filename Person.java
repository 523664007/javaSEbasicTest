package com.y.test;

public class Person {
	                 // 编号         
	int pNo;
	                 // 姓名
	String name;
	                 // 性别 
	char sex;
	                 // 年龄
	int age;
	                 // 婚否
	boolean isMarry;
	                 // 身份证号
	String  idCard;
	                 // 地址
	String  addRess;
	                 // 手机号  
	String  telNo;   
	                 // 伴侣名 
	String  partnerName;
	
	                 //结婚
	public boolean marry(Person anotherPerson) { 
	                 // 男须满22周岁    女需满20周岁
		             // 都是未婚
		             // 性别必须不同
		if(this.age >=(this.sex == '男'?22:20)&&(anotherPerson.age >=(this.sex =='男'?22:20))){
		    if(this.isMarry ==false&&anotherPerson.isMarry ==false) {
		    	if(this.sex != anotherPerson.sex) {
		    		this.isMarry = true;
		    		anotherPerson.isMarry = true;
		    		this.partnerName = anotherPerson.name;
		    		anotherPerson.partnerName = this.name;
		    		return true;
		    	}
		    }	
		}
		return false;
		}

}
