package hfj.chapter16;

//compare by rating
class Song2 implements Comparable<Song2> {
	String title;
	String artist;
	Integer rating;
	String bpm;
	
	public int compareTo(Song2 s) {
		return rating.compareTo(s.getRating());
	}

	Song2 (String t, String a, Integer r, String b){
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

