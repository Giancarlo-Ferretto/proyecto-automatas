grammar ParserT;
import LexerT;

WS : [ \t\n\r] -> skip;

programa	: linea+;

linea 		: declararVariable|funcionLeerImprimir|bloqueCondicional|bloqueRepetitivo|operadorMatematico|funcionMatematica;

//declarar variables
declararVariable	: TIPO_VARIABLE TIPO_DATO NOMBRE_VARIABLE IGUAL VALOR_DATO PUNTO_COMA;

//expresión (variable o dato)
expresion			: NOMBRE_VARIABLE|VALOR_DATO;
expresionNumerica   : NOMBRE_VARIABLE|TIPO_DATO_INT|TIPO_DATO_REAL|VALOR_DATO_ENTERO|VALOR_DATO_REAL;

//funciones leer/imprimir
funcionLeerImprimir : imprimirVariable|leerVariable;
imprimirVariable 	: FUNCION_PRINT PARENTESIS_ABIERTO expresion PARENTESIS_CERRADO PUNTO_COMA;
leerVariable		: FUNCION_READ PARENTESIS_ABIERTO PARENTESIS_CERRADO PUNTO_COMA;

//funciones matemáticas
funcionMatematica	: funcionRaiz|funcionSeno|funcionCoseno;
funcionRaiz 		: FUNCION_RAIZ PARENTESIS_ABIERTO expresion PARENTESIS_CERRADO PUNTO_COMA;
funcionSeno 		: FUNCION_SENO PARENTESIS_ABIERTO expresion PARENTESIS_CERRADO PUNTO_COMA;
funcionCoseno 		: FUNCION_COSENO PARENTESIS_ABIERTO expresion PARENTESIS_CERRADO PUNTO_COMA;

//operador matemático
operadorMatematico 		: operadorSuma|operadorResta|operadorMultiplicacion|operadorDivision;
operadorSuma				: expresionNumerica OPERADOR_SUMA expresionNumerica PUNTO_COMA;
operadorResta				: expresionNumerica OPERADOR_RESTA expresionNumerica PUNTO_COMA;
operadorMultiplicacion		: expresionNumerica OPERADOR_MULT expresionNumerica PUNTO_COMA;
operadorDivision			: expresionNumerica OPERADOR_DIV expresionNumerica PUNTO_COMA;

//operador booleano
operadorBooleano	 	: operadorIgual|operadorNoIgual;
operadorIgual			: expresion OPERADOR_IGUAL expresion;
operadorNoIgual			: expresion OPERADOR_NO_IGUAL expresion;

expresionCondicional 	: PARENTESIS_ABIERTO operadorBooleano PARENTESIS_CERRADO;

//bloque condicional
bloqueCondicional 	: condicionalIf|condicionalElseIf|condicionalElse; 
condicionalIf 		: CONDICIONAL_IF expresionCondicional LLAVE_ABIERTA programa LLAVE_CERRADA;
condicionalElseIf	: condicionalIf CONDICIONAL_ELSE_IF expresionCondicional LLAVE_ABIERTA programa LLAVE_CERRADA;
condicionalElse		: condicionalIf CONDICIONAL_ELSE LLAVE_ABIERTA programa LLAVE_CERRADA;

//bloque repetitivo
bloqueRepetitivo	: cicloFor|cicloWhile;

cicloFor			: CICLO_FOR 
						PARENTESIS_ABIERTO 
							NOMBRE_VARIABLE PUNTO_COMA
							operadorBooleano PUNTO_COMA
							operadorMatematico PUNTO_COMA
						PARENTESIS_CERRADO
						LLAVE_ABIERTA
							programa
						LLAVE_CERRADA;
						
cicloWhile			: CICLO_WHILE
						PARENTESIS_ABIERTO
							operadorBooleano
						PARENTESIS_CERRADO
						LLAVE_ABIERTA
							programa
						LLAVE_CERRADA;