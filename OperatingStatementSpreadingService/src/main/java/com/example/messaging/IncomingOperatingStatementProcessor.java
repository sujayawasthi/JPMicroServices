package com.example.messaging;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

import com.example.dto.OperatingStatement;
import com.example.repositories.OperatingStatementRepository;

@MessageEndpoint
public class IncomingOperatingStatementProcessor {

	@Autowired
	OperatingStatementRepository repo;

	@ServiceActivator(inputChannel = "osInputChannel")
	public void onOperatingStatementArrival(Message<OperatingStatement> os) {
		com.example.model.OperatingStatement oper = new com.example.model.OperatingStatement();
		BeanUtils.copyProperties(os.getPayload(), oper);
		repo.save(oper);
	}

}