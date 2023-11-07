package java_ex100;

import java.util.Scanner;

public class ex100_18 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		String result = scanner.nextLine();
		char c = result.charAt(0);
		int num = (int)c;
		
		System.out.println(num);
	        
		scanner.close();
	}
}
