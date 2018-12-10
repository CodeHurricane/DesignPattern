package com.example.administrator.patterndesign.Singleton;

public class  Client {
		public static void main(String[] args) {
			EnumManager.SDCardManager.getSingleton();
		}
}
