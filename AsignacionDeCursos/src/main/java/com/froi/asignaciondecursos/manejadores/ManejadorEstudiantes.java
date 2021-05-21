/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.manejadores;

import com.froi.asignaciondecursos.entidades.Estudiante;
import com.froi.asignaciondecursos.estructuras.TablaHash;
import javax.swing.JOptionPane;

/**
 *
 * @author froi-pc
 */
public class ManejadorEstudiantes {
    
    private ManejadorPrincipal manejador;
    
    public ManejadorEstudiantes(ManejadorPrincipal manejador) {
        this.manejador = manejador;
    }
    
    public void crear(String carnet, String nombre, String direccion) {
        TablaHash estudiantes = manejador.getEstudiantes();
        Estudiante nuevo;
        
        try {
            long carnetL = Long.parseLong(carnet);
            if((nuevo = estudiantes.buscar(carnetL)) == null) {
                nuevo = new Estudiante(carnetL, nombre, direccion);
                estudiantes.insertar(nuevo);
                JOptionPane.showMessageDialog(null, "Se ingresó exitosamente a " + nuevo);
            } else {
                JOptionPane.showMessageDialog(null, "El estudiante " + carnet + " ya existe en el sistema.");
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el numero de carnet (recuerde que el mismo debe ser numérico)");
        }
        
    }
    
    public void modificar(String carnet, String campo, String nuevoDato) {
        TablaHash estudiantes = manejador.getEstudiantes();
        Estudiante modificar;
        try {
            long carnetL = Long.parseLong(carnet);
            if((modificar = estudiantes.buscar(carnetL)) != null) {
                switch(campo) {
                    case "Nombre":
                        String anteriorNombre = modificar.getNombre();
                        modificar.setNombre(nuevoDato);
                        JOptionPane.showMessageDialog(null, "Se modificó el nombre de " + anteriorNombre + " a " + modificar.getNombre());
                        break;
                    case "Direccion":
                        String direccionAnterior = modificar.getDireccion();
                        modificar.setDireccion(nuevoDato);
                        JOptionPane.showMessageDialog(null, "Se ha modificado la direccion de " + direccionAnterior + " a " + modificar.getDireccion());
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró al estudiante " + carnet);
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el numero de carnet (recuerde que el mismo debe ser numérico)");
        }
    }
    
}
