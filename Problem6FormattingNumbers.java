/*Problem 6.	Formatting Numbers*/

import java.util.Scanner;

public class Problem6FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int intNu = input.nextInt();
		float ftNu1 = input.nextFloat();
		float ftNu2 = input.nextFloat();
		
		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|"
				,Integer.toHexString(intNu).toUpperCase()
				,Integer.parseInt(Integer.toBinaryString(intNu))
				,ftNu1,ftNu2);
	}
}
