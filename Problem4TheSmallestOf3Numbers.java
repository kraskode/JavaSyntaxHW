import java.util.Scanner;

/*Problem 4.	The Smallest of 3 Numbers
Write a program that finds the smallest of three numbers. 
*/
public class Problem4TheSmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double smlstN = Double.MAX_VALUE;
		
		double[] nums = new double[3];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextDouble();
			
			if (nums[i] < smlstN) {
				smlstN = nums[i];
			}
		}
		
        if(smlstN % 1 == 0)
        {
            System.out.println((int)(smlstN));
        }
        else
        {
            System.out.println(smlstN);
        }		
	}
}
