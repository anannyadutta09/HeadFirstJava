package arrayList.check;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class StudentInfoTest {
	ArrayList<StudentInfo> studentList = new ArrayList<StudentInfo>();

	public static void main(String[] args) {
		StudentInfoTest t = new StudentInfoTest();
		t.populateList();
		System.out.println(t.studentList);
		Collections.sort(t.studentList);
		System.out.println(t.studentList);
	}

	void populateList() {
		try {
			File file = new File("C:\\Users\\Anannya Dutta\\git\\HeadFirstJava\\src\\arrayList\\check\\Students.csv");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addStudentInfo(line);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	void addStudentInfo(String lineToParse) {
		String[] tokens = lineToParse.split(",");

		try {
			Integer.valueOf(tokens[0]);
			StudentInfo nextDVD = new StudentInfo(Integer.valueOf(tokens[0]), tokens[1], tokens[2]);
			studentList.add(nextDVD);
		} catch (NumberFormatException ex) {
			System.out.println("line content : "+ lineToParse);

		}

	}

	void addStudentInfo_v1(String lineToParse) {
		String[] tokens = lineToParse.split(",");
		if (tokens[0].equals("ID"))
			return;
		StudentInfo nextDVD = new StudentInfo(Integer.valueOf(tokens[0]), tokens[1], tokens[2]);
		studentList.add(nextDVD);
	}
}