package com.dongnao.state;
/**
 * 操控电视类
 * @author Administrator
 *
 */
public class TvControlNomral {
	//开机状态
	private  final static int POWER_ON=1;
	//关机状态
	private final static int POWER_OFF=2;
	
	public int mState=POWER_OFF;
	/**
	 * 开机
	 */
	public void powerOn()
	{
		mState=POWER_ON;
		if(mState==POWER_OFF)
		{
			System.out.println("开机了，你可以开电视了");
		}else {
			System.out.println("已经开机，无效");
		}
	}
	
	/**
	 * 关机
	 */
	public void powerOff()
	{
		mState=POWER_OFF;
		if(mState==POWER_ON)
		{
			System.out.println("电视马上关机");
			
		}else {
			System.out.println("已经关机  无效");
		}
	}
	/**
	 * 切换频道
	 */
	public void nextChannel()
	{
		if(mState==POWER_ON)
		{
			System.out.println("切换下一频道");
			
		}
		
	}
	
	public void preChannel()
	{
		if(mState==POWER_ON)
		{
			System.out.println("切换上一频道");
		}
	}
}
