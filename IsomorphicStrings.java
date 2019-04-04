package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
	
	
	public boolean compute(String s,String t)
	{
	    if(s==null||t==null)
	    {
	        System.out.println("Not isomorphic strings");
	    }
	    if(s.length()!=t.length())
	    {
	    	System.out.println("Not isomorphic strings");
	    }
	    HashMap<Character, Character> map = new HashMap<Character, Character>();
	 
	 
	    for(int i=0; i<s.length(); i++)
	    {
	        char c1 = s.charAt(i);
	        char c2 = t.charAt(i);
	 
	        if(map.containsKey(c1))
	        {
	            if(map.get(c1)!=c2)
	            {
	            	System.out.println("Not isomorphic strings");
	            	return false;
	            }
	        }
	        else
	        {
	            if(map.containsValue(c2))
	            {
	            	System.out.println("Not isomorphic strings");
	            	return false;
	            }
	                map.put(c1, c2);
	        }
	    }
	 
	    System.out.println("Isomorphic strings");
		return true;


}
	public static void main(String[] args) {
	
		IsomorphicStrings is=new IsomorphicStrings();
		String str1="aaabcd";
		String str2="jkkklm";
		is.compute(str1,str2);
		
	}

}
