package com.example.administrator.patterndesign.IteratorPattern;
/**
 * �����Ľӿ�
 * @author Administrator
 */
public interface Aggregate<T> {
	void  add(T t);
	
	void remove(T t);
	
	Iterator<T> iterator();
	
}
