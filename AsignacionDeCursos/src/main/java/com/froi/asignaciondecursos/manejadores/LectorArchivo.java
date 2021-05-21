/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.manejadores;

import com.froi.asignaciondecursos.gramatica.EntradaLexer;
import com.froi.asignaciondecursos.gramatica.EntradaParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import javax.swing.JTextArea;

/**
 *
 * @author froi-pc
 */
public class LectorArchivo {
    
    private ManejadorPrincipal manejadorPrincipal;
    
    public LectorArchivo(ManejadorPrincipal manejadorPrincipal) {
        this.manejadorPrincipal = manejadorPrincipal;
    }
    
    public void leerArchivo(File archivo, JTextArea salida) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String entradaProv;
            String entrada = "";
            while((entradaProv = reader.readLine()) != null) {
                entrada += entradaProv + "\n";
            }
            StringReader read = new StringReader(entrada);
            EntradaLexer lexer = new EntradaLexer(read);
            EntradaParser parser = new EntradaParser(lexer, manejadorPrincipal, salida);
            try {
                parser.parse();
            } catch (Exception e) {
                salida.setText("Error durante la lectura del archivo (revise que la gramática sea correcta)");
            }
        } catch (Exception e) {
            salida.setText("Error al leer el archivo de entrada (revise que el archivo a leer sea válido)");
        }
        
    }
    
}
