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
public class Usuario {
    private String usuario;
    private String nombre;
    private String contraseña;
    private String tipo;

    public Usuario(String usuario, String nombre, String contraseña, String tipo) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Usuario:\nUsuario: " + usuario + "\nNombre: " + nombre + "\nContraseña: " + contraseña + "\nTipo: " + tipo;
    }
}
