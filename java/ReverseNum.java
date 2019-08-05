//ÕûÊý·­×ª
public class ReverseNum{
	public static void main(String[] args){
		int num =56123;
		String changedNum = String.valueOf(num);
		StringBuffer stringBuffer = new StringBuffer(changedNum);
 	    StringBuffer stringBuffer2 = stringBuffer.reverse();
	    String str = stringBuffer2.toString();
        int finalNum = Integer.parseInt(str);
        System.out.print(finalNum);		
	}
}