package java_ex100;

import java.util.Scanner;

public class ex100_15 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int date = scanner.nextInt();
		
		System.out.printf("%4d.%02d.%02d",year, month, date);
	        
		scanner.close();
	}
}
