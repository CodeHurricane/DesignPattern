package com.dongnao.iterator;
/**
 * ��������ӿ�
 * @author Administrator
 *
 * @param <T>
 */
public interface Iterator<T> {
	/**
	 * �Ƿ�����һ��Ԫ��
	 * @return
	 */
	boolean hasNext();
	
	
	T next();
}
