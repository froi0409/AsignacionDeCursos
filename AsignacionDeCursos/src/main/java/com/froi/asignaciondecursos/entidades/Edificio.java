/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.entidades;

import com.froi.asignaciondecursos.estructuras.ListaEnlazada;

/**
 *
 * @author froi-pc
 */
public class Edificio {
    private String nombre;
    private ListaEnlazada<Salon> salones;
    
    public Edificio(String nombre) {
        this.salones = new ListaEnlazada<>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaEnlazada<Salon> getSalones() {
        return salones;
    }

    public void setSalones(ListaEnlazada<Salon> salones) {
        this.salones = salones;
    }
    
    @Override
    public String toString() {
        return "Edificio:\nNombre: " + nombre;
    }
    
}
