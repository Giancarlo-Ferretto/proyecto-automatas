lexer grammar LexerT;

//constantes
ESPACIO					: ' '; 
IGUAL					: '=' ;
PARENTESIS_ABIERTO		: '(' ;
PARENTESIS_CERRADO		: ')' ;
LLAVE_ABIERTA			: '{' ;
LLAVE_CERRADA			: '}' ;
PUNTO_COMA				: ';' ;

//variables/constantes
TIPO_VARIABLE			: TIPO_VARIABLE_VAR|TIPO_VARIABLE_CONST;
TIPO_VARIABLE_VAR 		: 'var' ;
TIPO_VARIABLE_CONST 	: 'const' ;

//nombre variable
NOMBRE_VARIABLE	: (VALOR_DATO_TEXTO|'_')+ ;

//tipos de datos
TIPO_DATO   		: TIPO_DATO_INT|TIPO_DATO_REAL|TIPO_DATO_STRING;
TIPO_DATO_INT		: 'int' ;
TIPO_DATO_REAL		: 'real' ;
TIPO_DATO_STRING	: 'string' ;

//valor
VALOR_DATO				: VALOR_DATO_ENTERO|VALOR_DATO_REAL|VALOR_DATO_STRING;
VALOR_DATO_ENTERO		: ([0-9])+ ; //0,1...9 etc
VALOR_DATO_REAL			: [0-9]+ ('.' [0-9]+)? ; //0, 0.1, 0.2... etc
VALOR_DATO_TEXTO		: ([a-z]|[A-Z])+ ;
VALOR_DATO_STRING		: '\''(VALOR_DATO|ESPACIO)+'\'' ;

//asignar valor a variable
ASIGNACION_VARIABLE		: IGUAL VALOR_DATO;

//estructura condicional
CONDICIONAL_IF			: 'if' ;
CONDICIONAL_ELSE_IF		: 'else if' ;
CONDICIONAL_ELSE		: 'else' ;

//estructura repetitiva
CICLO_FOR				: 'for' ;
CICLO_WHILE				: 'while' ;

//operadores lógicos
OPERADOR_IGUAL			: '==' ;
OPERADOR_NO_IGUAL		: '!=' ;

//operadores matemáticos
OPERADOR_SUMA			: '+=' ;
OPERADOR_RESTA			: '-=' ;
OPERADOR_MULT			: '*=' ;
OPERADOR_DIV			: '/=' ;

//funciones matemáticas
FUNCION_MATEMATICA 	: FUNCION_RAIZ|FUNCION_SENO|FUNCION_COSENO;
FUNCION_RAIZ		: 'sqrt' ;
FUNCION_SENO		: 'sin' ;
FUNCION_COSENO		: 'cos' ;

//funciones de lectura e impresión
FUNCION_PRINT		: 'print' ;
FUNCION_READ		: 'read' ;