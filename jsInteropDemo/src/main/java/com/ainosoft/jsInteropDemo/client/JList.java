package com.ainosoft.jsInteropDemo.client;

import com.google.gwt.core.client.JsArray;

import jsinterop.annotations.JsType;

@JsType (namespace = "GwtHost")
public interface JList<T> {
	
	public void push(T t);
	
	public T pop();
	
	public int length() ;
	
	public T[] toJsArray() ;
}
