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
public class Asignacion {
    private Estudiante estudiante;
    private Curso curso;
    private int zona;
    private int eFinal;

    public Asignacion(Estudiante estudiante, Curso curso, int zona, int eFinal) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.zona = zona;
        this.eFinal = eFinal;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int geteFinal() {
        return eFinal;
    }

    public void seteFinal(int eFinal) {
        this.eFinal = eFinal;
    }
    
    
}
