//1000以内的水仙花数
public class Daffodil{
	public static void main(String[] args){
		//个位i%10 十位i/10%10 百位 i/100
		for(int i = 100; i<1000;i++){
			int result = (int)Math.pow(i%10,3)+(int)Math.pow(i/10%10,3)+(int)Math.pow(i/100,3);
			if(i == result){
				System.out.println(i);
			}
		}
	}
}