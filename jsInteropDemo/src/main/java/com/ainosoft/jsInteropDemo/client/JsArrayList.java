package com.ainosoft.jsInteropDemo.client;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class JsArrayList<E> extends ArrayList<E> implements JList<E> {

	@Override
	public void push(E t) {
		add(t);
		
	}

	@Override
	public E pop() {
		E e = this.listIterator().next();
		this.remove(e);
		return e ; 
	}

	@Override
	public int length() {
		
		return this.length();
	}
	
	public E[] toJsArray() {
		return (E[]) this.toArray() ;
		
	}

}
