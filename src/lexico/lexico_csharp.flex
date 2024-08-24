
/* Isaac Aaron Tovar Zavaleta - C# */

package lexico;

import java_cup.runtime.*;
/* Aquí el resto de importaciones */

%%

/* Archivo público, nombre del archivo generado */
%public
%class ScannerCS

/* Tipo de código */
%unicode
%cup

/* Reconocimiento de errores por linea y columna */
%line
%column

%{
  StringBuilder string = new StringBuilder();
  
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }
%}

%%

"abstract" { System.out.println("Es una palabra clave abstracta"); return symbol(sym.ABSTRACT, yytext()); }
"as"       { System.out.println("Es una palabra clave de conversión"); return symbol(sym.AS, yytext()); }
"bool"     { System.out.println("Es un tipo de dato booleano"); return symbol(sym.BOOL, yytext()); }
"break"    { System.out.println("Es una instrucción para salir de un bucle"); return symbol(sym.BREAK, yytext()); }
"case"     { System.out.println("Es una etiqueta en una instrucción switch"); return symbol(sym.CASE, yytext()); }
"catch"    { System.out.println("Es una cláusula para capturar excepciones"); return symbol(sym.CATCH, yytext()); }
"char"     { System.out.println("Es un tipo de dato carácter"); return symbol(sym.CHAR, yytext()); }
"class"    { System.out.println("Es una definición de una clase"); return symbol(sym.CLASS, yytext()); }
"const"    { System.out.println("Es una constante de valor fijo"); return symbol(sym.CONST, yytext()); }
"continue" { System.out.println("Es una instrucción para continuar con la siguiente iteración"); return symbol(sym.CONTINUE, yytext()); }
"decimal"  { System.out.println("Es un tipo de dato decimal"); return symbol(sym.DECIMAL, yytext()); }
"default"  { System.out.println("Es una etiqueta por defecto en una instrucción switch"); return symbol(sym.DEFAULT, yytext()); }
"delegate"  { System.out.println("Es un tipo de dato que representa un método"); return symbol(sym.DELEGATE, yytext()); }
"do"       { System.out.println("Es una instrucción de bucle do-while"); return symbol(sym.DO, yytext()); }
"double"   { System.out.println("Es un tipo de dato de punto flotante de doble precisión"); return symbol(sym.DOUBLE, yytext()); }
"dynamic"  { System.out.println("Es un tipo de dato dinámico"); return symbol(sym.DYNAMIC, yytext()); }
"else"     { System.out.println("Es una instrucción alternativa en una estructura if"); return symbol(sym.ELSE, yytext()); }
"enum"     { System.out.println("Es una definición de un tipo enumerado"); return symbol(sym.ENUM, yytext()); }
"event"    { System.out.println("Es un tipo de dato que representa un evento"); return symbol(sym.EVENT, yytext()); }
"explicit" { System.out.println("Es una conversión explícita de tipos"); return symbol(sym.EXPLICIT, yytext()); }
"extern"   { System.out.println("Es una declaración de método externo"); return symbol(sym.EXTERN, yytext()); }
"finally"  { System.out.println("Es una cláusula que se ejecuta después de una excepción"); return symbol(sym.FINALLY, yytext()); }
"fixed"    { System.out.println("Es una palabra clave para trabajar con memoria fija"); return symbol(sym.FIXED, yytext()); }
"float"    { System.out.println("Es un tipo de dato de punto flotante"); return symbol(sym.FLOAT, yytext()); }
"for"      { System.out.println("Es una instrucción de bucle for"); return symbol(sym.FOR, yytext()); }
"foreach"  { System.out.println("Es una instrucción de bucle foreach"); return symbol(sym.FOREACH, yytext()); }
"goto"     { System.out.println("Es una instrucción para saltar a una etiqueta"); return symbol(sym.GOTO, yytext()); }
"if"       { System.out.println("Es una estructura de control de flujo"); return symbol(sym.IF, yytext()); }
"implicit" { System.out.println("Es una conversión implícita de tipos"); return symbol(sym.IMPLICIT, yytext()); }
"in"       { System.out.println("Es una palabra clave utilizada en expresiones de consulta LINQ"); return symbol(sym.IN, yytext()); }
"int"      { System.out.println("Es un tipo de dato entero"); return symbol(sym.INT, yytext()); }
"internal" { System.out.println("Es un modificador de acceso interno"); return symbol(sym.INTERNAL, yytext()); }
"is"       { System.out.println("Es una palabra clave para verificar el tipo"); return symbol(sym.IS, yytext()); }
"lock"     { System.out.println("Es una palabra clave para sincronización de hilos"); return symbol(sym.LOCK, yytext()); }
"long"     { System.out.println("Es un tipo de dato entero de 64 bits"); return symbol(sym.LONG, yytext()); }
"new"      { System.out.println("Es una palabra clave para crear nuevas instancias"); return symbol(sym.NEW, yytext()); }
"null"     { System.out.println("Es un valor nulo"); return symbol(sym.NULL, yytext()); }
"object"   { System.out.println("Es el tipo base de todos los tipos"); return symbol(sym.OBJECT, yytext()); }
"operator" { System.out.println("Es una definición de operador"); return symbol(sym.OPERATOR, yytext()); }
"out"      { System.out.println("Es una palabra clave para redireccionar la salida"); return symbol(sym.OUT, yytext()); }
"override" { System.out.println("Es una palabra clave para sobrescribir métodos"); return symbol(sym.OVERRIDE, yytext()); }
"params"   { System.out.println("Es una palabra clave para parámetros variables"); return symbol(sym.PARAMS, yytext()); }
"private"  { System.out.println("Es un modificador de acceso privado"); return symbol(sym.PRIVATE, yytext()); }
"public"   { System.out.println("Es un modificador de acceso público"); return symbol(sym.PUBLIC, yytext()); }
"readonly" { System.out.println("Es un modificador que indica que el valor es de solo lectura"); return symbol(sym.READONLY, yytext()); }
"ref"      { System.out.println("Es una palabra clave para pasar parámetros por referencia"); return symbol(sym.REF, yytext()); }
"return"   { System.out.println("Es una declaración para devolver un valor"); return symbol(sym.RETURN, yytext()); }
"sbyte"    { System.out.println("Es un tipo de dato entero con signo de 8 bits"); return symbol(sym.SBYTE, yytext()); }
"sealed"   { System.out.println("Es un modificador que indica que una clase no puede ser heredada"); return symbol(sym.SEALED, yytext()); }
"short"    { System.out.println("Es un tipo de dato entero de 16 bits"); return symbol(sym.SHORT, yytext()); }
"sizeof"   { System.out.println("Es una operación que devuelve el tamaño de un tipo"); return symbol(sym.SIZEOF, yytext()); }
"static"   { System.out.println("Es un modificador que indica que el miembro pertenece a la clase"); return symbol(sym.STATIC, yytext()); }
"string"   { System.out.println("Es un tipo de dato cadena de caracteres"); return symbol(sym.STRING, yytext()); }
"struct"   { System.out.println("Es una definición de una estructura"); return symbol(sym.STRUCT, yytext()); }
"switch"   { System.out.println("Es una estructura de control de flujo de múltiples opciones"); return symbol(sym.SWITCH, yytext()); }
"this"     { System.out.println("Es una referencia a la instancia actual de la clase"); return symbol(sym.THIS, yytext()); }
"throw"    { System.out.println("Es una instrucción para lanzar una excepción"); return symbol(sym.THROW, yytext()); }
"try"      { System.out.println("Es una cláusula para intentar ejecutar código con manejo de excepciones"); return symbol(sym.TRY, yytext()); }
"typeof"   { System.out.println("Es una operación que devuelve el tipo de un objeto"); return symbol(sym.TYPEOF, yytext()); }
"uint"     { System.out.println("Es un tipo de dato entero sin signo de 32 bits"); return symbol(sym.UINT, yytext()); }
"ulong"    { System.out.println("Es un tipo de dato entero sin signo de 64 bits"); return symbol(sym.ULONG, yytext()); }
"ushort"   { System.out.println("Es un tipo de dato entero sin signo de 16 bits"); return symbol(sym.USHORT, yytext()); }
"using"    { System.out.println("Es una palabra clave para importar espacios de nombres"); return symbol(sym.USING, yytext()); }
"virtual"  { System.out.println("Es un modificador que permite que un método sea sobrescrito"); return symbol(sym.VIRTUAL, yytext()); }
"void"     { System.out.println("Es un tipo de dato vacío"); return symbol(sym.VOID, yytext()); }
"volatile" { System.out.println("Es un modificador que indica que el valor puede ser cambiado por otros hilos"); return symbol(sym.VOLATILE, yytext()); }
"while"    { System.out.println("Es un bucle de repetición"); return symbol(sym.WHILE, yytext()); }


