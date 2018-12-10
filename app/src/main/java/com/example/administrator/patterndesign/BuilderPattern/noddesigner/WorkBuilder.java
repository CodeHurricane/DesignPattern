package com.example.administrator.patterndesign.BuilderPattern.noddesigner;

public class WorkBuilder{
	private RoomParmas parmas;
	
	
	public WorkBuilder( ) {
		this.parmas = new RoomParmas();
	}

	public  WorkBuilder makeWindow(String window ) {
		parmas.window=window;
		return this;
	}

	public WorkBuilder makeFloor(String floorCorlor) {
		parmas.floor=floorCorlor;
		return this;
	}
	public WorkBuilder makeDoor(String door) {
		parmas.door=door;
		return this;
	}
	public Room makeChat(String  chat) {
		parmas.chat=chat;
		Room room=new Room();
		return room;
	}
	public  void show()
	{
		
	}
	public Room build() {
		Room room=new Room();
		room.apply(parmas);
		return room;
	}
	
	
	class RoomParmas
	{
		public  String window;	
		public String floor;
		public String door;
		public String  chat;
		
	}

}
