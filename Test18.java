/*һ��С���100�߶���������,
ÿ����غ�����ԭ�߶ȵ�һ��,
�����£������ڵ�ʮ�����ʱ,
������������?��10�η������?
*/
public class Test18{
	public static void main(String[] args){
		double high = 100;
		double j = high;
			for(int i = 1;i<=10;i++){
			
				if(i == 1){
					System.out.println(high);
				}
					
				else if( i !=10){
					j=j/2;
					high += j;
				System.out.println(high);
				}else{
					System.out.println(j);
				}
			
		}
	
	}
}