package HackerRank;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter no of testCases::");
         int t=sc.nextInt();
         while(t!=0)
         {
        	 System.out.println("Enter String " +t+ "::");
            String s=sc.next();

         for(int i=0;i<s.length();i++)
         {
             if(i==0 || i%2==0)
             {
                 System.out.print(s.charAt(i));
             }
         }
         System.out.print("  ");
         for(int i=0;i<s.length();i++)
         {
             if (i%2!=0)
             {
                  System.out.print(s.charAt(i));
             }
             
         }
             t--;
             System.out.println();
         }
}
}