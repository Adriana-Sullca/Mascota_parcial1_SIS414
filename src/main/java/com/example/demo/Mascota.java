package com.example.demo;

import io.swagger.v3.oas.annotations.media.Schema;

public class Mascota {
    @Schema(example = "1")
    private Long id;
    @Schema(example = "Firulais")
    private String nombre;
    @Schema(example = "Perro")
    private String especie;
    @Schema(example = "Golden Retriever")
    private String raza;
    @Schema(example = "3")
    private int edad;
    @Schema(example = "Adriana Sullca")
    private String dueno;

    public Mascota() {}

    public Mascota(Long id, String nombre, String especie, String raza, int edad, String dueno) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.dueno = dueno;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getDueno() { return dueno; }
    public void setDueno(String dueno) { this.dueno = dueno; }
}
