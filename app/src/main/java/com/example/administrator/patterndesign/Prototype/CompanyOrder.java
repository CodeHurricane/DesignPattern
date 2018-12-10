package com.example.administrator.patterndesign.Prototype;

public class CompanyOrder implements IOrder {
	private int oderNumber;
	private String name;
	@Override
	public int getOderNumber() {
		// TODO Auto-generated method stub
		return oderNumber;
	}

	@Override
	public void setOderNumber(int number) {
	 this.oderNumber=number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Prototype cloneOrder() {
		 CompanyOrder order=new CompanyOrder();
		 order.setName(this.name);
		 order.setOderNumber(this.oderNumber);
		return order;
	}
	

}
