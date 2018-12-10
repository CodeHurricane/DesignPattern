package com.dongnao.iterator;
/**
 * 抽象迭代接口
 * @author Administrator
 *
 * @param <T>
 */
public interface Iterator<T> {
	/**
	 * 是否还有下一个元素
	 * @return
	 */
	boolean hasNext();
	
	
	T next();
}
