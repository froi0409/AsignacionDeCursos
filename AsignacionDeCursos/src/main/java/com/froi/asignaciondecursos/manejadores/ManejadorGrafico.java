/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.manejadores;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author froi-pc
 */
public class ManejadorGrafico {
    
        public void graficarEstadoMemoria(String dotCode, String nombreArchivo) {
        String nomArch = nombreArchivo + ".dot";
        System.out.println(dotCode);
        FileWriter fichero = null;
        try {
            fichero = new FileWriter(nomArch);
            PrintWriter writer = new PrintWriter(fichero);
            writer.print(dotCode);
            fichero.close();
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo dot: " + e.getMessage());
        } finally {
            try {
                if(null != fichero) {
                    fichero.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
        try {
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("dot -Tpng " + nomArch  + " -o " + nombreArchivo + ".png");
            System.out.println("dot -Tpng " + nomArch  + " -o " + nombreArchivo + ".png");
            Thread.sleep(500);
            JOptionPane.showMessageDialog(null, "Imagen Generada en la carpeta del proyecto");
        } catch (Exception e) {
            System.out.println("Error al generar la imagen");
        }
    }
    
}
