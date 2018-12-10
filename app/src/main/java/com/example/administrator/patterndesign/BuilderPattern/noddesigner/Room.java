package com.example.administrator.patterndesign.BuilderPattern.noddesigner;
/**
 * 房子类  
 * 首先要描述下 房子要有些什么
 * 有哪些属性
 * 
 * @author tucheng
 *
 */
public class Room {
	private String window;	
	private String floor;
	private String doorl;
	private String  chat;
	public void apply(WorkBuilder.RoomParmas parmas)
	{
		window=parmas.window;
		floor=parmas.floor;
		doorl=parmas.door;
		chat=parmas.chat;
	}
	public void setChat(String chat) {
		this.chat = chat;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "---->floor  "+floor+"   window   "+window;
	}
	public void show()
	{
		
	}
	
}
