
package act5;

import java.io.IOException;
/**
 *
 * @author nanon
 */
public class GeneradorCupParser {
    public static void main(String[] args) throws IOException, Exception{
        String[] parametros ={"-destdir", "src/act5", "-parser", "ParserTL","-progress", "src/act5/parser.cup"};
        java_cup.Main.main(parametros);
    }
}
