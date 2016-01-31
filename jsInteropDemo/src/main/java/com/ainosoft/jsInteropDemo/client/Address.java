package com.ainosoft.jsInteropDemo.client;

import jsinterop.annotations.JsType;

@JsType (namespace = "GwtHost")
public class Address {

	private String street ;
	
	public Address() {
		street = "Ben yehuda 53 " ;
	}
	
	public String getStreet(){
		return street ;
	}

}
