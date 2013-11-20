package morePatients;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Patient> patientList = new ArrayList<Patient>();

		do {
			System.out.print("Please enter a patient name: ");
			String name = in.nextLine();
			System.out.print("Please enter a paritent year of birth: ");
			int year = in.nextInt();
			Patient newPatient = new Patient(name, year);
			patientList.add(newPatient);
			in.nextLine();
		} while (patientList.size() < 3);



		in.close();

		print(patientList);


	}

	private static void print(List<Patient> patientList) {

		for(int i = 0; i < patientList.size(); i++) {
			System.out.println("Patient " + (i + 1) + " >>");
			System.out.println(patientList.get(i).getName());
			System.out.println(patientList.get(i).getYear());
		}

	}

}
