package equality.check;

public class StudentCorrupt {
	private int id;
	private String name;

	public StudentCorrupt(int id, String name) {
		this.name = name;
		this.id = id;
	}

	

	

	@Override
	public int hashCode() {
		int idHash = this.id;
		return idHash;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
