package com.cts.did;

public abstract class GreetServiceSimpleImpl implements GreetService {
	
	public String greet(String userName) {
	return "Hello"+ " "+userName;
}

}
