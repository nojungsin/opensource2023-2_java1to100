package java_ex100;

import java.util.Scanner;

public class ex100_20 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
		int a = scanner.nextInt();
	        
		int b = scanner.nextInt();
		
		int c = scanner.nextInt();
	        
		int result = a + b + c;
		System.out.println(result);
		System.out.printf("%.01f",(float)result/3);
	        
		scanner.close();
	}
}
