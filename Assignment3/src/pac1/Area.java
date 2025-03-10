package pac1;

import java.util.Scanner;

public class Area {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//using try-catch block to handle exception
		try {System.out.println("Enter whose area you want to calculate\n"
        +"1.Triangle\n"+"2.Rectangle\n"+"3.Square\n"+"4.Circle");
        int input=sc.nextInt();
        switch(input) {
        //case 1 for triangle
        case 1:
        	double width = input("width");
        	double height = input("height");
        	System.out.println("Area of triangle is "+(0.5 * width * height));
        	break;
        	//case 2 for rectangle
        case 2:
        	double width1 = input("width");
        	double height2 = input("height");
        	System.out.println("Area of rectangle is "+(width1 * height2));
        	break;
        	//case 3 for square
        case 3:        	
        	double width3 = input("width");
        	System.out.println("Area of square is "+(width3 * width3));
        	break;
        	//case 3 for circle
        case 4:
        	double radius = input("radius");
        	System.out.println("Area of circle is "+(3.14 * radius * radius));
        	break;
        default:
        	System.out.println("Enter valid input");
        }
		}
		catch(Exception e)
		{
			System.out.println("Please enter valid input");
		}
	}
	
	//taking inputs
	static double input(String a) {
		System.out.println("Enter "+a);
		double in = sc.nextDouble();
		return in;
	}

}
