package LeetCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class Regex {

	   private static final String REGEX = "\\bcat\\b";
	   private static final String INPUT = "cat cat cat cattie cat";

	   public void Mypattern()
	   {
		   String Reg="hello";
		   String Inp="hello";
		   Pattern p = Pattern.compile(Reg);
		   Matcher m = p.matcher(Inp);
		   
		   if(m.find())
		   {
			   Inp=m.replaceAll("cat");
			  
		   }
		System.out.println(Inp);	   
	   }
	   
	   public static void main( String args[] ) {
	      Pattern p = Pattern.compile(REGEX);
	      Matcher m = p.matcher(INPUT);   // get a matcher object
	      int count = 0;

	      Regex x=new Regex();
	      x.Mypattern();
	      
	      while(m.find()) {
	         count++;
	         System.out.println("Match number "+count);
	         System.out.println("start(): "+m.start());
	         System.out.println("end(): "+m.end());
	      }
	   }
	}
	
	

