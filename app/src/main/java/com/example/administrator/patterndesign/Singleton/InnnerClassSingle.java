package com.example.administrator.patterndesign.Singleton;

public class InnnerClassSingle {
	private InnnerClassSingle()
	{
		
	}
	private static class SingleHodler{
		private static final InnnerClassSingle instance=new InnnerClassSingle();
	}

	public static InnnerClassSingle getInstance()
	{
		return SingleHodler.instance;
	}
}
