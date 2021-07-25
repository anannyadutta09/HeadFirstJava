package hfj.chapter16_2;

import java.util.Comparator;

public class RatingReverseCompare implements Comparator<Song> {

	@Override
	public int compare(Song o1, Song o2) {
		Integer rating1 = o1.getRating();
		Integer rating2 = o2.getRating();
		int result = rating1.compareTo(rating2);
		result = result * -1;
		return result;
	}

}
