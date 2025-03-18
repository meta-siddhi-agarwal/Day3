package pac1;

import java.util.Scanner;

public class Area {
	
static Scanner scannerObj=new Scanner(System.in);

static double width, height, radius;

static boolean isValid=true;

	public static void main(String[] args) {
		while(isValid) {
			//using try-catch block to handle exception
			try {System.out.println("Enter whose area you want to calculate\n"
	        +"1.Triangle\n"+"2.Rectangle\n"+"3.Square\n"+"4.Circle\n"
			+"5.Exit");
	        int input=scannerObj.nextInt();
	        switch(input) {
	        //case 1 for triangle
	        case 1:
	        	width = inputFromUser("width");
	        	height = inputFromUser("height");
	        	System.out.println("Area of triangle is "+(areaOfTriangle(width, height)));
	        	break;
	        	//case 2 for rectangle
	        case 2:
	        	width = inputFromUser("width");
	        	height = inputFromUser("height");
	        	System.out.println("Area of rectangle is "+(areaOfRectangle(width, height)));
	        	break;
	        	//case 3 for square
	        case 3:        	
	        	width= inputFromUser("width");
	        	System.out.println("Area of square is "+(areaOfSquare(width)));
	        	break;
	        	//case 3 for circle
	        case 4:
	        	radius = inputFromUser("radius");
	        	System.out.println("Area of circle is "+(areaOfCircle(3.14 * radius * radius)));
	        	break;
	        	//default test case for handling edge cases
	        case 5:
	        	System.out.println("Program terminated successfully");
	        	isValid=false;
	        default:
	        	System.out.println("Enter valid input");
	        }
			}
			catch(Exception e)
			{
				System.out.println("Please enter valid input");
				scannerObj.nextLine();
			}

		}
		
			}
	
	//taking inputs from user
	static double inputFromUser(String inputName) {
		System.out.println("Enter "+inputName);
		double input = scannerObj.nextDouble();
		return input;
	}

	static double areaOfTriangle(double width,double height) {
		return (0.5 * width * height);
	}
	
	static double areaOfRectangle(double width,double height) {
		return (width * height);
	}
	
	static double areaOfSquare(double width) {
		return (width * width);
	}
	
	static double areaOfCircle(double radius) {
		return (3.14 * radius * radius);
	}
}
