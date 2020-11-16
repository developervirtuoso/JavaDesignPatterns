package adapter.pattern.neeraj;

public class BallPen implements Pen {

	Assignment assign;
	@Override
	public void givePen() {
		String penType="Ball Pen";
		assign.write(penType);
	}

}
