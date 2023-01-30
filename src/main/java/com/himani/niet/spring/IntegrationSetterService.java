package com.himani.niet.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IntegrationSetterService {
	
	
	private EmailService emailService;
	
	public void sendMessage(String msg) {
		emailService.sendMessage(msg);

	}

	public EmailService getEmailService() {
		return emailService;
	}

	@Autowired
	public void setEmailService(EmailService emailService) {
		System.out.println("Setter injection called at setEmailService() method using annotation ");
		this.emailService = emailService;
	}
	
	
}
