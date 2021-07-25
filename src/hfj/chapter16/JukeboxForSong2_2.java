package hfj.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class JukeboxForSong2_2 {

ArrayList <Song2_2> songList = new ArrayList<Song2_2>();
	
	public static void main(String[] args) {
		new  JukeboxForSong2_2().go();
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
		 
		 Song2_2 nextSong = new Song2_2(tokens[0],tokens[1],Integer.parseInt(tokens[2]),tokens[3]);
		 songList.add(nextSong);
	}


}
