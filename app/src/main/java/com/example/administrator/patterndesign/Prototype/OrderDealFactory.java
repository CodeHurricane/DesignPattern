package com.example.administrator.patterndesign.Prototype;

public class OrderDealFactory {
	 public void dealOrder(IOrder order)
	 {
		 System.out.println("原订单地址  ：  "+order.hashCode());
		 int number=order.getOderNumber();
		 while (number>0) {
//			 IOrder iOrder=null;
//			 if(order instanceof PersonOrder)
//			 {
//				 //个人订单
//				 PersonOrder personOrder=(PersonOrder) order;
//				 PersonOrder newPersonOrder=new PersonOrder();
//				 newPersonOrder.setOderNumber(number>1000?1000:number);
//				 newPersonOrder.setOrderName(personOrder.getOrderName());
//				 iOrder=newPersonOrder;
//				 System.out.println("订单----   name  "+newPersonOrder.getOrderName()+"   number  "+newPersonOrder.getOderNumber()+
//						 "地址  :  "+newPersonOrder.hashCode());
//				 number-=1000;
//				 /**
//				  * 处理下一步订单
//				  */
//			 }else if(order instanceof CompanyOrder) {
//				 
//				 
//				
//			}
//		
			 IOrder iOrder=(IOrder) order.cloneOrder();
			 iOrder.setOderNumber(number>1000?1000:number);
			 number-=1000;
			 System.out.println("订单----     number  "+iOrder.getOderNumber()+
					 "地址  :  "+iOrder.hashCode());
			 
		}
		 
		 
		 
	 }
}
