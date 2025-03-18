package pac1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarkSheet {
	
//storing marks in arraylist
static List<Integer> marksList=new ArrayList<>();

//creating scanner obj. for taking input from user
static Scanner scannerObject=new Scanner(System.in);

static boolean isValid=true;

public static void main(String[] args) {
	
	while(isValid) {
		System.out.println("Enter no. of students ");
		try 
		{
		int noOfStudents=scannerObject.nextInt();
		if(noOfStudents<0)throw new Exception();
		for(int i=0;i<noOfStudents;i++)
		{
			System.out.println("Enter marks of student "
			+(i+1));
			int marks=scannerObject.nextInt();
			if(marks>=0 && marks<=100)marksList.add(marks);
			else {
				throw new Exception();
			}
		}
		isValid=false;
		}
		catch(Exception e) {
			System.out.println("Please enter valid no.");
			scannerObject.nextLine();
		}
	}
		
	isValid=true;
	while(isValid) {
	
		try {
			System.out.println("Select operation to perform\n"
					+"1.Average of marks\n"+"2.Maximum marks\n"
					+"3.Minimum marks\n"+"4.Percentage of students passed"
					+"5.Exit");
					int input=scannerObject.nextInt();
					switch(input)
					{
					//case 1 to calculate avg. of marks
						case 1:
						System.out.println("Avg. marks is "+average(marksList));
						break;
					//case 2 to find max. no.
						case 2:
					    System.out.println("Max. marks is "+max(marksList));
					    break;
					//case 3 to find min. no.
						case 3:
						System.out.println("Min. marks is "+min(marksList));
						break;
					//case 4 to find % of students who passes
						case 4:
						System.out.println("Percentage of students who passed is "+passing_percentage(marksList));
						break;
					//case 5 for terminating program
						case 5:
						System.out.println("Program ended successfully");
						isValid=false;
						break;
					//default case to handle edge cases
						default:
						System.out.println("Please enter valid no.");
					}
		
				}
		catch(Exception e) {
			System.out.println("Enter valid input");
			scannerObject.nextLine();
		}

	}
	}
		
	

//show  average of all marks
static double average(List<Integer> marksList) {
	int sum=0;
	for(int i=0;i<marksList.size();i++) {
		sum+=marksList.get(i);
	}
	double avg=0;
	avg=(sum/(marksList.size()*1.0));
	double ans1=avg*100;
	int round=(int)ans1;
	double result=round/(100*1.00);
	return result;
}

//find max. mark
static int max(List<Integer> marksList) {
	int max = Integer.MIN_VALUE;
	for(int i=0;i<marksList.size();i++) {
		max=Math.max(max,marksList.get(i));
	}
	return max;
}

//find min. mark
static int min(List<Integer> marksList) {
	int min = Integer.MAX_VALUE;
	for(int i=0;i<marksList.size();i++) {
		min=Math.min(min,marksList.get(i));
	}
	return min;
}

//find percentage of students passed
static double passing_percentage(List<Integer> marksList) {
	int no = 0;
	for(int i=0;i<marksList.size();i++) {
		if(marksList.get(i)>=40)no++;
	}
	double ans=0;
	double sum=no/(marksList.size()*1.0);
	ans=(sum*100);
	double ans1=ans*100;
	int round=(int)ans1;
	double result=round/(100*1.0);	
	return ans;
}
}
