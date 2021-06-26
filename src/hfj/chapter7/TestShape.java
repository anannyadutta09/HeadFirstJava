package hfj.chapter7;

public class TestShape {

	public static void main(String[] args) {
		GameShape g = new GameShape();
		GameShape h = new PlayerPiece();
		PlayerPiece p = new PlayerPiece();
		g.displayShape();
		h.displayShape();
		p.displayShape();
		p.movePiece();
		doShapes(g);
		doShapes(h);
		doShapes(p);
	}
	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}

}
