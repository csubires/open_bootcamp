package com.ejercicio.ejercicio.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "Laptop")
@ApiModel("Entidad laptop para representar un elemento un portatil")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("Clave primaria")
    Long id;
    String marca;
    String cpu;
    Double pulgadas;
    Integer ram;
    Boolean tactil;

    public Laptop() {
    }

    public Laptop(Long id, String marca, String cpu, Double pulgadas, Integer ram, Boolean tactil) {
        this.id = id;
        this.marca = marca;
        this.cpu = cpu;
        this.pulgadas = pulgadas;
        this.ram = ram;
        this.tactil = tactil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Boolean getTactil() {
        return tactil;
    }

    public void setTactil(Boolean tactil) {
        this.tactil = tactil;
    }
}
