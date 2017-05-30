package test;

import java.sql.Timestamp;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		int year = timestamp.getYear();
		int month = timestamp.getMonth();
		int day = timestamp.getDay();
		int date = timestamp.getDate();
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		//System.out.println(day);
		Timestamp timestamp2 = new Timestamp(year, month, date, 0, 0, 0, 0);
		Date date2 = new Date(year, month, date);
		System.out.println(timestamp2);
		System.out.println(date2);
		System.out.println(date2.toString());
		System.out.println(((Date)timestamp2).toString());
	}
}
