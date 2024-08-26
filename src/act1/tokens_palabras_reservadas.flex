/*
    NOMBRES COMPLETOS ORDENADOS POR PRIMER APELLIDO
    Hernandez Cristobal Alan
*/

package act1;

%%

%public
%class LexerPalabrasReservadas
%unicode
%line
%column
%standalone

%%
/* PALABRAS RESERVADAS */
int        { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Tipo de dato int ");
                return TokensTL24B.INT; 
            }
long        { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Tipo de dato long ");                
                return TokensTL24B.LONG; 
            }
float      { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Tipo de dato float ");                
                return TokensTL24B.FLOAT; 
            }
double     { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Tipo de dato double ");                
                return TokensTL24B.DOUBLE; 
            }
char       { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Tipo de dato char ");
                return TokensTL24B.CHAR; 
            }
boolean    { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Tipo de dato boolean ");                
                return TokensTL24B.BOOLEAN; 
            }
byte       { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Tipo de dato byte ");                
                return TokensTL24B.BYTE; 
            }



/* SIMBOLOS */
"{"         { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Llave de apertura ");                
                return TokensTL24B.LLAVE_APERTURA; 
            }


[ \t\n\r]+  { /* Ignorar espacios en blanco */ }

.           { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> ERROR Token no reconocido");                 
            }

