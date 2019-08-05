import java.util.Arrays;
public class Test16{
	public static void main(String[] args){
		int[] a={1,7,9,11,13,15,17,19};
		int[] b={2,4,6,8,10};
		int[] c= new int[a.length+b.length];
        System.arraycopy(a,0,c,0,8);
	    System.arraycopy(b,0,c,8,5);
		Arrays.sort(c);
	    System.out.print(Arrays.toString(c));
	}
}