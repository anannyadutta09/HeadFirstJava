package hfj.chapter16_2;

class Song  {
	String title;
	String artist;
	Integer rating;
	String bpm;

	
	Song(String t, String a, Integer r, String b) {
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
		return title + " : "+ artist +" : " + rating;
	}
}
