package com.y.test;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Client {
	public static void main(String[] args) {
		welcome();
	}
	public static void welcome(){
		 System.out.println("����һ��RPG��Ϸ��");
		 System.out.println("1.��ʼ��Ϸ");
		 System.out.println("2.��Ϸ����");
		 System.out.println("3.������Ϸ");
	     System.out.println("������������еĲ�����");
		     Scanner scanner = new Scanner(System.in);
		     int num = scanner.nextInt();
		     switch (num) {
		        case 1:
			        createNewGame();
			        break;
		        case 2:
		             gameRule();
		             welcome();
		            break;
		        case 3:
			       gameOver();
			        break ;
			    default :
			    	System.out.println("������������������");
			    	welcome();
			    	break;
		     }
		 }
	
	    
		public static void createNewGame(){
			GamePlayer[]players = {};
			Scanner scanner = new Scanner(System.in);
	        System.out.println("������������Ϸ���֣�");
					Scanner scanner1 = new Scanner(System.in);
				    String name = scanner1.next();
					System.out.println("������������Ϸ��ɫ�����壺 1.���� 2.���� 3.���� 4.С���� 5.Ԫ�� ");
					Scanner scanner2 = new Scanner(System.in);
					int race= scanner2.nextInt();
					
					System.out.println("���ɫѡ���Ա�1.�� 2.Ů");	
					Scanner scanner3 = new Scanner(System.in);
					int sex = scanner3.nextInt();
					    
			      GamePlayer gp = new GamePlayer();
			      gp.name = name;
  		          gp.race = race;
		          gp.sex = sex;
			      GamePlayer[] copyOf = Arrays.copyOf(players,players.length+1);
			      copyOf[copyOf.length-1] = gp;
			      if(copyOf !=null) {
			    	  System.out.println("�����ɹ�");
				      System.out.println("����Ӣ������:"+gp.name);
				      System.out.println("����Ӣ�������:"+gp.race);
				      System.out.println("����Ӣ���Ա���:"+gp.sex);
				      int power = gp.getPower();
				      System.out.println("����Ӣ��������ʼΪ:"+power);
				      int dex = gp.getDex();
				      System.out.println("����Ӣ�����ݳ�ʼΪ:"+dex);
				      int wit = gp.getWit();
				      System.out.println("����Ӣ��������ʼΪ:"+wit);
				      int wisdom = gp.getWisdom();
         		      System.out.println("����Ӣ���ǻ۳�ʼΪ:"+wisdom);
			      }
			      welcome();
	}
		public static void gameRule () {
			System.out.println("������ɫ��HP��MP��ʼֵΪ1000�����������ݡ��ǻۡ������������");
		}
		public static void gameOver() {
			System.exit(0);
		}
}
