package LeetCode;

import java.util.Scanner;

public class KadaneAlgo {

	int max_globalsum=0;
	public static void main(String[] args) {
		System.out.println("Enter number of values to enter in the array: ");		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter values :: ");
		for (int i=0;i<num;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Values in the array are :: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		KadaneAlgo ka=new KadaneAlgo();
		ka.MaxSubArraySum(arr);
	}
	
	int MaxSubArraySum(int arr[])
	{
		int max_sum=0;
		for (int i=0;i<arr.length;i++)
		{
			max_sum=max_sum+arr[i];
			System.out.println("Sum in " +i+ " iteration : " +max_sum);
		}
		
		return 0;
	}
	
}
