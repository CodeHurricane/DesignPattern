package com.dongnao.iterator;

public class Client {
	public static void main(String[] args) {
		//实例化容器类对象
		Aggregate<String> aggregate=new ConcreteAggregate<>();
		
		aggregate.add("张三");
		aggregate.add("李四");
		Iterator<String> iterator=aggregate.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
