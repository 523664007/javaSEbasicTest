public class House{
	public static void main(String[] args){
		for(int i = 0;i<10;i++){
			for(int j = 0;j<15;j++){
				if(i+j>=4&&i+j<=9&&i<5){
					System.out.print("*");		
				}else if(j-i==10&&i<5){
				    System.out.print("*");
				}else if (i==5||i==9){
						System.out.print("*");
				}else if(i>=5&&i<=9){
					if(j==0||j==14){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else{
						System.out.print(" ");
			    }
		    }
		        System.out.println();
	    }
    }
}