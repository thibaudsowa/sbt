package com.thibaudsowa.sbt;

public class HelloService {

	public static String sayHello(String name) {
		if(name.equals("thibaud")) {
            return "Hello " + name + "!!!";
        } else {
            return "Hello " + name + "...";
        }
	}
}
