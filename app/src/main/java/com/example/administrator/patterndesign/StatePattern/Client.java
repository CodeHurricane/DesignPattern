package com.example.administrator.patterndesign.StatePattern;

public class Client {
		public static void main(String[] args) {
			TvContext tvContext=new TvContext();
			tvContext.nextChannel();
			tvContext.turnOff();
			
			tvContext.turnOn();
			tvContext.nextChannel();
			tvContext.preChannel();
		}
}
