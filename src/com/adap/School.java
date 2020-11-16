package com.adap;

import com.myfriend.BallPen;

public class School {

	public static void main(String args[]) {
		
		Pen p=new PenAdaptar();
		AssignmentWork aw=new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("I am writing an assignment");
	}
}
