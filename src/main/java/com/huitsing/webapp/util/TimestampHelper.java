package com.huitsing.webapp.util;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class TimestampHelper {
	public static Timestamp now() {
		Date date = new Date();
		return new Timestamp(date.getTime());
	}

	public static Timestamp getExpirationDate(Integer day) {
		Timestamp expiredDate = TimestampHelper.now();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(expiredDate);
		calendar.add(Calendar.DAY_OF_WEEK, day);
		expiredDate.setTime(calendar.getTime().getTime());
		return expiredDate;
	}
}
