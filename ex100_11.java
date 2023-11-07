package java_ex100;

import java.util.Scanner;

public class ex100_11 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
		char a = scanner.next().charAt(0);
		
		char b = scanner.next().charAt(0);
		
		System.out.printf("%c %c", b, a);
	        
		scanner.close();
	}
}
