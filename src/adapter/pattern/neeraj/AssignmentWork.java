package adapter.pattern.neeraj;


public class AssignmentWork {
	
	public void getPen(String type){
		if(type.equals("ball")) {
			Pen pen=new BallPen();
			
		}else if(type.equals("gel")) {
			System.out.println("==============");
			Pen pen=new GelPen();
			pen.givePen();
		}
		
	}
}
