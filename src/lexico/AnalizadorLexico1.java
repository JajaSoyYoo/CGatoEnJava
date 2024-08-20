/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java_cup.runtime.Symbol;

/**
 *
 * @author 7053
 */
public class AnalizadorLexico1 {
    public static void main(String[] args) throws IOException {
//         File archivo = new File("archivo.txt");
//        PrintWriter escribir;
       
        try {
            Reader lector = new BufferedReader(new FileReader("src/lexico/prueba.txt"));
            ScannerCS lexer = new ScannerCS(lector);
            String resultado = "";
            while (true) {
                Symbol token = lexer.next_token();
//                System.out.println("jejejej"+token.toString());
                if (token.sym == sym.EOF) {
                    resultado += "FIN";
                    System.out.println(resultado);
                    break;
                }
            }
         //   System.out.println("Resultado final nuevo "+lexer.getResultado());
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
    }
}
