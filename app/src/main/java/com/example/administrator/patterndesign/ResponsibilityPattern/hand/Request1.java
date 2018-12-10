package com.example.administrator.patterndesign.ResponsibilityPattern.hand;

public class Request1 extends AbstractRequest{

	public Request1(Object object) {
		super(object);
		
		
	}

	@Override
	public int getRequestLevel() {
		return 1;
	}

}
