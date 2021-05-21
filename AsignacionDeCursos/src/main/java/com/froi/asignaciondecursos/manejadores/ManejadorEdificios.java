/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.manejadores;

import com.froi.asignaciondecursos.entidades.Edificio;
import com.froi.asignaciondecursos.estructuras.ListaDobleEnlazadaC;
import javax.swing.JOptionPane;

/**
 *
 * @author froi-pc
 */
public class ManejadorEdificios {
    
    private ManejadorPrincipal manejador;
    
    public ManejadorEdificios(ManejadorPrincipal manejador) {
        this.manejador = manejador;
    }
    
    public void crear(String nombre) {
        ListaDobleEnlazadaC<Edificio> edificios = manejador.getEdificios();
        Edificio nuevo;
        if((nuevo = edificios.buscar(nombre)) == null) {
            nuevo = new Edificio(nombre);
            edificios.insertar(nuevo);
            JOptionPane.showMessageDialog(null, "Se añadió\n" + nuevo);
        } else {
            JOptionPane.showMessageDialog(null, "El edificio " + nombre + " ya existe en el sistema.");
        }
    }
    
    public void eliminar(String nombre) {
        ListaDobleEnlazadaC<Edificio> edificios = manejador.getEdificios();
        if(edificios.eliminar(nombre)) {
            JOptionPane.showMessageDialog(null, "Se eliminó el edificio " + nombre + " junto con sus salones");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún edificio para eliminar");
        }
    }
    
}
