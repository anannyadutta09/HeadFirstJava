package arrayList.check;

public class DVDInfo implements Comparable {
	String title;
	String genre;
	String leadActor;
	DVDInfo (String t, String g, String a) {
		title =t; genre = g; leadActor = a;
	}
	public String toString() {
		return title + " " + genre + " " + leadActor + "\n";
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public String getLeadActor() {
		return leadActor;
	}
	
	@Override
	public int compareTo(Object o) {
		
		//compare based on title
		//extract title from the object into newtitle
//		if title = newtitle, return 0
//		else if title > newtitle, return 1
//		elseif title < newtitle, return -1
		String newTitle = ((DVDInfo)o).getTitle();
		int sortResult = newTitle.compareTo(title); 
		int reverseSortresult = sortResult * -1;
	return reverseSortresult;
		
		
	}
	

}
