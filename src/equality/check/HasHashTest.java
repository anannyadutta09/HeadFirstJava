package equality.check;

public class HasHashTest {
	public static void main(String[] args) {
		HasHash a = new HasHash(7);
		HasHash b = new HasHash(7);
		if (a.equals(b)) {
			System.out.println("They are equal with hashcode "+ a.hashCode());
		} else {
			System.out.println("They are not equal");
		}

	}

}

class HasHash {
	public int x;

	HasHash(int xVal) {
		x = xVal;
	}

	public boolean equals(Object o) {
		if ((o instanceof HasHash) && this.x == ((HasHash) o).x) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return (x * 17);
	}
}