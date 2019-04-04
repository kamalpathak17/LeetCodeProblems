package HackerRank;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraysLeftRotation {
	
	static int[] ShiftArray(int a[],int b)
	{
		int temp1=0;
		int temp2=0;
		while(b!=0)
		{
			for(int i=0;i<a.length;i++)
				{
			if(i==0)
				{
				temp1=a[i];
				temp2=a[a.length-1];
				}
		
			if(i==a.length-1)
			{
				a[i]=temp1;
			}
			else {
				a[i]=a[i+1];
			}
		}
			b--;
		}
		
		return a;
		
	}

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of shifts : ");
		int n=sc.nextInt();
		int result[]=new int[5];
		result=ShiftArray(arr,n);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}

	}
	

}
