package mymavenproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateString {

	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println(d.toString());
		
	String timeStamp = new 	SimpleDateFormat("yyyyMMDD_HHmmss").format(new Date());
	System.out.println(timeStamp);
	}

}
