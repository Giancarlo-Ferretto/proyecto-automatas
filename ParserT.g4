grammar ParserT;
import LexerT;

programa	: linea+ EOF;

linea 		: declararVariable;

declararVariable	: TIPO_VARIABLE TIPO_DATO NOMBRE_VARIABLE ASIGNACION_VARIABLE;