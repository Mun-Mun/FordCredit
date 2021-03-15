import java.util.Scanner;

public class MustangBronco {
	
	public static String displayedString(int input) { //The method that creates the displayed string 
		String output = "";
		if(input % 3 == 0 && input % 5 == 0) { 
			output = "MustangBronco";
		}
		else if(input % 3 == 0) {
			output = "Mustang";
		}
		else if(input % 5 == 0) {
			output = "Bronco";
		}
		else {
			output = String.valueOf(input);
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);   //Made the main method able to repeat itself to test multiple cases
		System.out.println("Enter q to quit");
		while(true) {
			System.out.println("Enter in a Integer: ");
			if(in.hasNext()) {
				if(in.hasNextInt()) {
					System.out.println("The Displayed String: " + displayedString(in.nextInt()));
				}
				else if(in.next().equals("q")) {
					break;
				}
			}
		}
		in.close();
	}
}
