package com.anvizent.elt.anvizent.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	private static final String[] WEEKS = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

	public static Integer dayOfMonth(Date date) {
		if (date == null) {
			return null;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	public static Integer weekOfYear(Date date) {
		if (date == null) {
			return null;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}

	public static String dayOfWeek(Date date) {
		if (date == null) {
			return null;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return WEEKS[calendar.get(Calendar.DAY_OF_WEEK) - 1];
	}

	public static String dayOfWeekInUpperCase(Date date) {
		if (date == null) {
			return null;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return WEEKS[calendar.get(Calendar.DAY_OF_WEEK) - 1].toUpperCase();
	}

	public static String dayOfWeekInLowerCase(Date date) {
		if (date == null) {
			return null;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return WEEKS[calendar.get(Calendar.DAY_OF_WEEK) - 1].toLowerCase();
	}

	public static Integer month(Date date) {
		if (date == null) {
			return null;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}

	public static Integer quarter(Date date) {
		if (date == null) {
			return null;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) / 3 + 1;
	}

	public static Integer year(Date date) {
		if (date == null) {
			return null;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR) - 1900;
	}

	public static Date addDays(Date date, Integer days) {
		if (days == null || date == null) {
			return date;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return calendar.getTime();
	}

	public static Date addMonths(Date date, Integer days) {
		if (days == null || date == null) {
			return date;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, days);
		return calendar.getTime();
	}

	public static Date addYears(Date date, Integer days) {
		if (days == null || date == null) {
			return date;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, days);
		return calendar.getTime();
	}

	public static Long dateDiff(Date date1, Date date2) {
		if (date2 == null || date1 == null) {
			return null;
		}

		return date1.getTime() - date2.getTime();
	}

	public static Integer dateDiffInDays(Date date1, Date date2) {
		if (date2 == null || date1 == null) {
			return null;
		}

		LocalDate localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate localDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		Period diff = Period.between(localDate2, localDate1);

		return diff.getDays();
	}

	public static Integer dateDiffInMonths(Date date1, Date date2) {
		if (date2 == null || date1 == null) {
			return null;
		}

		LocalDate localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate localDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		Period diff = Period.between(localDate2, localDate1);

		return diff.getMonths();
	}

	public static Integer dateDiffInYears(Date date1, Date date2) {
		if (date2 == null || date1 == null) {
			return null;
		}

		LocalDate localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate localDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		Period diff = Period.between(localDate2, localDate1);

		return diff.getYears();
	}

	public static Date now() {
		return new Date();
	}
}
