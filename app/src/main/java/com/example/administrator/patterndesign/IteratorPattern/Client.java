package com.example.administrator.patterndesign.IteratorPattern;

public class Client {
	public static void main(String[] args) {
		//ʵ�������������
		Aggregate<String> aggregate=new ConcreteAggregate<>();
		
		aggregate.add("����");
		aggregate.add("����");
		Iterator<String> iterator=aggregate.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
