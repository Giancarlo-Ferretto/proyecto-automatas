// Generated from LexerT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESPACIO=1, IGUAL=2, PARENTESIS_ABIERTO=3, PARENTESIS_CERRADO=4, LLAVE_ABIERTA=5, 
		LLAVE_CERRADA=6, PUNTO_COMA=7, TIPO_VARIABLE=8, TIPO_VARIABLE_VAR=9, TIPO_VARIABLE_CONST=10, 
		TIPO_DATO=11, TIPO_DATO_INT=12, TIPO_DATO_REAL=13, TIPO_DATO_STRING=14, 
		CONDICIONAL_IF=15, CONDICIONAL_ELSE_IF=16, CONDICIONAL_ELSE=17, CICLO_FOR=18, 
		CICLO_WHILE=19, OPERADOR_IGUAL=20, OPERADOR_NO_IGUAL=21, OPERADOR_SUMA=22, 
		OPERADOR_RESTA=23, OPERADOR_MULT=24, OPERADOR_DIV=25, FUNCION_MATEMATICA=26, 
		FUNCION_RAIZ=27, FUNCION_SENO=28, FUNCION_COSENO=29, FUNCION_PRINT=30, 
		FUNCION_READ=31, NOMBRE_VARIABLE=32, VALOR_DATO=33, VALOR_DATO_ENTERO=34, 
		VALOR_DATO_REAL=35, VALOR_DATO_TEXTO=36, VALOR_DATO_STRING=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ESPACIO", "IGUAL", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", "LLAVE_ABIERTA", 
		"LLAVE_CERRADA", "PUNTO_COMA", "TIPO_VARIABLE", "TIPO_VARIABLE_VAR", "TIPO_VARIABLE_CONST", 
		"TIPO_DATO", "TIPO_DATO_INT", "TIPO_DATO_REAL", "TIPO_DATO_STRING", "CONDICIONAL_IF", 
		"CONDICIONAL_ELSE_IF", "CONDICIONAL_ELSE", "CICLO_FOR", "CICLO_WHILE", 
		"OPERADOR_IGUAL", "OPERADOR_NO_IGUAL", "OPERADOR_SUMA", "OPERADOR_RESTA", 
		"OPERADOR_MULT", "OPERADOR_DIV", "FUNCION_MATEMATICA", "FUNCION_RAIZ", 
		"FUNCION_SENO", "FUNCION_COSENO", "FUNCION_PRINT", "FUNCION_READ", "NOMBRE_VARIABLE", 
		"VALOR_DATO", "VALOR_DATO_ENTERO", "VALOR_DATO_REAL", "VALOR_DATO_TEXTO", 
		"VALOR_DATO_STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'='", "'('", "')'", "'{'", "'}'", "';'", null, "'VAR'", 
		"'CONST'", null, "'PAPA'", "'SACERDOTISA'", "'EMPERATRIZ'", "'SOL'", "'LUNA_SOL'", 
		"'LUNA'", "'COLGADO'", "'RUEDA_FORTUNA'", "'=='", "'!='", "'+='", "'-='", 
		"'*='", "'/='", null, "'TORRE'", "'MUNDO'", "'ESTRELLA'", "'FUERZA'", 
		"'TEMPLANZA'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ESPACIO", "IGUAL", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", 
		"LLAVE_ABIERTA", "LLAVE_CERRADA", "PUNTO_COMA", "TIPO_VARIABLE", "TIPO_VARIABLE_VAR", 
		"TIPO_VARIABLE_CONST", "TIPO_DATO", "TIPO_DATO_INT", "TIPO_DATO_REAL", 
		"TIPO_DATO_STRING", "CONDICIONAL_IF", "CONDICIONAL_ELSE_IF", "CONDICIONAL_ELSE", 
		"CICLO_FOR", "CICLO_WHILE", "OPERADOR_IGUAL", "OPERADOR_NO_IGUAL", "OPERADOR_SUMA", 
		"OPERADOR_RESTA", "OPERADOR_MULT", "OPERADOR_DIV", "FUNCION_MATEMATICA", 
		"FUNCION_RAIZ", "FUNCION_SENO", "FUNCION_COSENO", "FUNCION_PRINT", "FUNCION_READ", 
		"NOMBRE_VARIABLE", "VALOR_DATO", "VALOR_DATO_ENTERO", "VALOR_DATO_REAL", 
		"VALOR_DATO_TEXTO", "VALOR_DATO_STRING"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\5\fm\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u00c8\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\6!\u00f1\n!\r!\16!\u00f2\3\"\3\"\3\""+
		"\5\"\u00f8\n\"\3#\6#\u00fb\n#\r#\16#\u00fc\3$\6$\u0100\n$\r$\16$\u0101"+
		"\3$\3$\6$\u0106\n$\r$\16$\u0107\5$\u010a\n$\3%\6%\u010d\n%\r%\16%\u010e"+
		"\3&\3&\3&\6&\u0114\n&\r&\16&\u0115\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2"+
		"\5\5\2C\\aac|\3\2\62;\4\2C\\c|\2\u0127\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2"+
		"\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2"+
		"\21]\3\2\2\2\23_\3\2\2\2\25c\3\2\2\2\27l\3\2\2\2\31n\3\2\2\2\33s\3\2\2"+
		"\2\35\177\3\2\2\2\37\u008a\3\2\2\2!\u008e\3\2\2\2#\u0097\3\2\2\2%\u009c"+
		"\3\2\2\2\'\u00a4\3\2\2\2)\u00b2\3\2\2\2+\u00b5\3\2\2\2-\u00b8\3\2\2\2"+
		"/\u00bb\3\2\2\2\61\u00be\3\2\2\2\63\u00c1\3\2\2\2\65\u00c7\3\2\2\2\67"+
		"\u00c9\3\2\2\29\u00cf\3\2\2\2;\u00d5\3\2\2\2=\u00de\3\2\2\2?\u00e5\3\2"+
		"\2\2A\u00f0\3\2\2\2C\u00f7\3\2\2\2E\u00fa\3\2\2\2G\u00ff\3\2\2\2I\u010c"+
		"\3\2\2\2K\u0110\3\2\2\2MN\7\"\2\2N\4\3\2\2\2OP\7?\2\2P\6\3\2\2\2QR\7*"+
		"\2\2R\b\3\2\2\2ST\7+\2\2T\n\3\2\2\2UV\7}\2\2V\f\3\2\2\2WX\7\177\2\2X\16"+
		"\3\2\2\2YZ\7=\2\2Z\20\3\2\2\2[^\5\23\n\2\\^\5\25\13\2][\3\2\2\2]\\\3\2"+
		"\2\2^\22\3\2\2\2_`\7X\2\2`a\7C\2\2ab\7T\2\2b\24\3\2\2\2cd\7E\2\2de\7Q"+
		"\2\2ef\7P\2\2fg\7U\2\2gh\7V\2\2h\26\3\2\2\2im\5\31\r\2jm\5\33\16\2km\5"+
		"\35\17\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\30\3\2\2\2no\7R\2\2op\7C\2\2p"+
		"q\7R\2\2qr\7C\2\2r\32\3\2\2\2st\7U\2\2tu\7C\2\2uv\7E\2\2vw\7G\2\2wx\7"+
		"T\2\2xy\7F\2\2yz\7Q\2\2z{\7V\2\2{|\7K\2\2|}\7U\2\2}~\7C\2\2~\34\3\2\2"+
		"\2\177\u0080\7G\2\2\u0080\u0081\7O\2\2\u0081\u0082\7R\2\2\u0082\u0083"+
		"\7G\2\2\u0083\u0084\7T\2\2\u0084\u0085\7C\2\2\u0085\u0086\7V\2\2\u0086"+
		"\u0087\7T\2\2\u0087\u0088\7K\2\2\u0088\u0089\7\\\2\2\u0089\36\3\2\2\2"+
		"\u008a\u008b\7U\2\2\u008b\u008c\7Q\2\2\u008c\u008d\7N\2\2\u008d \3\2\2"+
		"\2\u008e\u008f\7N\2\2\u008f\u0090\7W\2\2\u0090\u0091\7P\2\2\u0091\u0092"+
		"\7C\2\2\u0092\u0093\7a\2\2\u0093\u0094\7U\2\2\u0094\u0095\7Q\2\2\u0095"+
		"\u0096\7N\2\2\u0096\"\3\2\2\2\u0097\u0098\7N\2\2\u0098\u0099\7W\2\2\u0099"+
		"\u009a\7P\2\2\u009a\u009b\7C\2\2\u009b$\3\2\2\2\u009c\u009d\7E\2\2\u009d"+
		"\u009e\7Q\2\2\u009e\u009f\7N\2\2\u009f\u00a0\7I\2\2\u00a0\u00a1\7C\2\2"+
		"\u00a1\u00a2\7F\2\2\u00a2\u00a3\7Q\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7T\2"+
		"\2\u00a5\u00a6\7W\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7F\2\2\u00a8\u00a9"+
		"\7C\2\2\u00a9\u00aa\7a\2\2\u00aa\u00ab\7H\2\2\u00ab\u00ac\7Q\2\2\u00ac"+
		"\u00ad\7T\2\2\u00ad\u00ae\7V\2\2\u00ae\u00af\7W\2\2\u00af\u00b0\7P\2\2"+
		"\u00b0\u00b1\7C\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7?\2\2\u00b3\u00b4\7?\2"+
		"\2\u00b4*\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\7?\2\2\u00b7,\3\2\2\2"+
		"\u00b8\u00b9\7-\2\2\u00b9\u00ba\7?\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7/\2"+
		"\2\u00bc\u00bd\7?\2\2\u00bd\60\3\2\2\2\u00be\u00bf\7,\2\2\u00bf\u00c0"+
		"\7?\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2\u00c3\7?\2\2\u00c3"+
		"\64\3\2\2\2\u00c4\u00c8\5\67\34\2\u00c5\u00c8\59\35\2\u00c6\u00c8\5;\36"+
		"\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\66"+
		"\3\2\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb\7Q\2\2\u00cb\u00cc\7T\2\2\u00cc"+
		"\u00cd\7T\2\2\u00cd\u00ce\7G\2\2\u00ce8\3\2\2\2\u00cf\u00d0\7O\2\2\u00d0"+
		"\u00d1\7W\2\2\u00d1\u00d2\7P\2\2\u00d2\u00d3\7F\2\2\u00d3\u00d4\7Q\2\2"+
		"\u00d4:\3\2\2\2\u00d5\u00d6\7G\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8\7V\2"+
		"\2\u00d8\u00d9\7T\2\2\u00d9\u00da\7G\2\2\u00da\u00db\7N\2\2\u00db\u00dc"+
		"\7N\2\2\u00dc\u00dd\7C\2\2\u00dd<\3\2\2\2\u00de\u00df\7H\2\2\u00df\u00e0"+
		"\7W\2\2\u00e0\u00e1\7G\2\2\u00e1\u00e2\7T\2\2\u00e2\u00e3\7\\\2\2\u00e3"+
		"\u00e4\7C\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7V\2\2\u00e6\u00e7\7G\2\2\u00e7"+
		"\u00e8\7O\2\2\u00e8\u00e9\7R\2\2\u00e9\u00ea\7N\2\2\u00ea\u00eb\7C\2\2"+
		"\u00eb\u00ec\7P\2\2\u00ec\u00ed\7\\\2\2\u00ed\u00ee\7C\2\2\u00ee@\3\2"+
		"\2\2\u00ef\u00f1\t\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3B\3\2\2\2\u00f4\u00f8\5E#\2\u00f5"+
		"\u00f8\5G$\2\u00f6\u00f8\5K&\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8D\3\2\2\2\u00f9\u00fb\t\3\2\2\u00fa\u00f9\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"F\3\2\2\2\u00fe\u0100\t\3\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2"+
		"\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0109\3\2\2\2\u0103\u0105"+
		"\7\60\2\2\u0104\u0106\t\3\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0103"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010aH\3\2\2\2\u010b\u010d\t\4\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010fJ\3\2\2\2\u0110\u0113\7)\2\2\u0111\u0114\5C\"\2\u0112\u0114"+
		"\5\3\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7)"+
		"\2\2\u0118L\3\2\2\2\21\2]l\u00c7\u00f0\u00f2\u00f7\u00fc\u0101\u0107\u0109"+
		"\u010c\u010e\u0113\u0115\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}