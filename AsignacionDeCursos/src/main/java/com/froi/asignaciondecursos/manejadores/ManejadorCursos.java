/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.manejadores;

import com.froi.asignaciondecursos.entidades.Curso;
import com.froi.asignaciondecursos.estructuras.ListaDobleEnlazadaC;
import javax.swing.JOptionPane;

/**
 *
 * @author froi-pc
 */
public class ManejadorCursos {
    
    private ManejadorPrincipal manejador;
    
    public ManejadorCursos(ManejadorPrincipal manejador) {
        this.manejador = manejador;
    }
    
    public void crear(long codigo, String nombre, int semestre, int creditos) {
        ListaDobleEnlazadaC<Curso> cursos = manejador.getCursos();
        Curso nuevo;
        if((nuevo = cursos.buscar(codigo)) == null) {
            nuevo = new Curso(codigo, nombre, semestre, creditos);
            cursos.insertar(nuevo);
            JOptionPane.showMessageDialog(null, "Se ha ingresado exitosamente\n" + nuevo);
        } else {
            JOptionPane.showMessageDialog(null, "El curso " + codigo + " ya existe en el sistema");
        }
    }
    
    public void modificar(long codigo, String campo, String nuevoDato) {
        ListaDobleEnlazadaC<Curso> cursos = manejador.getCursos();
        Curso modificar;
        if((modificar = cursos.buscar(codigo)) != null) {
            String ant = "";
            switch(campo) {
                case "Nombre":
                    ant = modificar.getNombre();
                    modificar.setNombre(nuevoDato);
                    JOptionPane.showConfirmDialog(null, "Se modifico exitosamente de " + ant + " a " + modificar.getNombre());
                    break;
                case "Semestre":
                    try {
                        int semestre = Integer.parseInt(nuevoDato);
                        ant += modificar.getsemestre();
                        modificar.setSemestre(semestre);
                        JOptionPane.showMessageDialog(null, "se modificó existosamente de " + ant+ " a " + modificar.getsemestre());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error: Semestre debe ser un dato numérico");
                    }
                    break;
                case "Creditos":
                    try {
                        int creditos = Integer.parseInt(nuevoDato);
                        ant += modificar.getCreditos();
                        modificar.setCreditos(creditos);
                        JOptionPane.showMessageDialog(null, "se modificó existosamente de " + ant+ " a " + modificar.getCreditos());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error: Semestre debe ser un dato numérico");
                    }
                    break;
            }
        }
    }
    
    public void eliminar(long codigo) {
        ListaDobleEnlazadaC<Curso> cursos = manejador.getCursos();
        if(cursos.eliminar(codigo)) {
            JOptionPane.showMessageDialog(null, "Se eliminó el curso: " + codigo);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el curso " + codigo);
        }
    }
    
}
