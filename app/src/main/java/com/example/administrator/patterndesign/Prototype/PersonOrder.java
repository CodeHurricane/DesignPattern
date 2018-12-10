package com.example.administrator.patterndesign.Prototype;

public class PersonOrder  implements IOrder{
	private int oderNumber;
	private String name;
	@Override
	public int getOderNumber() {
		
		return oderNumber;
	}

	@Override
	public void setOderNumber(int number) {
		oderNumber=number;
	}

	public String getOrderName() {
		return name;
	}

	public void setOrderName(String name) {
		this.name=name;
	}

	@Override
	public Prototype cloneOrder() {
		PersonOrder personOrder=new PersonOrder();
		personOrder.setOderNumber(oderNumber);
		personOrder.setOrderName(name);
		
		
		return personOrder;
	}

}
