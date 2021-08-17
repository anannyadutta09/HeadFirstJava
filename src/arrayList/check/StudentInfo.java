package arrayList.check;

public class StudentInfo implements Comparable {
	int ID;
	String name;
	String year;

	StudentInfo(int i, String n, String y) {
		ID = i;
		name = n;
		year = y;
	}

	public String toString() {
		return ID + " " + name + " " + year + "\n";
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getYear() {
		return year;
	}

	@Override
	public int compareTo(Object o) {
		int newID = ((StudentInfo) o).getID();
		if (ID == newID)
			return 0;
		else if (ID > newID)
			return 1;
		else
			return -1;
	}

}
