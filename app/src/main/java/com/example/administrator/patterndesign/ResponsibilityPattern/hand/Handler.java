package com.example.administrator.patterndesign.ResponsibilityPattern.hand;

public abstract class Handler {
	public Handler nextHandler;
	public  void handleRequest(AbstractRequest abstractRequest)
	{
		if(getHandleLevel()==abstractRequest.getRequestLevel())
		{
			handle(abstractRequest);
		}else {
			if(nextHandler!=null)
			{
				nextHandler.handleRequest(abstractRequest);
			}else {
				System.out.println("---->  所有的处理对象都不能处理它");
			}
			
		}
	}
	/**
	 * 每个处理者的对象的具体处理方式
	 * @param abstractRequest
	 */
	public abstract void handle(AbstractRequest abstractRequest);
	/**
	 * 每个处着对象处理的级别
	 * @return
	 */
	public abstract int getHandleLevel();
}
