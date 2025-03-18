package pac1;

import java.util.Scanner;

public class assignment1 {
	//first scanner class for taking int value
static Scanner scannerObjectNumber=new Scanner(System.in);

//second scanner class for taking string value
static Scanner scannerObjectString=new Scanner(System.in);

//global string variables
static String firstString,secondString;

static boolean isValid=true;

	public static void main(String[] args) {
		
		while(isValid) {
			//using try-catch block to handle exceptions
			try {
	System.out.println("Select option\n"
	+"1.Compare two strings\n"+"2.Reverse a string\n"
	+"3.Flip cases of a string\n"+"4.Find largest word of a string\n"
	+"5.Exit");

	int input=scannerObjectNumber.nextInt();
	switch(input) {

	//first case for comparing 2 strings
	case 1:
		firstString=inputFromUser();
		secondString=inputFromUser();
		System.out.println(compareString(firstString, secondString));
		break;
		
	//second case to reverse a string
	case 2:
		firstString=inputFromUser();
		System.out.println("Reversed string is "+reverseString(firstString));
		break;
		
	//third case to flip cases of a string
	case 3:
		firstString=inputFromUser();
		System.out.println("New string is "+flipCases(firstString));
		break;
		
	//fourth case to find largest word in a string
	case 4:
		firstString=inputFromUser();
		System.out.println("Largest string is "+largestWord(firstString));
		break;
		
	//fifth case for terminating program	
	case 5:
		System.out.println("Program ended successfully");
		isValid=false;
		break;
		
	//default cases to handle edge cases
	default:
		System.out.println("Please enter valid input");
	}
			}
			catch(Exception e) {
				System.out.println("Please enter valid input");
				scannerObjectNumber.nextLine();
			}
		}
		
	}
	
	//taking string as input from user
	static String inputFromUser() {
		System.out.println("Enter a string");
		String inputString=scannerObjectString.nextLine();
		return inputString;	  
	}
	
	//compare two strings
	static int compareString(String firstInputString, String secondInputString) {
		int firstInputStringIndex=0;
		int secondInputStringIndex=0;
		while(firstInputStringIndex<firstInputString.length() && secondInputStringIndex<secondInputString.length()){
			if(firstInputString.charAt(firstInputStringIndex)==secondInputString.charAt(secondInputStringIndex)) {}
			else return 0;
			firstInputStringIndex++;
		    secondInputStringIndex++;
		}
		
		if(firstInputStringIndex==firstInputString.length() && secondInputStringIndex==secondInputString.length()) {
			return 1;
		}
		else return 0;
	}
	
	//reverse a string
	static String reverseString(String inputString) {
		String reversedString="";
		for(int inputStringIndex=inputString.length()-1;inputStringIndex>=0;inputStringIndex--) {
			reversedString+=inputString.charAt(inputStringIndex);
		}
		return reversedString;
	}
	
	//flip lowercase letters to uppercase and vice-verse
	static String flipCases(String inputString) {
		String ansString="";
		char stringCharacter;
		for(int inputStringInde=0;inputStringInde<inputString.length();inputStringInde++) {
			if(inputString.charAt(inputStringInde)>=97 && inputString.charAt(inputStringInde)<=122) {
				stringCharacter=(char)(inputString.charAt(inputStringInde)-32);
				ansString+=stringCharacter;
			}
			else if(inputString.charAt(inputStringInde)>=65 && inputString.charAt(inputStringInde)<=90) {
				stringCharacter=(char)(inputString.charAt(inputStringInde)+32);
				ansString+=stringCharacter;
			}
			else ansString+=inputString.charAt(inputStringInde);
		}
		return ansString;
	}
	
	//find largest word in a string and return it
	static String largestWord(String inputString) {
		String stringArray[]=inputString.split(" ");
		String largestWord="";
		for(int stringArrayIndex=0;stringArrayIndex<stringArray.length;stringArrayIndex++) {
			if(stringArray[stringArrayIndex].length()>largestWord.length())largestWord=stringArray[stringArrayIndex];
		}
		return largestWord;
	}
}
