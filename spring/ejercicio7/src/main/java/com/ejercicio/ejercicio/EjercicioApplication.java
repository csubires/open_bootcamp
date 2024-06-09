package com.ejercicio.ejercicio;

import com.ejercicio.ejercicio.entities.Laptop;
import com.ejercicio.ejercicio.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjercicioApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(EjercicioApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "LG", "Intel", 19D, 16, false);
		Laptop laptop2 = new Laptop(null, "Tochiba", "Intel", 21D, 8, true);
		Laptop laptop3 = new Laptop(null, "Dell", "AMD", 19D, 4, false);
		Laptop laptop4 = new Laptop(null, "HP", "AMD", 21D, 8, true);
		Laptop laptop5 = new Laptop(null, "Asus", "Intel", 23D, 32, false);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);
		repository.save(laptop4);
		repository.save(laptop5);


	}

}
