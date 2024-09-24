/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_cup;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jflex.Main;
/**
 *
 * @author DocentesUTJCCD
 */
public class Generador {
    public static void main(String[] args) {
        // Define las rutas del archivo JFlex y el directorio de salida
        String jflex = "src/demo_cup/CSharp.flex";

        // Configura los argumentos para JFlex
        String[] jflexArgs = { jflex };

        //try {
            // Llama al método main de JFlex.Main para generar el lexer
          //  Main.generate(jflexArgs);
            //System.out.println("Lexer generado con éxito " );
        //} catch (Exception e) {
          //  System.err.println("Error al generar el lexer.");
            //e.printStackTrace();
            //System.exit(1);
        //}
        
        String[] parametros = {"-destdir","src\\demo_cup","-parser", "ParserDemo", "-progress","src\\demo_cup\\CSharp.cup"};
        try {
            java_cup.Main.main(parametros);
        } catch (IOException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
