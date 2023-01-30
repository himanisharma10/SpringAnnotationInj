package com.himani.niet.spring;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

	public boolean sendMessage(String msg) {
		System.out.println("Email Message sent: "+msg);
		return true;
	}
	
	

}
