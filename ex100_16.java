package java_ex100;

import java.util.Scanner;

public class ex100_16 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
		int num = scanner.nextInt();
		
		System.out.println(Integer.toOctalString(num));
	        
		scanner.close();
	}
}