/* Simbolos */
" "  { System.out.println("Espacio"); return symbol(sym.ESPACIO, yytext()); }
%%
// Símbolos de asignación
"="             { return symbol(sym.ASSIGN, yytext()); }
"+="            { return symbol(sym.PLUS_ASSIGN, yytext()); }
"-="            { return symbol(sym.MINUS_ASSIGN, yytext()); }
"*="            { return symbol(sym.MULT_ASSIGN, yytext()); }
"/="            { return symbol(sym.DIV_ASSIGN, yytext()); }

// Operadores aritméticos
"+"             { return symbol(sym.PLUS, yytext()); }
"-"             { return symbol(sym.MINUS, yytext()); }
"*"             { return symbol(sym.MULT, yytext()); }
"/"             { return symbol(sym.DIV, yytext()); }
"%"             { return symbol(sym.MOD, yytext()); }

// Operadores relacionales
"<"             { return symbol(sym.LT, yytext()); }
"<="            { return symbol(sym.LTE, yytext()); }
">"             { return symbol(sym.GT, yytext()); }
">="            { return symbol(sym.GTE, yytext()); }
"=="            { return symbol(sym.EQ, yytext()); }
"!="            { return symbol(sym.NEQ, yytext()); }

// Operadores lógicos
"&&"            { return symbol(sym.AND, yytext()); }
"||"            { return symbol(sym.OR, yytext()); }
"!"             { return symbol(sym.NOT, yytext()); }

// Símbolos de agrupación
"("             { return symbol(sym.LPAREN, yytext()); }
")"             { return symbol(sym.RPAREN, yytext()); }
"["             { return symbol(sym.LBRACKET, yytext()); }
"]"             { return symbol(sym.RBRACKET, yytext()); }
"{"             { return symbol(sym.LBRACE, yytext()); }
"}"             { return symbol(sym.RBRACE, yytext()); }

// Otros símbolos
","             { return symbol(sym.COMMA, yytext()); }
";"             { return symbol(sym.SEMICOLON, yytext()); }
":"             { return symbol(sym.COLON, yytext()); }
"."             { return symbol(sym.DOT, yytext()); }



/* Todo lo que no esta reconocido */

. { System.out.println("ERROR Esto no es un token del lenguaje"+yytext()); }
