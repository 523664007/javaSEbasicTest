package com.y.test;
import java.util.*;

public class GamePlayer {
   public String name;                  //����
   public int sex;                      //�Ա�
   public int race;                     //����
   public String career;                //ְҵ
   public int power;                    //����
   public int dex;                      //����
   public int wit;                      //����
   public int wisdom;                   //�ǻ�
   public int hp;                       //����ֵ
   public int mp;                       //ħ��ֵ
 
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
