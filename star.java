import java.util.*;
public class star{

public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
	System.out.println("Hello ! How many stars would you like ?");
	int ns = in.nextInt();
	for(int i =1; i <= ns; i++){
		for(int j = 0; j < i; j++){
			System.out.print("*");
		}
		System.out.println( );
	}
	
	for(int i =ns - 1; i>0; i--){
		for(int j = 0; j<i; j++){
			System.out.print("*");
		}
		System.out.println( );
	}
}
}