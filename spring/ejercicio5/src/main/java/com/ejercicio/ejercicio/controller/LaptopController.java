package com.ejercicio.ejercicio.controller;

import com.ejercicio.ejercicio.entities.Laptop;
import com.ejercicio.ejercicio.repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {


    LaptopRepository repository;

    private LaptopController(LaptopRepository repository) {

        this.repository = repository;
    }

    /**
     * Obtener todos los portatiles
     * http://localhost:8081/api/laptops
     * @return
     */

    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {

        return repository.findAll();
    }

    /**
     * Obtener un portatil por su id
     * @param id id de un laptop
     * @return
     */
    @GetMapping("/api/laptop/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id){
        Optional<Laptop> laptopOpt = repository.findById(id);
        return laptopOpt.isPresent() ? ResponseEntity.ok(laptopOpt.get()) : ResponseEntity.notFound().build();
    }

    /**
     * Añadir un portatil
     * @param laptop json de un laptop
     * @return
     */
    @PostMapping("/api/laptop")
    public Laptop create(@RequestBody Laptop laptop){

        return repository.save(laptop);
    }

}
