package java_ex100;

import java.util.Scanner;

public class ex100_14 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
		int hour = scanner.nextInt();

		int minute = scanner.nextInt();
		
		System.out.printf("%d:%d",hour,minute);
	        
		scanner.close();
	}
}
