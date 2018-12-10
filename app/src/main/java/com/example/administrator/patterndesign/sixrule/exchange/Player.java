package com.dongnao.sixrule.exchange;

public class Player {
	private IGun iGun;
	
	public void buyGun(IGun iGun)
	{
		this.iGun=iGun;
	}
	/*
	 * Éè¼ÆÆøÇò
	 */
	public void fire()
	{
		iGun.fire();
	}
}
