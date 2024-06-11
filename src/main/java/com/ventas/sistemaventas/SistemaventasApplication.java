package com.ventas.sistemaventas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaventasApplication  {
 @Autowired
	public static void main(String[] args) {
		SpringApplication.run(SistemaventasApplication.class, args);
	}
	

}
