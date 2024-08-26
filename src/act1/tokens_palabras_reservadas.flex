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
bool    { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Tipo de dato boolean ");                
                return TokensTL24B.BOOL; 
            }
byte       { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Tipo de dato byte ");                
                return TokensTL24B.BYTE; 
            }
do          { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra para iteracion do");                
                return TokensTL24B.DO; 
            }
while       { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra para iteracion while");                
                return TokensTL24B.WHILE; 
            }
for         { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra para iteracion for");                
                return TokensTL24B.FOR; 
            }
foreach     { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra para iteracion foreach");                
                return TokensTL24B.FOR; 
            }
if          { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra de control de flujo if");                
                return TokensTL24B.IF; 
            }
else        { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra de control de flujo else");                
                return TokensTL24B.ELSE; 
            }
switch      { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra de control de flujo switch");                
                return TokensTL24B.SWITCH; 
            }
class       { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra para definir clases");                
                return TokensTL24B.CLASS; 
            }
public      { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra de visibilidad public");                
                return TokensTL24B.PUBLIC; 
            }
private     { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra de visibilidad private");                
                return TokensTL24B.PRIVATE; 
            }
protected   { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra de visibilidad protected");                
                return TokensTL24B.PROTECTED; 
            }
return      { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra devolver valores return");                
                return TokensTL24B.RETURN; 
            }
static      { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra de comportamineto static");                
                return TokensTL24B.STATIC; 
            }
virtual     { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra de comportamiento virtual");                
                return TokensTL24B.VIRTUAL; 
            }
override    { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra de comportamiento override");                
                return TokensTL24B.OVERRIDE; 
            }
try         { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra para una excepcion try");                
                return TokensTL24B.TRY; 
            }
chatch      { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra para manejar excepcion catch");                
                return TokensTL24B.CATCH; 
            }
true        { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Valor booleano verdadero");                
                return TokensTL24B.TRUE; 
            }
false       { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Valor booleano falso");                
                return TokensTL24B.FALSE; 
            }
default     { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Palabra para iteracion for");                
                return TokensTL24B.FOR; 
            }
string      { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" ->  Tipo de dato cadena");                
                return TokensTL24B.STRING; 
            }

/* SIMBOLOS */
"{"         { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Llave de apertura ");                
                return TokensTL24B.LLAVE_APERTURA; 
            }
"}"         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Llave de cierre ");
                return TokensTL24B.LLAVE_CIERRE;
            }

"("         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Parentesis de apertura ");
                return TokensTL24B.PARENTESIS_APERTURA;
            }

")"         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Parentesis de cierre ");
                return TokensTL24B.PARENTESIS_CIERRE;
            }

"["         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Corchete de apertura ");
                return TokensTL24B.CORCHETE_APERTURA;
            }

"]"         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Corchete de cierre ");
                return TokensTL24B.CORCHETE_CIERRE;
            }

";"         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Punto y coma ");
                 return TokensTL24B.PUNTO_COMA;
            }

","         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Coma ");
                return TokensTL24B.COMA;
            }

"+"         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo mas ");
                return TokensTL24B.SIGNO_MAS;
            }
"=="        {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo igual igual ");
                return TokensTL24B.SIGNO_IGUAL_IGUAL;
            }

"!="        {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo diferente ");
                return TokensTL24B.SIGNO_DIFERENTE;
            }

">"         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo mayor que ");
                return TokensTL24B.SIGNO_MAYOR_QUE;
            }

">="        {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo mayor o igual que ");
                return TokensTL24B.SIGNO_MAYOR_IGUAL_QUE;
            }

"<"         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo menor que ");
                return TokensTL24B.SIGNO_MENOR_QUE;
            }

"<="        {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo menor o igual que ");
                return TokensTL24B.SIGNO_MENOR_IGUAL_QUE;
            }

"++"        {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo incremento ");
                return TokensTL24B.SIGNO_INCREMENTO;
            }

"--"        {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo decremento ");
                return TokensTL24B.SIGNO_DECREMENTO;
            }

"="         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo asignacion ");
                return TokensTL24B.SIGNO_ASIGNACION;
            }

"*"         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo multiplicacion ");
                return TokensTL24B.SIGNO_MULTIPLICACION;
            }

"/"         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo division ");
                return TokensTL24B.SIGNO_DIVISION;
            }

"%"         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Signo modulo ");
                return TokensTL24B.SIGNO_MODULO;
            }

"."         {
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> Punto ");
                return TokensTL24B.PUNTO;
            }





[ \t\n\r]+  { /* Ignorar espacios en blanco */ }

.           { 
                System.out.print("Linea:"+(yyline+1)+", Columna:"+(yycolumn+1)+"\t");
                System.out.println(yytext()+" -> ERROR Token no reconocido");                 
            }

