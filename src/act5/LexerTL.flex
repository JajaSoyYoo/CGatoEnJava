
package act5;
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


// Palabras reservadas //

"package"         {description(yytext(),"Declaracion de paquete"); return symbol(sym.PACKAGE, yytext());}
"using"           {description(yytext(),"Declaracion de uso"); return symbol(sym.USING, yytext());}
"namespace"       {description(yytext(),"Declaracion de espacio de nombres"); return symbol(sym.NAMESPACE, yytext());}
"class"           {description(yytext(),"Declaracion de clase"); return symbol(sym.CLASS, yytext());}
"public"          {description(yytext(),"Acceso publico"); return symbol(sym.PUBLIC, yytext());}
"private"         {description(yytext(),"Acceso privado"); return symbol(sym.PRIVATE, yytext());}
"protected"       {description(yytext(),"Acceso protegido"); return symbol(sym.PROTECTED, yytext());}
"internal"        {description(yytext(),"Acceso interno"); return symbol(sym.INTERNAL, yytext());}
"void"            {description(yytext(),"Tipo de retorno vacio"); return symbol(sym.VOID, yytext());}
"int"             {description(yytext(),"Tipo entero"); return symbol(sym.INT, yytext());}
"string"          {description(yytext(),"Tipo cadena"); return symbol(sym.STRING, yytext());}
"bool"            {description(yytext(),"Tipo booleano"); return symbol(sym.BOOL, yytext());}
"if"              {description(yytext(),"Declaracion condicional"); return symbol(sym.IF, yytext());}
"else"            {description(yytext(),"Alternativa condicional"); return symbol(sym.ELSE, yytext());}
"for"             {description(yytext(),"Bucle for"); return symbol(sym.FOR, yytext());}
"while"           {description(yytext(),"Bucle while"); return symbol(sym.WHILE, yytext());}
"return"          {description(yytext(),"Declaracion de retorno"); return symbol(sym.RETURN, yytext());}
"static"          {description(yytext(),"Miembro estatico"); return symbol(sym.STATIC, yytext());}
"void"            {description(yytext(),"Tipo de retorno vacio"); return symbol(sym.VOID, yytext());}
"new"             {description(yytext(),"Instanciacion de objeto"); return symbol(sym.NEW, yytext());}
"float"           {description(yytext(),"Tipo flotante"); return symbol(sym.FLOAT, yytext());}
"char"            {description(yytext(),"Tipo caracter"); return symbol(sym.CHAR, yytext());}
"true"            {description(yytext(),"Verdadero"); return symbol(sym.TRUE, yytext());}
"false"           {description(yytext(),"Falso"); return symbol(sym.FALSE, yytext());}
"const"           {description(yytext(),"Constante"); return symbol(sym.CONST, yytext());}
"switch"          {description(yytext(),"Switch"); return symbol(sym.SWITCH, yytext());}
"case"            {description(yytext(),"Case"); return symbol(sym.CASE, yytext());}
"default"         {description(yytext(),"Default"); return symbol(sym.DEFAULT, yytext());}
"break"           {description(yytext(),"Break"); return symbol(sym.BREAK, yytext());}
"main"            {description(yytext(),"Main"); return symbol(sym.MAIN, yytext());}

//Simbolos//

";"             {description(yytext(),"Punto y coma"); return symbol(sym.PUNTO_COMA, yytext());}
"."             {description(yytext(),"Punto"); return symbol(sym.PUNTO, yytext());}
","             {description(yytext(),"Coma"); return symbol(sym.COMA, yytext());}
"("             {description(yytext(),"Parentesis izquierdo"); return symbol(sym.PARENTESIS_IZQUIERDO, yytext());}
")"             {description(yytext(),"Parentesis derecho"); return symbol(sym.PARENTESIS_DERECHO, yytext());}
"{"             {description(yytext(),"Llave izquierda"); return symbol(sym.LLAVE_IZQUIERDA, yytext());}
"}"             {description(yytext(),"Llave derecha"); return symbol(sym.LLAVE_DERECHA, yytext());}
"["             {description(yytext(),"Corchete izquierdo"); return symbol(sym.CORCHETE_IZQUIERDO, yytext());}
"]"             {description(yytext(),"Corchete derecho"); return symbol(sym.CORCHETE_DERECHO, yytext());}
"+"             {description(yytext(),"Suma"); return symbol(sym.SUMA, yytext());}
"-"             {description(yytext(),"Resta"); return symbol(sym.RESTA, yytext());}
"*"             {description(yytext(),"Multiplicacion"); return symbol(sym.MULTIPLICACION, yytext());}
"/"             {description(yytext(),"Division"); return symbol(sym.DIVISION, yytext());}
"="             {description(yytext(),"Asignacion"); return symbol(sym.ASIGNACION, yytext());}
"=="            {description(yytext(),"Igualdad"); return symbol(sym.IGUALDAD, yytext());}
"!="            {description(yytext(),"Desigualdad"); return symbol(sym.DESIGUALDAD, yytext());}
"<"             {description(yytext(),"Menor que"); return symbol(sym.MENOR_QUE, yytext());}
">"             {description(yytext(),"Mayor que"); return symbol(sym.MAYOR_QUE, yytext());}
"<="            {description(yytext(),"Menor o igual que"); return symbol(sym.MENOR_O_IGUAL_QUE, yytext());}
">="            {description(yytext(),"Mayor o igual que"); return symbol(sym.MAYOR_O_IGUAL_QUE, yytext());}
"&&"            {description(yytext(),"Y logico"); return symbol(sym.Y_LOGICO, yytext());}
"||"            {description(yytext(),"O logico"); return symbol(sym.O_LOGICO, yytext());}
"!"             {description(yytext(),"Negacion"); return symbol(sym.NEGACION, yytext());}
"++"            {description(yytext(),"Incremento"); return symbol(sym.INCREMENTO, yytext());}
"--"            {description(yytext(),"Decremento"); return symbol(sym.DECREMENTO, yytext());}
":"             {description(yytext(),"Dos puntos"); return symbol(sym.DOS_PUNTOS, yytext());}



//Impresiones
"Console.WriteLine"      {description(yytext(),"Imrpimir con salto"); return symbol(sym.CWLINE, yytext());}
"Console.Write"          {description(yytext(),"Imrpimir sin salto"); return symbol(sym.CWRITE, yytext());}
"Console.ReadLine"     {description(yytext(),"Leer consola"); return symbol(sym.CRLINE, yytext());}


//Expresiones regulares//

[A-Z_][A-Z0-9_]+            {description(yytext(),"IDConstante"); return symbol(sym.CONSTANTE, yytext());}
[_A-Za-z]{1}[a-zA-Z0-9]*    {description(yytext(),"Identificador"); return symbol(sym.IDENTIFICADOR, yytext());}
[0-9]{1,10}+\.[0-9]{1,2}+   {description(yytext(),"Numero decimal"); return symbol(sym.NDECIMAL, yytext());}
[0-9]+                      {description(yytext(),"Numero entero"); return symbol(sym.NENTERO, yytext());}
\"([^\"\\\n]|\\.)*\"        {description(yytext(),"Cadena"); return symbol(sym.CADENA, yytext());}
'(.)'                       {description(yytext(),"Caracter"); return symbol(sym.CARACTER, yytext());}

//. { System.out.println("ERROR Esto no es un token del lenguaje "+yytext()); }


