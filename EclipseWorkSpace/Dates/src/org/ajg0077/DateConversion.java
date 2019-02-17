package org.ajg0077;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateConversion {

	public java.sql.Date utilToSql(java.util.Date uDate) {
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		return sDate;
	}

	public static String formatCurrentDate(java.util.Date uDate, String format) {
		DateFormat df = new SimpleDateFormat(format);
		String returnFormat = df.format(uDate);
		return returnFormat;
	}

	public static java.util.Date stringToDate(String date, String format) throws ParseException {
	
			java.util.Date returnDate = new SimpleDateFormat(format).parse(date);

		return returnDate;
	}

	public static String stringToDateFormatted(String date, String format, String returnFormat) throws ParseException {

		java.util.Date uDate = new SimpleDateFormat(format).parse(date);
		DateFormat df = new SimpleDateFormat(returnFormat);
		String returnDate = df.format(uDate);

		return returnDate;
	}

	public static java.sql.Date stringToSqlDate(String date, String format) throws ParseException {

		java.util.Date uDate = new SimpleDateFormat(format).parse(date);
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		return sDate;

	}

	public static void main(String[] args) throws ParseException {
		System.out.println(formatCurrentDate(new java.util.Date(), "dd/MM/YYYY - hh:mm:ss"));
		System.out.println(stringToDate("2018/10/10", "yyyy/MM/dd"));
		System.out.println(stringToDateFormatted("2018/10/10", "yyyy/MM/dd", "dd/MM/yyyy"));
		System.out.println(stringToSqlDate("2019/02/01", "yyyy/MM/dd").toString());
	}

}
