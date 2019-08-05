import java.util.*;
public class TelTest{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入传输数据：");	
		int num = sc.nextInt();
		int first = num%10;        //个位
		int second = num/10%10;    //十位
		int thirdly = num/100%10;  //百位
 		int forth  = num/1000;     //千位
		first = (first+5)%10;
		second = (second+5)%10;
		thirdly = (thirdly+5)%10;
		forth = (forth+5)%10;
		int result = first*1000+second*100+thirdly*10+forth;
		System.out.print(result);
	} 
}