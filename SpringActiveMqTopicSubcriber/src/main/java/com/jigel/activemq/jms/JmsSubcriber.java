package com.jigel.activemq.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.jigel.activemq.models.Company;


@Component
public class JmsSubcriber {
	
	@JmsListener(destination = "${jsa.activemq.topic}")
	public void receive(String msg){
		System.out.println("Recieved Message: " + msg);
	}
}
