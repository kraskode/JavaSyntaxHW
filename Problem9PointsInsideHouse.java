/*Problem 9.	** Points inside the House
Write a program to check whether a point is inside or outside the house below. The point is given as a pair of floating-point numbers, separated by a space. Your program should print "Inside" or "Outside". 
*/
import java.util.Scanner;

public class Problem9PointsInsideHouse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double px = scan.nextDouble();
		double py = scan.nextDouble();
		
		boolean f1=false;
		boolean f2=false;
		boolean f3=false;
		
		if ((px>=12.5 && px<=17.5) && (py>=8.5 && py<=13.5)) {
			f1=true;
		}
		if ((px>=20 && px<=22.5) && (py>=8.5 && py<=13.5)) {
			f2=true;
		}
		
		double ax = 12.5;
		double ay = 8.5;
		double bx = 22.5;
		double by = 8.5;
		double cx = 17.5;
		double cy = 3.5;	
		
		double rfArea = Math.abs(triangleArea(ax, ay, bx, by, cx, cy));
		double rfArea1 = Math.abs(triangleArea(ax, ay, bx, by, px, py));
		double rfArea2 = Math.abs(triangleArea(ax, ay, px, py, cx, cy));
		double rfArea3 = Math.abs(triangleArea(px, py, bx, by, cx, cy));
		
		if (rfArea == rfArea1 +rfArea2 +rfArea3 ) {
			f3=true;
		}
		if (f1==true || f2==true || f3==true) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}

	private static double triangleArea(double ax, double ay, double bx,
			double by, double cx, double cy) {
		double area = (ax*(by-cy) + bx*(cy-ay) +cx*(ay-by)) / 2;
		return area;
	}

}
