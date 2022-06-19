lexer grammar LexerT;

//funciones matemáticas
FUNCION_RAIZ		: 'TORRE' ;
FUNCION_SENO		: 'MUNDO' ;
FUNCION_COSENO		: 'ESTRELLA' ;

//funciones de lectura e impresión
FUNCION_PRINT		: 'FUERZA' ;
FUNCION_READ		: 'TEMPLANZA' ;

//constantes
ESPACIO					: ' '; 
IGUAL					: '=' ;
PARENTESIS_ABIERTO		: '(' ;
PARENTESIS_CERRADO 		: ')' ;
LLAVE_ABIERTA			: '{' ;
LLAVE_CERRADA			: '}' ;
PUNTO_COMA				: ';' ;
COMILLA					: '\'' ;

//variables/constantes
TIPO_VARIABLE			: TIPO_VARIABLE_VAR|TIPO_VARIABLE_CONST;
TIPO_VARIABLE_VAR 		: 'VAR' ;
TIPO_VARIABLE_CONST 	: 'CONST' ;

//tipos de datos
TIPO_DATO   		: TIPO_DATO_INT|TIPO_DATO_REAL|TIPO_DATO_STRING;
TIPO_DATO_INT		: 'PAPA' ;
TIPO_DATO_REAL		: 'SACERDOTISA';
TIPO_DATO_STRING	: 'EMPERATRIZ' ;

//estructura condicional
CONDICIONAL_IF			: 'SOL' ;
CONDICIONAL_ELSE_IF		: 'LUNA_SOL' ;
CONDICIONAL_ELSE		: 'LUNA' ;

//estructura repetitiva
CICLO_FOR				: 'COLGADO' ;
CICLO_WHILE				: 'RUEDA_FORTUNA' ;

//operadores lógicos
OPERADOR_IGUAL			: '==' ;
OPERADOR_NO_IGUAL		: '!=' ;

//operadores matemáticos
OPERADOR_SUMA			: '+=' ;
OPERADOR_RESTA			: '-=' ;
OPERADOR_MULT			: '*=' ;
OPERADOR_DIV			: '/=' ;

//nombre variable
NOMBRE_VARIABLE	: ([a-z]|[A-Z]|'_')+ ;

//valor
VALOR_DATO				: VALOR_DATO_ENTERO|VALOR_DATO_REAL|VALOR_DATO_STRING;
VALOR_DATO_ENTERO		: ([0-9])+ ; //0,1...9 etc
VALOR_DATO_REAL			: [0-9]+ ('.' [0-9]+)? ; //0, 0.1, 0.2... etc
VALOR_DATO_TEXTO		: ([a-z]|[A-Z])+ ;
VALOR_DATO_STRING		: COMILLA (VALOR_DATO_TEXTO|ESPACIO)+ COMILLA ;