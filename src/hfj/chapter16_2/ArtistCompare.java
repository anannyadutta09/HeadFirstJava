package hfj.chapter16_2;

import java.util.Comparator;

public class ArtistCompare implements Comparator<Song>{

	@Override
	public int compare(Song o1, Song o2) {
		String artist1 = o1.getArtist();
		String artist2 = o2.getArtist();
		int result = artist1.compareTo(artist2);
		return result;
	}

}
