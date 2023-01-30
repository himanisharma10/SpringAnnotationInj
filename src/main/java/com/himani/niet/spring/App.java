package com.himani.niet.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.himani.niet.spring");
        appContext.refresh();
        IntegrationService service = (IntegrationService)appContext.getBean("integrationService");
        service.sendMessage("Hello All");
        appContext.registerShutdownHook();
    }
    
}
