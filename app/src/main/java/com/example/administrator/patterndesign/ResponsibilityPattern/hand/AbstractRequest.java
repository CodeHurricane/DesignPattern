package com.example.administrator.patterndesign.ResponsibilityPattern.hand;

public abstract class AbstractRequest {
	private Object object;
	
	public AbstractRequest(Object object)
	{
		this.object=object;
	}
	/**
	 * 具体的内容对象
	 * @return
	 */
	public Object getContent()
	{
		return object;
	}
	/**
	 * 获取请求级别
	 */
	public abstract int getRequestLevel();
}
