package com.example.administrator.patterndesign.ResponsibilityPattern;


import com.example.administrator.patterndesign.ResponsibilityPattern.hand.AbstractRequest;
import com.example.administrator.patterndesign.ResponsibilityPattern.hand.Handler;
import com.example.administrator.patterndesign.ResponsibilityPattern.hand.Handler1;
import com.example.administrator.patterndesign.ResponsibilityPattern.hand.Handler2;
import com.example.administrator.patterndesign.ResponsibilityPattern.hand.Handler3;
import com.example.administrator.patterndesign.ResponsibilityPattern.hand.Request3;

public class Client {
	public static void main(String[] args) {
		//确定链式关系
		Handler handler1=new Handler1();
		Handler handler2=new Handler2();
		Handler handler3=new Handler3();
		handler1.nextHandler=handler2;
		handler2.nextHandler=handler3;
		
		AbstractRequest request3=new Request3("请求1");
		
		handler1.handleRequest(request3);
	}
}
