//������1~100���ۼ�ֵ����Ҫ���������и�λΪ3������
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