package hfj.chapter16_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JukeboxForSong {

ArrayList <Song> songList = new ArrayList<Song>();
	
	public static void main(String[] args) {
		new  JukeboxForSong().go();
	}
	public void go() {
		getSongs();
		System.out.println("Sort by Artist");
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList,artistCompare);
		System.out.println(songList);
		
		System.out.println("Sort by Rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(songList,ratingCompare );
		System.out.println(songList);
		
		System.out.println("Sort by Rating Reverse");
		RatingReverseCompare ratingReverseCompare = new RatingReverseCompare();
		Collections.sort(songList,ratingReverseCompare );
		System.out.println(songList);
		
	}
	 void getSongs() {
		 try {
			 File file = new File("C:\\Users\\Anannya Dutta\\git\\HeadFirstJava\\src\\hfj\\chapter16_2\\SongList2.txt");
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
		 
		 Song nextSong = new Song(tokens[0],tokens[1],Integer.parseInt(tokens[2]),tokens[3]);
		 songList.add(nextSong);
	}


}
