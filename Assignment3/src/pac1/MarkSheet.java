package pac1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarkSheet {
	//storing marks in arraylist
static List<Integer> ls=new ArrayList<>();
static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter no. of students ");
	try 
	{
	int n=sc.nextInt();
	for(int i =0 ;i<n;i++)
	{
		System.out.println("Enter marks of student "
		+(i+1));
		ls.add(sc.nextInt());
	}
	System.out.println("Select operation to perform\n"
	+"1.Average of marks\n"+"2.Maximum marks\n"
	+"3.Minimum marks\n"+"4.Percentage of students passed");
	int input = sc.nextInt();
	switch(input)
	{
	//case 1 to calculate avg. of marks
		case 1:
		System.out.println("Avg. marks is "+average(ls));
		break;
	//case 2 to find max. no.
		case 2:
	    System.out.println("Max. marks is "+max(ls));
	    break;
	//case 3 to find min. no.
		case 3:
		System.out.println("Min. marks is "+min(ls));
		break;
	//case 4 to find % of students who passes
		case 4:
		System.out.println("Percentage of students who passed is "+passing_percentage(ls));
		break;
	//default case to handle edge cases
		default:
		System.out.println("Please enter valid no.");
	}
	}
	catch(Exception e) {
		System.out.println("Enter valid input");
	}	
	}

//show  average of all marks
static double average(List<Integer> ls) {
	int sum=0;
	for(int i = 0;i<ls.size();i++) {
		sum+=ls.get(i);
	}
	double avg=0;
	avg=(sum/(ls.size()*1.0));
	//here we are multiplying by 100 and then converting into int to allow upto 2 decimal places
	double ans1=avg*100; 
	int round=(int)ans1;
	double result=round/(100*1.00);
	return result;
}

//find max. mark
static int max(List<Integer> ls) {
	int max = Integer.MIN_VALUE;
	for(int i=0;i<ls.size();i++) {
		max=Math.max(max,ls.get(i));
	}
	return max;
}

//find min. mark
static int min(List<Integer> ls) {
	int min = Integer.MAX_VALUE;
	for(int i=0;i<ls.size();i++) {
		min=Math.min(min,ls.get(i));
	}
	return min;
}

//find percentage of students passed
static double passing_percentage(List<Integer> ls) {
	int no = 0;
	for(int i=0;i<ls.size();i++) {
		if(ls.get(i)>=40)no++;
	}
	double ans=0;
	double sum=no/(ls.size()*1.0);
	ans=(sum*100);
	double ans1=ans*100;
	int round=(int)ans1;
	double result=round/(100*1.0);	
	return ans;
}
}
