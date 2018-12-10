package com.example.administrator.patterndesign.Singleton;

public class SingleNotEmptyEasy {
	private static SingleNotEmptyEasy instanceEasy;
	
	public static synchronized  SingleNotEmptyEasy getInstance()
	{
		if(instanceEasy==null)
		{
			instanceEasy=new SingleNotEmptyEasy();
		}
		return instanceEasy;
	}
}
