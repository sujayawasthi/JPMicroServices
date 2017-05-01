package com.example.dataloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.OperatingStatement;
import com.example.repositories.OperatingStatementRepository;

@Component
public class DataLoad implements CommandLineRunner {

	@Autowired
	OperatingStatementRepository repo;

	@Override
	public void run(String... arg0) throws Exception {

		OperatingStatement os1 = new OperatingStatement("2014", "Annual");
		OperatingStatement os2 = new OperatingStatement("2015", "Quarterly");
		OperatingStatement os3 = new OperatingStatement("2016", "Annual");
		OperatingStatement os4 = new OperatingStatement("2017", "Annual");
		OperatingStatement os5 = new OperatingStatement("2018", "Semi-Annual");

		repo.save(os1);
		repo.save(os2);
		repo.save(os3);
		repo.save(os4);
		repo.save(os5);
	}

}
