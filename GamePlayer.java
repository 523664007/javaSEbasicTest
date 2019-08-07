package com.y.test;
import java.util.*;

public class GamePlayer {
   public String name;                  //名字
   public int sex;                      //性别
   public int race;                     //种族
   public String career;                //职业
   public int power;                    //力量
   public int dex;                      //敏捷
   public int wit;                      //智力
   public int wisdom;                   //智慧
   public int hp;                       //生命值
   public int mp;                       //魔法值
 
     public int getPower() { 	
    	 Random random = new Random();
 		int nextInt = random.nextInt(10000);
 		return nextInt;
}
     public int getDex() { 	
    	 Random random = new Random();
 		int nextInt = random.nextInt(10000);
 		return nextInt;
}
     public int getWit() { 	
    	 Random random = new Random();
 		int nextInt = random.nextInt(10000);
 		return nextInt;
}
     public int getWisdom() { 	
    	 Random random = new Random();
 		int nextInt = random.nextInt(10000);
 		return nextInt;
}
}
