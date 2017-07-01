package com.lucksoft.hello.impl;

import com.lucksoft.hello.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public void printHelloWorld(String msg) {

		System.out.println("Hello : " + msg);
	}

}