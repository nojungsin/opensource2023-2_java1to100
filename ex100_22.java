package java_ex100;

import java.util.Scanner;

public class ex100_22 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
		int a = scanner.nextInt();
	        
		int b = scanner.nextInt();
	        
		if (a>b) System.out.println("1");
		else System.out.println("0");
	        
		scanner.close();
	}
}
