import java.util.Scanner;

/*Problem 3.	Points inside a Figure
Write a program to check whether a point is inside or outside of the figure below. 
The point is given as a pair of floating-point numbers, separated by a space. 
Your program should print "Inside" or "Outside". 
*/
public class Problem3PointsInsideFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float px = input.nextFloat();
		float py = input.nextFloat();
		
		boolean rect1 = false;
		boolean rect2 = false;
		boolean rect3 = false;
		
		if (px >= 12.5 && px <= 22.5 && py >= 6 && py <= 8.5) {
			rect1 = true;
		}
		if (px >= 12.5 && px <= 17.5 && py >= 8.5 && py <= 13.5) {
			rect2 = true;
		}
		if (px >= 20 && px <= 22.5 && py >= 8.5 && py <= 13.5) {
			rect3 = true;
		}
		if (rect1==true || rect2==true || rect3==true) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
		input.close();
	}
}
