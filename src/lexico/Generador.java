package lexico;

import java.io.IOException;

public class Generador {
    public static void main(String[] args) throws IOException, Exception {
        // Ruta al archivo .flex
        String pathFlex = "src/lexico/lexico_csharp.flex";

        // Usar un array de String para pasar la ruta
        String[] parametrosLex = {pathFlex};
        jflex.Main.main(parametrosLex);

        // Parámetros para CUP
        String[] parametros = {"-destdir", "src/lexico", "-parser", "ParserCSharp", 
                               "-progress", "src/lexico/tokens.cup"};
        java_cup.Main.main(parametros);
    }
}