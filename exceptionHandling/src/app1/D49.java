package app1;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class D49 {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance();
		Date d1 = new Date();
		String s1 = d1.toString();
//		df.parse(s1);
		
		try {
			df.parse(s1);
		}
		catch(ParseException ex){
			System.out.println(ex);
		}
		System.out.println("done");
	}
}
