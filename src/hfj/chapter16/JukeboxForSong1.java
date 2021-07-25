package hfj.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class JukeboxForSong1 {

ArrayList <Song1> songList = new ArrayList<Song1>();
	
	public static void main(String[] args) {
		new  JukeboxForSong1().go();
	}
	public void go() {
		getSongs();
		Collections.sort(songList);
		System.out.println(songList);
		
	}
	 void getSongs() {
		 try {
			 File file = new File("C:\\Users\\Anannya Dutta\\git\\HeadFirstJava\\src\\hfj\\chapter16\\SongList2.txt");
			 BufferedReader reader = new BufferedReader(new FileReader (file));
			 String line = null;
			 while((line = reader.readLine())!= null) {
				 addSong(line);
			 }
		 } catch(Exception ex) {
			 ex.printStackTrace();
			 
		 } 
		 
	}
	 void addSong(String lineToParse) {
		 String[] tokens = lineToParse.split("/");
		 
		 Song1 nextSong = new Song1(tokens[0],tokens[1],tokens[2],tokens[3]);
		 songList.add(nextSong);
	}


}
