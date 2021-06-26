package hfj.chapter7;

class Boat{
	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int len) {
		this.length = len;
	}
	public void move() {
		System.out.print(" drift");
	}
	
	
}
class RowBoat extends Boat{
	public void rowTheBoat(){
		System.out.print(" stroke natasha");
	}
}
class Sailboat extends Boat{
	public void move() {
		System.out.print(" hoist sail");
	}
}





public class TestBoats {

	public static void main(String[] args) {
		Boat b1 = new Boat();
		Sailboat b2 = new Sailboat();
		RowBoat b3 = new RowBoat();
		b2.setLength(32);
		b1.move();
		b3.move();
		b2.move();
		

	}

}
