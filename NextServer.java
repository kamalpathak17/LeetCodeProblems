package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class NextServer {
	
	 public Integer nextServerNumber(List<Integer> list) {
	        int smallestInteger = 0;
	        int next=1;
	        for(int i=0;i<list.size();i++)
	        {
	            if(i==0)
	            {
	                smallestInteger=list.get(i);
	            }
	            if (list.get(i)< smallestInteger)
	            {
	                smallestInteger=list.get(i);
	            }
	            else if(list.size()==0){
	                 smallestInteger=1;
	            }else
	            {
	                
	            }
	            
	        }
	       
	        if (list.contains(smallestInteger+next))
	        {
	        	next++;
	        	smallestInteger=smallestInteger+next;
	        }
	        else
	        {
	        return smallestInteger+next;
	        }
	        return smallestInteger;
	    }


	public static void main(String[] args) {
		NextServer ns=new NextServer();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(2);
		al.add(1);
		System.out.println(ns.nextServerNumber(al));

	}

}
