/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.manejadores;

import com.froi.asignaciondecursos.entidades.Asignacion;
import com.froi.asignaciondecursos.entidades.Catedratico;
import com.froi.asignaciondecursos.entidades.Curso;
import com.froi.asignaciondecursos.entidades.Edificio;
import com.froi.asignaciondecursos.entidades.Horario;
import com.froi.asignaciondecursos.entidades.Usuario;
import com.froi.asignaciondecursos.estructuras.ArbolAVL;
import com.froi.asignaciondecursos.estructuras.ListaDobleEnlazadaC;
import com.froi.asignaciondecursos.estructuras.TablaHash;

/**
 *
 * @author froi-pc
 */
public class ManejadorPrincipal {
    
    private ListaDobleEnlazadaC<Usuario> usuarios;
    private ListaDobleEnlazadaC<Edificio> edificios;
    private ListaDobleEnlazadaC<Curso> cursos;
    private ListaDobleEnlazadaC<Asignacion> asignaciones;
    private ArbolAVL<Catedratico> catedraticos;
    private ArbolAVL<Horario> horarios;
    private TablaHash estudiantes; 
    
    public ManejadorPrincipal() {
        this.usuarios = new ListaDobleEnlazadaC<>();
        this.edificios = new ListaDobleEnlazadaC<>();
        this.cursos = new ListaDobleEnlazadaC<>();
        this.asignaciones = new ListaDobleEnlazadaC<>();
        this.horarios = new ArbolAVL<>();
        this.catedraticos = new ArbolAVL<>();
        this.estudiantes = new TablaHash();
        
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

    public TablaHash getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(TablaHash estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ListaDobleEnlazadaC<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(ListaDobleEnlazadaC<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public ArbolAVL<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArbolAVL<Horario> horarios) {
        this.horarios = horarios;
    }
    
}
