//求整数1~100的累加值，但要求跳过所有个位为3的数。
public class Test19{
	public static void main(String[] args){
			int num = 0;
		for(int i = 1;i<=100;i++){
		 
			if(i%10 !=3){
				num += i  ;	
		    }
		}
	System.out.println(num);
	}
}