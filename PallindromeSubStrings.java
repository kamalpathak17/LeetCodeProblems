package LeetCode;

import java.util.Scanner;

public class PallindromeSubStrings {

	public static boolean checkPallindrome(String a)
	{
		String reverse="";
		for(int i=a.length()-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
		}
		if(a.equals(reverse))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	public static void main(String[] args) {
		/* Count All Palindrome Sub-Strings in a String
			Input : str = "abaab"
			Output: 3
			Explanation : 
			All palindrome substring are :
		 	"aba" , "aa" , "baab" */
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string::");
		String a=sc.nextLine();
		
		for(int i=0;i<a.length();i++)
		{
			//System.out.println(splitString[i]);
			for(int j=i+2;j<a.length()+1;j++)
			{
				String substr=a.substring(i, j);
				
				if (checkPallindrome(substr))
				{
					count++;
				}
			}
			
		}
		System.out.println("Number of pallindrome sub-strings are::"+count);
		
	}

}
