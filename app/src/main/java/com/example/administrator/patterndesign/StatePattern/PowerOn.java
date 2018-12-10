package com.example.administrator.patterndesign.StatePattern;

public class PowerOn  implements TVState{

	@Override
	public void nextChannel() {
		System.out.println("��һƵ��");
	}

	@Override
	public void preChannel() {
		System.out.println("��һƵ��");
	}

	@Override
	public void turnOn() {
		System.out.println("���ڿ���");
	}

	@Override
	public void turnOff() {
		System.out.println("�ػ�");
	}

}
