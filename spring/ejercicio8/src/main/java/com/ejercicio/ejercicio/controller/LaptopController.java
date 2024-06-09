package com.ejercicio.ejercicio.controller;

import com.ejercicio.ejercicio.entities.Laptop;
import com.ejercicio.ejercicio.repository.LaptopRepository;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private final Logger log = LoggerFactory.getLogger(LaptopController.class);
    LaptopRepository repository;
    @Value("${app.nombre}")
    private String nombre;

    private LaptopController(LaptopRepository repository) {

        this.repository = repository;
    }



    @GetMapping("/")
    public String saludar() {
        return "Hola ¿Cómo estas " + nombre + " ?";
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
    @ApiOperation("Crear un laptop y añadirlo a la bbdd")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){
        if(laptop.getId() != null){
            log.warn("trying to create a laptop with id");
            return ResponseEntity.badRequest().build();
        }
        Laptop data = repository.save(laptop);
        return ResponseEntity.ok(data);
    }


    /**
     * Actualizar información de un portatil
     * @param laptop información del laptop a modificar
     * @return
     */
    @PutMapping("/api/laptop")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop){

        // Error 1
        if(laptop.getId() == null ){
            log.warn("Trying to update a non existent laptop");
            return ResponseEntity.badRequest().build();
        }
        // Error 2
        if(!repository.existsById(laptop.getId())){
            log.warn("Trying to update a non existent laptop");
            return ResponseEntity.notFound().build();
        }
        // Todo va bien
        Laptop result = repository.save(laptop);
        return ResponseEntity.ok(result);
    }


    /**
     * Borrar un portatil
     * @param id id del portatil a borrar
     * @return
     */

    @ApiIgnore
    @DeleteMapping("/api/laptop/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id){

        if(!repository.existsById(id)){
            log.warn("Trying to delete a non existent laptop");
            return ResponseEntity.notFound().build();
        }

        repository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    /**
     * Borrar todos los portatiles
     * @return
     */
    @DeleteMapping("/api/laptops")
    @ApiIgnore
    public ResponseEntity<Laptop> deleteAll(){
        log.info("REST Request for delete all laptop");
        repository.deleteAll();
        return ResponseEntity.noContent().build();
    }

}
