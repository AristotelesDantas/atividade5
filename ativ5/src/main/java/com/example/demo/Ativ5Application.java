package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.entity.Departamento;
import com.example.service.DepartamentoService;



@SpringBootApplication
public class Ativ5Application {
	private static final Logger log = LoggerFactory.getLogger(Ativ5Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Ativ5Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(DepartamentoService departamentoService) {
		return (args) -> {
			
			//salvando departamento
			Departamento depto1 = new Departamento();
			depto1.setNomeDepartamento("TI");
			
			Departamento depto2 = new Departamento();
			depto2.setNomeDepartamento("RH");
			
			departamentoService.salvar(depto1);
			departamentoService.salvar(depto2);
			
			//retornando todos os departamentos
			log.info("Departamento encontrados com findAll():");
			log.info("---------------------------------");
			for(Departamento departamento : departamentoService.buscarTodos()) {
				log.info(departamento.toString());
			}
			log.info("");
			
		};
	}
}


