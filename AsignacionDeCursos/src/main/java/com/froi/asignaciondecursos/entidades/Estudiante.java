/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.entidades;

/**
 *
 * @author froi-pc
 */
public class Estudiante {
    private long carnet;
    private String nombre;
    private String direccion;

    public Estudiante(long carnet, String nombre, String direccion) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public long getCarnet() {
        return carnet;
    }

    public void setCarnet(long carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Estudiante:\nCarnet: " + carnet + "\nNombre: " + nombre + "\nDirección: " + direccion;
    }
}
