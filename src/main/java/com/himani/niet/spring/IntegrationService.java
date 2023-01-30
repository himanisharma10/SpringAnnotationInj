package com.himani.niet.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IntegrationService {
	
	@Autowired
	private EmailService emailService;
	
	public void sendMessage(String msg) {
		emailService.sendMessage(msg);

	}
}
