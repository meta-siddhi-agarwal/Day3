package pac1;

import java.util.Scanner;

public class assignment1 {
	//first scanner class for taking int value
static Scanner sc=new Scanner(System.in);

//second scanner class for taking string value
static Scanner sc1=new Scanner(System.in);
	public static void main(String[] args) {
		//using try-catch block to handle exceptions
		try {
System.out.println("Select option\n"
+"1.Compare two strings\n"+"2.Reverse a string\n"
+"3.Flip cases of a string\n"+"4.Find largest word of a string");
int input=sc.nextInt();
switch(input) {
//first case for comparing 2 strings
case 1:
	String s1=input();
	String s2=input();
	System.out.println(comp(s1, s2));
	break;
//second case to reverse a string
case 2:
	String s3=input();
	System.out.println("Reversed string is "+reverse(s3));
	break;
//third case to flip cases of a string
case 3:
	String s4=input();
	System.out.println("New string is "+flip(s4));
	break;
//fourth case to find largest word in a string
case 4:
	String s5=input();
	System.out.println("Largest string is "+largest(s5));
	break;
//default cases to handle edge cases
default:
	System.out.println("Please enter valid input");
}
		}
		catch(Exception e) {
			System.out.println("Please enter valid input");
		}
	}
	
	//taking string as input from user
	static String input() {
		System.out.println("Enter a string");
		String a=sc1.nextLine();
		return a;	  
	}
	
	//compare two strings
	static int comp(String a, String b) {
		if(a.equals(b))return 1;
		else return 0;
	}
	
	//reverse a string
	static String reverse(String a) {
		String ans="";
		for(int i=a.length()-1;i>=0;i--) {
			ans+=a.charAt(i);
		}
		return ans;
	}
	
	//flip lowercase letters to uppercase and vice-verse
	static String flip(String a) {
		String ans="";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>=97 && a.charAt(i)<=122) {
				char ch=(char)(a.charAt(i)-32);
				ans+=ch;
			}
			else if(a.charAt(i)>=65 && a.charAt(i)<=90) {
				char ch=(char)(a.charAt(i)+32);
				ans+=ch;
			}
			else ans+=a.charAt(i);
		}
		return ans;
	}
	
	//find largest word in a string and return it
	static String largest(String a) {
		String ans[]=a.split(" ");
		String max="";
		for(int i=0;i<ans.length;i++) {
			if(ans[i].length()>max.length())max=ans[i];
		}
		return max;
	}
}
