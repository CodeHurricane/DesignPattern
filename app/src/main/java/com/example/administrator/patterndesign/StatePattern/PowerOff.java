package com.dongnao.state;

public class PowerOff implements TVState{

	@Override
	public void nextChannel() {
	}

	@Override
	public void preChannel() {
		
	}

	@Override
	public void turnOn() {
		System.out.println("开机");
	}

	@Override
	public void turnOff() {
		System.out.println("关机 无效");
	}

}
