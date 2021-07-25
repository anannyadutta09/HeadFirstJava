package hfj.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {
	ArrayList <String> songList = new ArrayList<String>();
	
	public static void main1i9(String[] args) {
		Jukebox1 jb = new Jukebox1();
		jb.go();
	}
	public static void main(String[] args) {
		Jukebox1 jb = new Jukebox1();
		jb.getSongs();
		Collections.sort(jb.songList);
		System.out.println(jb.songList);
		
		//go();  <---- cannot be called as non static methods cannot be called in static methods
	}
	public void go() {
		getSongs();
		Collections.sort(songList);
		System.out.println(songList);
		
	}
	 void getSongs() {
		 try {
			 File file = new File("C:\\Users\\Anannya Dutta\\git\\HeadFirstJava\\src\\hfj\\chapter16\\SongList.txt");
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
		 songList.add(tokens [0]);
	}

}
