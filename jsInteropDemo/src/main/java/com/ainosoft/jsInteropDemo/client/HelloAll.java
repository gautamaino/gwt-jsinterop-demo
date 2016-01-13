package com.ainosoft.jsInteropDemo.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(namespace = "JsHost" , name = "Hello")
public class HelloAll {

	@JsMethod(name="hello")
	public String sayHello(String name){
		return "Hello " + name ; 
	}

}
