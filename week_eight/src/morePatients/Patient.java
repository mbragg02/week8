package morePatients;

import java.util.Calendar;

public class Patient {
	
	private String name;
	private int year;
	
	public Patient(String name, int year) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int age = currentYear - year;
		if (age > 130 || age <= 0 ) {
			throw new IllegalArgumentException("Age of patient must be less than 130 and positive");
		}
		setName(name);
		setYear(year);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	private void setYear(int year) {
		this.year = year;
	}
	

}
