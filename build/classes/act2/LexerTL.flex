
package act2;
import java_cup.runtime.*;

%%
%public
%class LexerTL
%unicode
%cup
%line
%column
%standalone
%{
    private void description(String token, String mensaje)
    {
        System.out.println("Linea: "+(yyline+1)+" Columna: "+(yycolumn+1)+" token: "+token+" --> "+mensaje);
    }
    private Symbol symbol(int type, Object value)
    {
        return new Symbol(type, (yyline+1), (yycolumn+1), value);
    }
%}

%%

//Espacios//

[ \t\n\r]   //ignorar



//Comentarios//

"//".*          {description(yytext(),"Comentario de una linea");}
"/*"[^*]*"*/"   {description(yytext(),"Comentario multilinea");}



//Palabras reservadas//

"package"       {description(yytext(),"Declaracion de paquete"); return symbol(sym.PACKAGE, yytext());}





//Simbolos//

";"             {description(yytext(),"Punto y coma"); return symbol(sym.PUNTO_COMA, yytext());}
"."             {description(yytext(),"Punto"); return symbol(sym.PUNTO, yytext());}



//Expresiones regulares//

[_$A-Za-z][a-zA-Z0-9]*  {description(yytext(),"Identificador"); return symbol(sym.IDENTIFICADOR, yytext());}


