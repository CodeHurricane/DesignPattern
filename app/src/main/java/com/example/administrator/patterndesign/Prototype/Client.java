package com.example.administrator.patterndesign.Prototype;

public class Client {

	public static void main(String[] args) {
		OrderDealFactory orderDealFactory=new OrderDealFactory();
		PersonOrder order=new PersonOrder();
		order.setOderNumber(3500);
		order.setOrderName("个人订单");
		orderDealFactory.dealOrder(order);
	}
}
