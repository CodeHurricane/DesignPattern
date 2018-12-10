package com.example.administrator.patterndesign.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ����������ӿ�
 * ����
 * @author Administrator
 *
 * @param <T>
 */
public class ConcreteAggregate<T>  implements Aggregate<T>{
	private List<T> list=new ArrayList<>();
	@Override
	public void add(T t) {
		list.add(t);
	}

	@Override
	public void remove(T t) {
		list.remove(t);
	}

	@Override
	public Iterator<T> iterator() {
		return new ConcreteItertor<>(list);
	}

}
