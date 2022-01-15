import java.util.*;

public class sumFunctions{
	public static int calculatesum(int a, int b){
		int sum = a + b;
		return sum;
	}
	
	public static void main(String agrs[]){
		Scanner in = new Scanner(System.in);
		
		int a=in.nextInt();
		int b=in.nextInt();
		int sum = calculatesum(a,b);
		System.out.println(sum);
		
		
	}
}