/*
    NOMBRES COMPLETOS ORDENADOS POR PRIMER APELLIDO
    Hernandez Cristobal Alan
*/

package demo_cup;

import java_cup.runtime.Symbol;
%%

%public
%class LexerCSharp
%unicode
%line
%column
%standalone
%cup

%{
	private Symbol symbol(int type, String value)
	{
		return new Symbol(type, yyline+1, yycolumn+1,value);
	}
    private void mostrar(String token)
    {
        System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1));
    }
%}

%%

/* PALABRAS RESERVADAS */
int        { 
                mostrar(yytext());
                System.out.println(yytext()+" -> Tipo de dato int ");
                return symbol(sym.INT,yytext()); 
            }
long        { 
                mostrar(yytext());
                System.out.println(yytext()+" -> Tipo de dato long ");                
                return symbol(sym.LONG,yytext()); 
            }
float      { 
                mostrar(yytext());
                System.out.println(yytext()+" -> Tipo de dato float ");                
                return symbol(sym.FLOAT,yytext()); 
            }
double     { 
                mostrar(yytext());
                System.out.println(yytext()+" -> Tipo de dato double ");                
                return symbol(sym.DOUBLE,yytext()); 
            }
char       { 
                mostrar(yytext());
                System.out.println(yytext()+" -> Tipo de dato char ");
                return symbol(sym.CHAR,yytext()); 
            }
bool        { 
                mostrar(yytext());
                System.out.println(yytext()+" -> Tipo de dato boolean ");                
                return symbol(sym.BOOLEAN,yytext());
            }
byte        { 
                mostrar(yytext());
                System.out.println(yytext()+" -> Tipo de dato byte ");                
                return symbol(sym.BYTE,yytext());
            }

/* SIMBOLOS */

";"         {
                mostrar(yytext());
                System.out.println(yytext()+" -> Punto y coma ");
                return symbol(sym.PUNTO_COMA,yytext());
            }

","         {
                mostrar(yytext());
                System.out.println(yytext()+" -> Coma ");
                return symbol(sym.COMA,yytext());
            }

"="         {
                mostrar(yytext());
                System.out.println(yytext()+" -> Signo asignacion ");
                return symbol(sym.ASIGNACION,yytext());
            }

[ \t\n\r]+  { /* Ignorar espacios en blanco */ }


/* EXPRESIONES */

[_a-zA-Z]{1}[0-9a-zA-Z]{0,31}   {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> Identificador ");
                                    return symbol(sym.ID,yytext());
                                }

[0-9]{1,10}                     {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> Numero entero");
                                    return symbol(sym.ENTERO,yytext());
                                }



/* REGLAS PARA MANEJO DE ERRORES */

/* Cadena no cerrada */
\"([^\"\\\n]|\\.)*              {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> ERROR: Cadena no cerrada");
                                }


/* Caracter mal formado (más de un carácter o no cerrado) */
'([^'\n]|\\.)*'                  {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> ERROR: Caracter no cerrado o mal formado");
                                }

/* Caracter no cerrado con salto de línea */
'([^'\n]|\\.)*\n                {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> ERROR: Caracter no cerrado o mal formado");
                                }

/* Decimal mal formado: sin dígitos antes del punto */
\.[0-9]+                        {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> ERROR: Decimal mal formado (sin digitos antes del punto)");
                                }

/* Decimal mal formado: sin dígitos después del punto */
[0-9]+\.[^0-9]                  {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> ERROR: Decimal mal formado (sin digitos despues del punto)");
                                }

/* Decimal mal formado: más de un punto */
[0-9]*\.[0-9]*\.[0-9.]*         {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> ERROR: Decimal mal formado (mas de un punto en el numero)");
                                }

/* Regla para comentarios de bloque no cerrados */
    \/\*([^*]|\*+[^/])*\*?      {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> ERROR: Comentario de bloque no cerrado ");
                                }


/* Detección de un solo '/' como error */
\/[^\/\n]*                      {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> ERROR: Comentario no bien formado ");
                                }

/* Detección de un solo '*' como error */
\*[^\/\n]*                      {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> ERROR: Comentario no bien formado ");
                                }

/* Números enteros mal formados */
[0-9]+[^0-9\s]+                 {
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> ERROR: Numero entero mal formado");
                                }

.                               { 
                                    mostrar(yytext());
                                    System.out.println(yytext()+" -> ERROR Token no reconocido");
                                }