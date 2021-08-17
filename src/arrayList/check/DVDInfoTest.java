package arrayList.check;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class DVDInfoTest {
	ArrayList<DVDInfo> dvdList = new ArrayList<DVDInfo>();
	

	public static void main(String[] args) {
		DVDInfoTest t = new DVDInfoTest();
		t.populateList();
		System.out.println(t.dvdList);
		Collections.sort(t.dvdList);
		System.out.println(t.dvdList);
	}



	void populateList() {
		try {
			File file = new File("C:\\Users\\Anannya Dutta\\git\\HeadFirstJava\\src\\arrayList\\check\\dvdInfo.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addDVDInfo(line);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	void addDVDInfo(String lineToParse) {
    	String[] tokens = lineToParse.split("/");
		DVDInfo nextDVD = new DVDInfo(tokens[0], tokens[1],tokens[2]);
		dvdList.add(nextDVD);
	}
}