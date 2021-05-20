/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.manejadores;

import com.froi.asignaciondecursos.entidades.Catedratico;
import com.froi.asignaciondecursos.entidades.Curso;
import com.froi.asignaciondecursos.entidades.Edificio;
import com.froi.asignaciondecursos.entidades.Usuario;
import com.froi.asignaciondecursos.estructuras.ArbolAVL;
import com.froi.asignaciondecursos.estructuras.ListaDobleEnlazadaC;

/**
 *
 * @author froi-pc
 */
public class ManejadorPrincipal {
    
    private ListaDobleEnlazadaC<Usuario> usuarios;
    private ListaDobleEnlazadaC<Edificio> edificios;
    private ListaDobleEnlazadaC<Curso> cursos;
    private ArbolAVL<Catedratico> catedraticos;
     
    public ManejadorPrincipal() {
        this.usuarios = new ListaDobleEnlazadaC<>();
        this.edificios = new ListaDobleEnlazadaC<>();
        this.cursos = new ListaDobleEnlazadaC<>();
        this.catedraticos = new ArbolAVL<>();
        
        //Insertamos al super usuario
        usuarios.insertar(new Usuario("04092000", "Fernando Ocaña", "admin123", "super"));
    }

    public ListaDobleEnlazadaC<Usuario> getUsuarios() {
        return usuarios;
    }

    public ListaDobleEnlazadaC<Edificio> getEdificios() {
        return edificios;
    }

    public ListaDobleEnlazadaC<Curso> getCursos() {
        return cursos;
    }

    public ArbolAVL<Catedratico> getCatedraticos() {
        return catedraticos;
    }
    
}
