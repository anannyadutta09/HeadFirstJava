package equality.check;

public class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Student))
			return false;
		
		if (this.id == ((Student) obj).getId() && this.getName().equals(((Student) obj).getName()))
			return true;
		else
			return false;
		
		
//		if (obj instanceof Student) {
//			if (this.id == ((Student) obj).getId())
//				return true;
//			else
//				return false;
//		} else
//			return false;
	}

	@Override
	public int hashCode() {
		int idHash = this.id;
		int stringHash = this.name.hashCode();
		return idHash * stringHash;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
