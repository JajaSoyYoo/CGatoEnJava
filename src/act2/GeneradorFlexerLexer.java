package act2;

//import java.io.File;

/**
 *
 * @author Alan
 */
public class GeneradorFlexerLexer {
    public static void main(String[] args) {
        String pathFlex = "src/act2/LexerTL.flex"; // Ruta al archivo .flex
        String[] parametrosLex = {pathFlex}; // Crear un arreglo con la ruta
        
        // Generar el lexer
        jflex.Main.main(parametrosLex); // Llama a main con el arreglo de String
    }
}