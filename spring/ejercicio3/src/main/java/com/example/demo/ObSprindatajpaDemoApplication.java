package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSprindatajpaDemoApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(ObSprindatajpaDemoApplication.class, args);

		SaludoRepository repository = context.getBean(SaludoRepository.class);

		System.out.println("El num de saludos en base de datos es: " + repository.count());

		Saludo saludo1 = new Saludo();
		Saludo saludo2 = new Saludo("Hola soy el saludo 2");
		Saludo saludo3 = new Saludo("Hola soy el saludo 3");
		Saludo saludo4 = new Saludo("Hola soy el saludo 4");
		Saludo saludo5 = new Saludo("Hola soy el saludo 5");

		repository.save(saludo1);
		repository.save(saludo2);
		repository.save(saludo3);
		repository.save(saludo4);
		repository.save(saludo5);

		System.out.println("El num de saludos en base de datos es: " + repository.count());


		for (Saludo saludo: repository.findAll()) {
			saludo.imprimirSaludo();
		}

	}

}
