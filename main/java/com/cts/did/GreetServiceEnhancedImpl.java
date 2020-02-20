package com.cts.did;

public abstract class GreetServiceEnhancedImpl implements GreetService {
	
	public GreetServiceEnhancedImpl(String greeting) {
		super();
		this.greeting=greeting;
	}
	
	
	public GreetServiceEnhancedImpl() {
		super();
		
	}
	
	
	private String greeting;



	public String getGreeting()  {
		
		return greeting;
	
	}
	

	public void setGreeting(String greeting)  {
		
		this.greeting = greeting;
	
	}


	public String gree(String userName) {
		// TODO Auto-generated method stub
		return greeting +userName;
	}


	
	

}
