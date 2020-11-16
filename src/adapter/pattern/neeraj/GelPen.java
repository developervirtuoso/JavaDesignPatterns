package adapter.pattern.neeraj;

public class GelPen implements Pen{
	Assignment assign;
	@Override
	public void givePen() {
		String pentype="Gel";
		assign.write(pentype);
	}

	
}
