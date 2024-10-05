
package act5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


/**
 *
 * @author nanon
 */
public class AnalizadorSintactico {
    public static void main(String[] args) throws IOException{
        Reader lector = new BufferedReader(new FileReader("src/act5/prueba_sintatico.txt"));
        LexerTL lexer = new LexerTL(lector);
        ParserTL parser = new ParserTL(lexer);
        
        try{
            System.out.println(parser.parse());
            System.out.println("Analisis realizado correctamente");
        }catch (Exception ex){
            System.out.println("Error durante el analisis \n"+ex.getMessage());
        }
    }
    
}
