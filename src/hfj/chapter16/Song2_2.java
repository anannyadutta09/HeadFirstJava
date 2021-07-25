package hfj.chapter16;

//compare by rating
class Song2_2 implements Comparable<Song2_2> {
	String title;
	String artist;
	int rating;
	String bpm;

	public int compareTo(Song2_2 s) {
		int returnValue = 0;
		if (this.rating < s.getRating())
			returnValue = -1;
		else if (this.rating > s.getRating())
			returnValue = 1;

		return returnValue;

	}

	Song2_2(String t, String a, Integer r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public Integer getRating() {
		return rating;
	}

	public String getBpm() {
		return bpm;
	}

	public String toString() {
		return this.title + " rating " + this.rating;
	}
}
