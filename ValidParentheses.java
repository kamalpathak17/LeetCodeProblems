package LeetCode;

import java.util.Stack;

public class ValidParentheses {

	
    public boolean isValid(String s) {
    		
    	if(s.isEmpty())
    	{
    		return true;
    	}
    		char c[]=s.toCharArray();
    		Stack<Character> st=new Stack<Character>();
    		
    		while(c.length>1)
    		{
    		for (int i=0;i<c.length;i++)
    		{
    			if (c[i]== '(')
    				{
    						st.push(')');
    				}
    			else if (c[i]=='{') 
    			{
    				st.push('}');
    			}
    			else if (c[i]=='[')
    			{
    				st.push(']');
    			}
    			else if (st.isEmpty() || st.pop() != c[i])
    			{
    				return false;
    			}
    		}
    		if (st.isEmpty())
    		{
    		return true;
    		}
    		else
    		{
    			return false;
    		}
    		}
    		return false;
	        
	    }
	

	public static void main(String[] args) {
		ValidParentheses v=new ValidParentheses();
		
		System.out.println(v.isValid("([{}])"));

	}
	
	
	
}
