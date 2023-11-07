package java_ex100;

import java.util.Scanner;

public class ex100_21 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
		int a = scanner.nextInt();
	        
		int b = scanner.nextInt();
	        
		System.out.println(a*Math.pow(2,b));
	        
		scanner.close();
	}
}
