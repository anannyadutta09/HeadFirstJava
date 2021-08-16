package equality.check;

public class MoofTest {
	public static void main(String [] args) {
		Moof one = new Moof(27);
		Moof two = new Moof(27);
		if (one.equals(two)) {
			System.out.println("one and two are equal");
		} else {
			System.out.println("they are not equal");
		}
	}

}

class Moof {
	private int moofValue;
	Moof(int val){
		this.moofValue = val;
	}
	public int getMoofValue() {
		return moofValue;
	}
	public boolean equals(Object o) {
		if ((o instanceof Moof) && (((Moof)o).getMoofValue()== this.moofValue)) {
			return true;
		} else {
			return false;
		}
	}

}