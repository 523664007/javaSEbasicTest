package com.y.test;

public class Person {
	                 // ���         
	int pNo;
	                 // ����
	String name;
	                 // �Ա� 
	char sex;
	                 // ����
	int age;
	                 // ���
	boolean isMarry;
	                 // ���֤��
	String  idCard;
	                 // ��ַ
	String  addRess;
	                 // �ֻ���  
	String  telNo;   
	                 // ������ 
	String  partnerName;
	
	                 //���
	public boolean marry(Person anotherPerson) { 
	                 // ������22����    Ů����20����
		             // ����δ��
		             // �Ա���벻ͬ
		if(this.age >=(this.sex == '��'?22:20)&&(anotherPerson.age >=(this.sex =='��'?22:20))){
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
