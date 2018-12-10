package com.example.administrator.patterndesign.BuilderPattern.noddesigner;

public class Client {
	  public static void main(String[] args) {    
		     Room room=(new WorkBuilder()).makeWindow("蓝色玻璃").makeFloor("黄色地板").makeChat(""); //获取工人对象
		     System.out.println(room);   //工人交房
		  }  
}
