import java.awt.Point;
import java.lang.Math;
import java.util.Scanner;
public class ManhattanDistance {
	
	public static int findManDist(Point a, Point b) { //Finds the distance Manhattan Distance from one point to the other
		double xDist = Math.abs(a.getX() - b.getX()); //getX() returns a double, we get the distance of the two points for the X values 
		double yDist = Math.abs(a.getY() - b.getY()); //Same thing as the line above except for the Y values
		
		return (int)(xDist + yDist); //Combines the x distance and y distance to get the Manhattan Distance
	}
	
	public static Point removeChars(String input) { //depending on how the user input the points, we remove ','
		int xDigit = 0, yDigit = 0;					//or space from the input and make the input into a Point object
		String tempDig = "";
		for(int i = 0; i < input.length(); i++) {
			if(input.substring(i, i + 1).equals(",") || input.substring(i, i + 1).equals(" ")) {
				xDigit = Integer.parseInt(tempDig);
				tempDig = "";
			}
			else {
				tempDig += input.substring(i, i + 1);
			}
		}
		yDigit = Integer.parseInt(tempDig);
		Point p = new Point(xDigit, yDigit);
		return p;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  //Made the main method able to repeat itself to test multiple cases
		Point a = null, b = null;
		System.out.println("Enter q to quit");
		while(true) {
			System.out.println("Enter in the first point: ");
			if(in.hasNext()) {
				String line = in.nextLine();
				if(line.equals("q")) {
					break;
				}
				a = removeChars(line);
			}
			System.out.println("Enter in the second point: ");
			if(in.hasNext()) {
				String line = in.nextLine();
				if(line.equals("q")) {
					break;
				}
				b = removeChars(line);
			}
			System.out.println("The Manhattan Distance from point A to point B is " + findManDist(a, b));
		}
		in.close();
	}
}
