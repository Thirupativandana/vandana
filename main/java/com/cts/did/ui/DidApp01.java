package com.cts.did.ui;

import com.cts.did.GreetService;

public class DidApp01 {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathxmlApplicationContext("bean1.xml");
		
		GreetService gs=(GreetService) context.getbean("g1");
		System.out.println(gs.greet("abc"));

		GreetService gs1=(GreetService) context.getbean("g2");
		System.out.println(gs.greet("abc"));
		
		GreetService gs2=(GreetService) context.getbean("g3");
		System.out.println(gs.greet("abc"));
		
		GreetService gs3=(GreetService) context.getbean("g4");
		System.out.println(gs.greet("abc"));	}

}
