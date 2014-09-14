import java.util.Scanner;

/*Problem 2.	Triangle Area
Write a program that enters 3 points in the plane (as integer x and y coordinates), 
calculates and prints the area of the triangle composed by these 3 points. 
Round the result to a whole number. 
In case the three points do not form a triangle, print "0" as result. 
*/
public class Problem2TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int ax = input.nextInt();
		int ay = input.nextInt();
		int bx = input.nextInt();
		int by = input.nextInt();
		int cx = input.nextInt();
		int cy = input.nextInt();
		
		int area = (ax*(by-cy) + bx*(cy-ay) +cx*(ay-by)) / 2; 
		System.out.println(Math.abs(area));
		
		input.close();
	}

}
