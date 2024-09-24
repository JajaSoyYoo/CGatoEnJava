
package act2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java_cup.runtime.Symbol;
import java_cup.sym;

/**
 *
 * @author Alan
 */
public class AnalizadorLexico {
    public static void main(String[] args) throws IOException{
        try{
            Reader lector = new BufferedReader(new FileReader("src/act2/prueba_lexer.txt"));
            LexerTL lexico = new LexerTL(lector);
            String resultado = "";
            while (true){
                Symbol token = lexico.next_token();
                if(token.sym == sym.EOF){
                    resultado += "FIN";
                    System.out.println("resultado");
                    break;
                }
            }
        }   catch(FileNotFoundException ex){
            
        }   catch(IOException ex){
            
        }
    }
}
