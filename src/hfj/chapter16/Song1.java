package hfj.chapter16;

class Song1 implements Comparable<Song1> {
	String title;
	String artist;
	String rating;
	String bpm;
	
	public int compareTo(Song1 s) {
		return title.compareTo(s.getTitle());
	}

	Song1 (String t, String a, String r, String b){
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
	public String getRating() {
		return rating;
	}
	public String getBpm() {
		return bpm;
	} 
	public String toString() {
		return this.title + " by " + this.artist;
	}
}

