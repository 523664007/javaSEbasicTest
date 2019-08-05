//空心正方形
public class Test15{
	public static void main(String[] args){
		int line = 11;
		for(int i = 1;i <= line;i++){
	 		for( int j = 1;j <= line;j++){
					if(i == 1||i ==line){
					    System.out.print("*");
					}else if(j==1||j==line){
					    System.out.print("*");	
					}else{
						System.out.print(" ");
					}
				    }
				System.out.print("\n");
			    }	
			}
		}
	