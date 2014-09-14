/*Problem 8.	* Count of Equal Bit Pairs
Write a program to count how many sequences of two equal bits ("00" or "11") can be found in the binary representation of given integer number n (with overlapping). 
*/
import java.util.Scanner;

public class Problem8CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		String str = Integer.toBinaryString(num);
		char[] chA = str.toCharArray();
		int counter1 = 0;
		int counter0 = 0;
		
		for (int i = 0; i < chA.length - 1; i++) {
			
			if ((chA[i] == '1') && (chA[i+1] == '1') ) {
					counter1++;
			}
			if ((chA[i] == '0') && (chA[i+1] == '0')) {
					counter0++;
			}			
		}
		int result = counter1 + counter0;
		System.out.println(result);		
	}
}
