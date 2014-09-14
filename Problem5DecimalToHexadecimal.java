/*Problem 5.	Decimal to Hexadecimal
Write a program that enters a positive integer number num 
and converts and prints it in hexadecimal form. 
You may use some built-in method from the standard Java libraries. 
*/
import java.util.Scanner;

public class Problem5DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decN = input.nextInt();
		String hexN = Integer.toHexString(decN);
		System.out.println(hexN.toUpperCase());
	}
}
