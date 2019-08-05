//Ë®ÏÉ»¨Êı
public class Test17{
public static void main(String[] args){
	for(int i = 100;i<=999;i++){
		int k=0;
		int m = i;
		for(int j = 1;j<=3;j++){
		k += Math.pow((m%10),3);
		m=(int)(m/10);
		}
		if(k==i){
			System.out.println(i);
		}
	}
}
}