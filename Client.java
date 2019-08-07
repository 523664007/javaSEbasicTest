package com.y.test;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Client {
	public static void main(String[] args) {
		welcome();
	}
	public static void welcome(){
		 System.out.println("这是一个RPG游戏：");
		 System.out.println("1.开始游戏");
		 System.out.println("2.游戏规则");
		 System.out.println("3.结束游戏");
	     System.out.println("请输入您想进行的操作：");
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
			    	System.out.println("输入有误，请重新输入");
			    	welcome();
			    	break;
		     }
		 }
	
	    
		public static void createNewGame(){
			GamePlayer[]players = {};
			Scanner scanner = new Scanner(System.in);
	        System.out.println("请输入您的游戏名字：");
					Scanner scanner1 = new Scanner(System.in);
				    String name = scanner1.next();
					System.out.println("请输入您的游戏角色的种族： 1.人类 2.精灵 3.兽人 4.小矮人 5.元素 ");
					Scanner scanner2 = new Scanner(System.in);
					int race= scanner2.nextInt();
					
					System.out.println("请角色选择性别：1.男 2.女");	
					Scanner scanner3 = new Scanner(System.in);
					int sex = scanner3.nextInt();
					    
			      GamePlayer gp = new GamePlayer();
			      gp.name = name;
  		          gp.race = race;
		          gp.sex = sex;
			      GamePlayer[] copyOf = Arrays.copyOf(players,players.length+1);
			      copyOf[copyOf.length-1] = gp;
			      if(copyOf !=null) {
			    	  System.out.println("创建成功");
				      System.out.println("您的英雄名叫:"+gp.name);
				      System.out.println("您的英雄种族叫:"+gp.race);
				      System.out.println("您的英雄性别是:"+gp.sex);
				      int power = gp.getPower();
				      System.out.println("您的英雄力量初始为:"+power);
				      int dex = gp.getDex();
				      System.out.println("您的英雄敏捷初始为:"+dex);
				      int wit = gp.getWit();
				      System.out.println("您的英雄智力初始为:"+wit);
				      int wisdom = gp.getWisdom();
         		      System.out.println("您的英雄智慧初始为:"+wisdom);
			      }
			      welcome();
	}
		public static void gameRule () {
			System.out.println("创建角色，HP和MP初始值为1000，力量、敏捷、智慧、智力随机分配");
		}
		public static void gameOver() {
			System.exit(0);
		}
}
