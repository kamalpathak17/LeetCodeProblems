package LeetCode;

import java.util.Scanner;
import java.util.Vector;

public class GradingProblem {
	static int[] gradingStudents(int[] grades) {
		
		for(int j=0;j<grades.length;j++)
		{
			int nextMultiple=(int) 5+Math.round((grades[j]/5)*5);
			if((grades[j]) > 37)
			{
				if((nextMultiple-grades[j]<3)) {
					grades[j]=nextMultiple;
				}
				
			}
		}	
		return grades;
    }

	public static void main(String[] args) {
		GradingProblem gp=new GradingProblem();
		System.out.println("Enter the number of students::");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] grades=new int[num];
		System.out.println("Enter Grades ::");
		for(int i=0;i<grades.length;i++)
		{
			int value=sc.nextInt();
			grades[i]=value;
		}
		
		int [] test=gp.gradingStudents(grades);
		for(int i=0;i<test.length;i++)
		{
			System.out.println(test[i]);
		}
		
	}

}
