/*Problem 7.	Count of Bits One
Write a program to calculate the count of bits 1 in the binary representation of given integer number n. 
*/
import java.util.Scanner;

public class Problem7CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String str = Integer.toBinaryString(n);
		char[] chArry = str.toCharArray();
		int bits1 = 0;
		for (int i = 0; i < chArry.length; i++) {
			if (chArry[i] == '1') {
				bits1++;
			}
		}
		System.out.println(bits1);
	}

}
