/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.entidades;

import com.froi.asignaciondecursos.estructuras.ListaDobleEnlazadaC;

/**
 *
 * @author froi-pc
 */
public class Horario {
    private long codigo;
    private String rangoHora;
    private String dia;
    private Salon salon;
    private Curso curso;
    private Catedratico catedratico;
    private ListaDobleEnlazadaC<Asignacion> asignaciones;
    
    public Horario(long codigo) {
        this.codigo = codigo;
    }
    
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getRangoHora() {
        return rangoHora;
    }

    public void setRangoHora(String rangoHora) {
        this.rangoHora = rangoHora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

    public ListaDobleEnlazadaC<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(ListaDobleEnlazadaC<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
    
}
