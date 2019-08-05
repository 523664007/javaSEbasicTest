/*一个小球从100高度自由落下,
每次落地后反跳回原高度的一半,
再落下，求它在第十次落地时,
共经过多少米?第10次反弹多高?
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