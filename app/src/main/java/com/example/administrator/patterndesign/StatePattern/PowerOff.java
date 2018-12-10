package com.example.administrator.patterndesign.StatePattern;

public class PowerOff implements TVState{

	@Override
	public void nextChannel() {
	}

	@Override
	public void preChannel() {
		
	}

	@Override
	public void turnOn() {
		System.out.println("����");
	}

	@Override
	public void turnOff() {
		System.out.println("�ػ� ��Ч");
	}

}
