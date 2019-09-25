package com.gmail.liftiwan1996;



import java.time.Period;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	private static long parse;

	public static void main(String[] args) {
		

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");    
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.parse("15/10/1996", formatter);
		
		DayOfWeek dotw = birthday.getDayOfWeek();


		Period p = Period.between(birthday, today);
		System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
		                   " months");
		
		System.out.println(dotw);
	}

}
