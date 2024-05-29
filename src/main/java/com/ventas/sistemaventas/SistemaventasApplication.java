package com.ventas.sistemaventas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaventasApplication implements CommandLineRunner {
 @Autowired
    private DatabaseConnectionCheck arangoTestService;
	public static void main(String[] args) {
		SpringApplication.run(SistemaventasApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
        arangoTestService.checkConnection();
    }

}
