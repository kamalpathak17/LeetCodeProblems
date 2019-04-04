package LeetCode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MilitaryTimeConversion {

	 static String timeConversion(String s) throws ParseException{
		 
		 SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
	       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
	       Date date = parseFormat.parse(s);
	       String military_date = displayFormat.format(date);
	       //System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));
		return military_date;
         
	    }
	
		public static void main(String [] args) throws Exception {
		      MilitaryTimeConversion mtc=new MilitaryTimeConversion();
		      String military_time=mtc.timeConversion("07:05:45PM");
			  System.out.println(military_time);	
	}

}
