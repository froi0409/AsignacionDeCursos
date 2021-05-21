/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.entidades;

/**
 *
 * @author froi-pc
 */
public class Curso {
    private long codigo;
    private String nombre;
    private int semestre;
    private int creditos;

    public Curso(long codigo, String nombre, int semestre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.creditos = creditos;
    }
    
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getsemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    @Override
    public String toString() {
        return "Curso:\nCodigo: " + codigo + "\nNombre: " + nombre + "\nSemestre: " + semestre + "\nCreditos: " + creditos;
    }
}
