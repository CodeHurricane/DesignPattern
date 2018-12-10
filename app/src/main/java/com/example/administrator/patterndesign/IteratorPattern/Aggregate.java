package com.dongnao.iterator;
/**
 * ÈÝÆ÷µÄ½Ó¿Ú
 * @author Administrator
 */
public interface Aggregate<T> {
	void  add(T  t);
	
	void remove(T t);
	
	Iterator<T> iterator();
	
}
