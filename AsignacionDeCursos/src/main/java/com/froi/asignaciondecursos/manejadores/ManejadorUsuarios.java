/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.manejadores;

import com.froi.asignaciondecursos.entidades.Estudiante;
import com.froi.asignaciondecursos.entidades.Usuario;
import com.froi.asignaciondecursos.estructuras.ListaDobleEnlazadaC;
import com.froi.asignaciondecursos.estructuras.TablaHash;
import javax.swing.JOptionPane;

/**
 *
 * @author froi-pc
 */
public class ManejadorUsuarios {
    
    private ManejadorPrincipal manejador;
    
    public ManejadorUsuarios(ManejadorPrincipal manejador) {
        this.manejador = manejador;
    }
    
    public void crear(String usuario, String nombre, String contraseña, String tipo) {
        ListaDobleEnlazadaC<Usuario> usuarios = manejador.getUsuarios();
        Usuario nuevo;
        if((nuevo = usuarios.buscar(usuario)) == null){
            if(tipo.equals("colaborador")) {
                nuevo = new Usuario(usuario, nombre, contraseña, tipo);
                usuarios.insertar(nuevo);
                JOptionPane.showMessageDialog(null, "Se insertó exitosamente\n\n" + nuevo);
            } else {
                TablaHash t = manejador.getEstudiantes();
                try {
                    long carnet = Long.parseLong(usuario);
                    Estudiante estudiante;
                    if((estudiante  = t.buscar(carnet)) != null) {
                        nuevo = new Usuario(usuario, nombre, contraseña, tipo);
                        usuarios.insertar(nuevo);
                        JOptionPane.showMessageDialog(null, "Se insertó exitosamente\n\n" + nuevo);
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe el estudiante " + usuario);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No se econtró al estudiante: " + usuario);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ya existente");
        }
    }
    
    public void modificar(String usuario, String campo, String nuevoDato) {
        ListaDobleEnlazadaC<Usuario> usuarios = manejador.getUsuarios();
        Usuario modificar;
        if((modificar = usuarios.buscar(usuario)) != null) {
            switch(campo) {
                case "Nombre":
                    String datoAnterior = modificar.getNombre();
                    modificar.setNombre(nuevoDato);
                    JOptionPane.showMessageDialog(null, "Se modifico el Nombre de " + datoAnterior + " a " + modificar.getNombre());
                    break;
                case "Contraseña":
                    String datoAnteriorC = modificar.getContraseña();
                    modificar.setContraseña(nuevoDato);
                    JOptionPane.showMessageDialog(null, "Se modificó la Contraseña de " + datoAnteriorC + " a " + modificar.getContraseña());
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe el usuario en el sistema.");
        }
    }
    
    public void eliminar(String usuario) {
        ListaDobleEnlazadaC<Usuario> usuarios = manejador.getUsuarios();
        if(usuarios.eliminar(usuario)) {
            JOptionPane.showMessageDialog(null, "Se eliminó al usuario " + usuario);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró a ningún usuario para eliminar");
        }
    }
    
}
