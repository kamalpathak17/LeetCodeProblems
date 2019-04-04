package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class BirthdayCakeCandles {
	
	static int birthdayCakeCandles(int[] ar)
	{
		int max_count=0;
	    HashSet<Integer> al = new HashSet<Integer>();

	    for(int i=0;i<ar.length;i++){
	        al.add(ar[i]);
	    }

	    for(int set : al){
	        int count = 0;
	        for(int j=0;j<ar.length;j++){

	            if(set==ar[j]){
	                count++;
	            }
	        }
	        if(count>max_count)
	        {
	        	max_count=count;
	        }
	        System.out.println(set+" occurs "+count+" times");
	    }
	    return max_count;
		
	}
	
	public static void main(String[] args) {
		BirthdayCakeCandles bcc=new BirthdayCakeCandles();
		Scanner sc=new Scanner(System.in);
		System.out.println("What's her age: ");
		int age=sc.nextInt();
		
		System.out.println("Enter the height of the candles :");
		int arr[] = new int[age];
		for(int i=0;i<age;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=bcc.birthdayCakeCandles(arr);
		System.out.println(max);
		
	}
}

