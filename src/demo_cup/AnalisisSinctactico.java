package demo_cup;
import java.io.*;
import java_cup.runtime.*;


public class AnalisisSinctactico{
    public static void main(String[] args) throws FileNotFoundException{
        Reader lector = new FileReader("src/demo_cup/pruebas.txt");
        LexerCSharp lexer = new LexerCSharp(lector);
        ParserDemo parser = new ParserDemo(lexer);

        try{
            parser.parse();
            System.out.println("Analisis sintactico correcto");
        }
        catch(Exception e){
            System.out.println("Error durante el analisis " + e.getMessage());
        }
    }
}

//Este es el que se corre para analisar