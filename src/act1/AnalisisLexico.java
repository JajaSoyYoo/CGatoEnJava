/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author DocentesUTJCCD
 */
public class AnalisisLexico {
     public static void main(String[] args) {
        System.out.println("NOMBRES COMPLETOS ORDENADOS POR PRIMER APELLIDO \n");
         
         
        String test = "src/act_1_lexico/prueba_palabras_reservadas.txt";

        try (Reader reader = new FileReader(test)) {
            // Crear la instancia del lexer directamente
            LexerPalabrasReservadas lexer = new LexerPalabrasReservadas(reader);

            // Leer tokens y procesarlos
            int token;
            while ((token = lexer.yylex()) != -1) {
                System.out.println("Token: " + token);
                System.out.println("");
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de prueba.");
            e.printStackTrace();
        }
        
        
        System.out.println("\n NOMBRES COMPLETOS ORDENADOS POR PRIMER APELLIDO");
    }

    
}