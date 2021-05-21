/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos;

import com.froi.asignaciondecursos.entidades.Estudiante;
import com.froi.asignaciondecursos.entidades.Horario;
import com.froi.asignaciondecursos.estructuras.ArbolAVL;
import com.froi.asignaciondecursos.estructuras.ArbolB;
import com.froi.asignaciondecursos.estructuras.ListaDobleEnlazadaC;
import com.froi.asignaciondecursos.estructuras.ListaEnlazada;
import com.froi.asignaciondecursos.estructuras.TablaHash;
import com.froi.asignaciondecursos.frontend.VentanaInicial;

/**
 *
 * @author froi-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TablaHash tabla = new TablaHash();
        tabla.insertar(new Estudiante(2018221));
        tabla.insertar(new Estudiante(20191638));
        tabla.insertar(new Estudiante(265468));
        tabla.insertar(new Estudiante(3979));
        tabla.insertar(new Estudiante(4787987));
        tabla.insertar(new Estudiante(53651));
        tabla.insertar(new Estudiante(6654654));
        tabla.insertar(new Estudiante(2018221));
        tabla.insertar(new Estudiante(2018221));
        tabla.imprimir();
        
//        if((prov = a.buscar(3)) != null) {
//            System.out.println("se encontró");
//        } else {
//            System.out.println("No se encontró");
//        }
        
        VentanaInicial v = new VentanaInicial();
        v.setVisible(true);
    }
    
}
