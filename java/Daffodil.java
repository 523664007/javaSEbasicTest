//1000���ڵ�ˮ�ɻ���
public class Daffodil{
	public static void main(String[] args){
		//��λi%10 ʮλi/10%10 ��λ i/100
		for(int i = 100; i<1000;i++){
			int result = (int)Math.pow(i%10,3)+(int)Math.pow(i/10%10,3)+(int)Math.pow(i/100,3);
			if(i == result){
				System.out.println(i);
			}
		}
	}
}