package com.dongnao.sixrule.exchange;

public class Player {
	private IGun iGun;
	
	public void buyGun(IGun iGun)
	{
		this.iGun=iGun;
	}
	/*
	 * �������
	 */
	public void fire()
	{
		iGun.fire();
	}
}
