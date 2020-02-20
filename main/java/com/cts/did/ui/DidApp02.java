package com.cts.did.ui;

import org.springframework.context.Applicarioncontext;

import com.cts.did.GreetService;
import com.cts.did.GreetServiceEnhancedImpl;

public class DidApp02 {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathxmlApplicationContext("bean2.xml");
		
		
		GreetServiceEnhancedImpl gs2=(GreetServiceEnhancedImpl) context.getbean("g2");
		gs2.setGreeting("vanakam");
		System.out.println(gs2.greet("abc"));	
		
		
		GreetServiceEnhancedImpl gs3=(GreetServiceEnhancedImpl) context.getbean("g2");
		System.out.println(gs3.greet("abc"));
		
		GreetService gs4=(GreetService) context.getbean("g3");
		System.out.println(gs4.greet("abc"));
	
	
	}

}
