package com.example.administrator.patterndesign.ResponsibilityPattern.hand;

public class Request3  extends AbstractRequest{

	public Request3(Object object) {
		super(object);
	}

	@Override
	public int getRequestLevel() {
		return 3;
	}

}
