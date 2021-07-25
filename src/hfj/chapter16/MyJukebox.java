package hfj.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class MyJukebox {

	ArrayList<String> mysongList = new ArrayList<String>();

	public void go() {
		getSongs();
		Collections.sort(mysongList);
		System.out.println(mysongList);

	}

	void getSongs() {
		try {
			File file = new File("C:\\Users\\Anannya Dutta\\git\\HeadFirstJava\\src\\hfj\\chapter16\\SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	void addSong(String lineToParse) {
		// soname nme / artit
		String[] stringParts = lineToParse.split("/");
		
		// stringParts[0] = Song name
		// stringParts[1] = artist 
		
		mysongList.add(stringParts[0]);
	}

}
