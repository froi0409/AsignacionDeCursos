/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.manejadores;

import com.froi.asignaciondecursos.entidades.Catedratico;
import com.froi.asignaciondecursos.estructuras.ArbolAVL;
import javax.swing.JOptionPane;

/**
 *
 * @author froi-pc
 */
public class ManejadorCatedraticos {
    
    private ManejadorPrincipal manejador;
    
    public ManejadorCatedraticos(ManejadorPrincipal manejador) {
        this.manejador = manejador;
    }
    
    public void crear(String numero, String nombre, String direccion) {
        ArbolAVL<Catedratico> catedraticos = manejador.getCatedraticos();
        try {
            long numeroL = Long.parseLong(numero);
            Catedratico nuevo = new Catedratico(numeroL, nombre, direccion);
            catedraticos.insertar(nuevo);
            JOptionPane.showMessageDialog(null, "Se ingresó con éxito\n" + nuevo);
        } catch(java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al reconocer el numero de identificación (recuerde que debe ser un dato de tipo numérico)");
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "El catedrático " + numero + " ya existe en el sistema.");
        }
    }
    
    public void modificar(String numero, String campo, String nuevoDato) {
        ArbolAVL<Catedratico> catedraticos = manejador.getCatedraticos();
        Catedratico modificar;
        try {
            long numeroL = Long.parseLong(numero);
            if((modificar = catedraticos.buscar(numeroL)) != null) {
                switch(campo) {
                    case "Nombre":
                        String datoAnterior = modificar.getNombre();
                        modificar.setNombre(nuevoDato);
                        JOptionPane.showMessageDialog(null, "Se modifico el Nombre de " + datoAnterior + " a " + modificar.getNombre());
                        break;
                    case "Direccion":
                        String datoAnteriorC = modificar.getDireccion();
                        modificar.setDireccion(nuevoDato);
                        JOptionPane.showMessageDialog(null, "Se modificó la Contraseña de " + datoAnteriorC + " a " + modificar.getDireccion());
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró a nungún catedrático " + numero);
            }
        } catch(java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al reconocer el numero de identificación (recuerde que debe ser un dato de tipo numérico)");
        }
    }
    
}
