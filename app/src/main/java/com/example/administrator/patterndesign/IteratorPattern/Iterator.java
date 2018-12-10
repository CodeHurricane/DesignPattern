package com.example.administrator.patterndesign.IteratorPattern;
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
