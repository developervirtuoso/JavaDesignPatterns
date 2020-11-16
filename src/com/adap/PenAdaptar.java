package com.adap;

import com.myfriend.BallPen;
import com.myfriend.GelPen;

public class PenAdaptar implements Pen{

	BallPen bp=new BallPen();
	GelPen gp=new GelPen();
	
	@Override
	public void write(String str) {
		// TODO Auto-generated method stub
		bp.mark(str);
	}


}
