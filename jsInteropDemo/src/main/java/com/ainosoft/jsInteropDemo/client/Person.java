package com.ainosoft.jsInteropDemo.client;

import java.util.Arrays;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = "GwtHost")
public class Person {

	@JsProperty
	String name ;
	
	@JsProperty
	int age ;
	
	private JsArrayList<Address> list = null ;
	
	private JsArrayList<Address> getAddressList(){
		
		if (list == null )
			list = new JsArrayList<Address>();
		
		return list ;
	}
	
	@JsMethod
	JList<Address> getAddresses(){
		return getAddressList() ;
	}
	
	@JsMethod
	public void setAddresses(Address[] address){
		getAddressList().addAll(Arrays.asList(address)) ;
	}

}
