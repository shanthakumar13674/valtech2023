package com.valtech.training;

import java.time.LocalDate;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) {
//		index the year for 1900
//		Month index with 0
//		index Day woth 1
		Date date = new Date(47,7,15);
		System.out.println(date);
		LocalDate independenceDay = LocalDate.of(1947, 8, 15);
		System.out.println(independenceDay);

	}

}
