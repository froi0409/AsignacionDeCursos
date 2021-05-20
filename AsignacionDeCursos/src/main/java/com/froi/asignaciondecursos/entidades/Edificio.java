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
    
    public Edificio() {
        this.salones = new ListaEnlazada<>();
    }
}
