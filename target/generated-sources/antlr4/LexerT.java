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
		FUNCION_RAIZ=1, FUNCION_SENO=2, FUNCION_COSENO=3, FUNCION_PRINT=4, FUNCION_READ=5, 
		ESPACIO=6, IGUAL=7, PARENTESIS_ABIERTO=8, PARENTESIS_CERRADO=9, LLAVE_ABIERTA=10, 
		LLAVE_CERRADA=11, PUNTO_COMA=12, TIPO_VARIABLE=13, TIPO_VARIABLE_VAR=14, 
		TIPO_VARIABLE_CONST=15, TIPO_DATO=16, TIPO_DATO_INT=17, TIPO_DATO_REAL=18, 
		TIPO_DATO_STRING=19, CONDICIONAL_IF=20, CONDICIONAL_ELSE_IF=21, CONDICIONAL_ELSE=22, 
		CICLO_FOR=23, CICLO_WHILE=24, OPERADOR_IGUAL=25, OPERADOR_NO_IGUAL=26, 
		OPERADOR_SUMA=27, OPERADOR_RESTA=28, OPERADOR_MULT=29, OPERADOR_DIV=30, 
		NOMBRE_VARIABLE=31, VALOR_DATO=32, VALOR_DATO_ENTERO=33, VALOR_DATO_REAL=34, 
		VALOR_DATO_TEXTO=35, VALOR_DATO_STRING=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FUNCION_RAIZ", "FUNCION_SENO", "FUNCION_COSENO", "FUNCION_PRINT", "FUNCION_READ", 
		"ESPACIO", "IGUAL", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", "LLAVE_ABIERTA", 
		"LLAVE_CERRADA", "PUNTO_COMA", "TIPO_VARIABLE", "TIPO_VARIABLE_VAR", "TIPO_VARIABLE_CONST", 
		"TIPO_DATO", "TIPO_DATO_INT", "TIPO_DATO_REAL", "TIPO_DATO_STRING", "CONDICIONAL_IF", 
		"CONDICIONAL_ELSE_IF", "CONDICIONAL_ELSE", "CICLO_FOR", "CICLO_WHILE", 
		"OPERADOR_IGUAL", "OPERADOR_NO_IGUAL", "OPERADOR_SUMA", "OPERADOR_RESTA", 
		"OPERADOR_MULT", "OPERADOR_DIV", "NOMBRE_VARIABLE", "VALOR_DATO", "VALOR_DATO_ENTERO", 
		"VALOR_DATO_REAL", "VALOR_DATO_TEXTO", "VALOR_DATO_STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'TORRE'", "'MUNDO'", "'ESTRELLA'", "'FUERZA'", "'TEMPLANZA'", "' '", 
		"'='", "'('", "')'", "'{'", "'}'", "';'", null, "'VAR'", "'CONST'", null, 
		"'PAPA'", "'SACERDOTISA'", "'EMPERATRIZ'", "'SOL'", "'LUNA_SOL'", "'LUNA'", 
		"'COLGADO'", "'RUEDA_FORTUNA'", "'=='", "'!='", "'+='", "'-='", "'*='", 
		"'/='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCION_RAIZ", "FUNCION_SENO", "FUNCION_COSENO", "FUNCION_PRINT", 
		"FUNCION_READ", "ESPACIO", "IGUAL", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", 
		"LLAVE_ABIERTA", "LLAVE_CERRADA", "PUNTO_COMA", "TIPO_VARIABLE", "TIPO_VARIABLE_VAR", 
		"TIPO_VARIABLE_CONST", "TIPO_DATO", "TIPO_DATO_INT", "TIPO_DATO_REAL", 
		"TIPO_DATO_STRING", "CONDICIONAL_IF", "CONDICIONAL_ELSE_IF", "CONDICIONAL_ELSE", 
		"CICLO_FOR", "CICLO_WHILE", "OPERADOR_IGUAL", "OPERADOR_NO_IGUAL", "OPERADOR_SUMA", 
		"OPERADOR_RESTA", "OPERADOR_MULT", "OPERADOR_DIV", "NOMBRE_VARIABLE", 
		"VALOR_DATO", "VALOR_DATO_ENTERO", "VALOR_DATO_REAL", "VALOR_DATO_TEXTO", 
		"VALOR_DATO_STRING"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0112\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u0082\n\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u0091\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \6 \u00ea\n \r \16 \u00eb\3!\3!\3!\5!\u00f1\n!\3\"\6\"\u00f4\n"+
		"\"\r\"\16\"\u00f5\3#\6#\u00f9\n#\r#\16#\u00fa\3#\3#\6#\u00ff\n#\r#\16"+
		"#\u0100\5#\u0103\n#\3$\6$\u0106\n$\r$\16$\u0107\3%\3%\3%\6%\u010d\n%\r"+
		"%\16%\u010e\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\5\5\2C\\aac|\3\2\62;\4\2C\\c|"+
		"\2\u011e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5Q\3\2\2\2\7W\3\2\2\2\t`\3\2\2\2\13"+
		"g\3\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27"+
		"{\3\2\2\2\31}\3\2\2\2\33\u0081\3\2\2\2\35\u0083\3\2\2\2\37\u0087\3\2\2"+
		"\2!\u0090\3\2\2\2#\u0092\3\2\2\2%\u0097\3\2\2\2\'\u00a3\3\2\2\2)\u00ae"+
		"\3\2\2\2+\u00b2\3\2\2\2-\u00bb\3\2\2\2/\u00c0\3\2\2\2\61\u00c8\3\2\2\2"+
		"\63\u00d6\3\2\2\2\65\u00d9\3\2\2\2\67\u00dc\3\2\2\29\u00df\3\2\2\2;\u00e2"+
		"\3\2\2\2=\u00e5\3\2\2\2?\u00e9\3\2\2\2A\u00f0\3\2\2\2C\u00f3\3\2\2\2E"+
		"\u00f8\3\2\2\2G\u0105\3\2\2\2I\u0109\3\2\2\2KL\7V\2\2LM\7Q\2\2MN\7T\2"+
		"\2NO\7T\2\2OP\7G\2\2P\4\3\2\2\2QR\7O\2\2RS\7W\2\2ST\7P\2\2TU\7F\2\2UV"+
		"\7Q\2\2V\6\3\2\2\2WX\7G\2\2XY\7U\2\2YZ\7V\2\2Z[\7T\2\2[\\\7G\2\2\\]\7"+
		"N\2\2]^\7N\2\2^_\7C\2\2_\b\3\2\2\2`a\7H\2\2ab\7W\2\2bc\7G\2\2cd\7T\2\2"+
		"de\7\\\2\2ef\7C\2\2f\n\3\2\2\2gh\7V\2\2hi\7G\2\2ij\7O\2\2jk\7R\2\2kl\7"+
		"N\2\2lm\7C\2\2mn\7P\2\2no\7\\\2\2op\7C\2\2p\f\3\2\2\2qr\7\"\2\2r\16\3"+
		"\2\2\2st\7?\2\2t\20\3\2\2\2uv\7*\2\2v\22\3\2\2\2wx\7+\2\2x\24\3\2\2\2"+
		"yz\7}\2\2z\26\3\2\2\2{|\7\177\2\2|\30\3\2\2\2}~\7=\2\2~\32\3\2\2\2\177"+
		"\u0082\5\35\17\2\u0080\u0082\5\37\20\2\u0081\177\3\2\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\34\3\2\2\2\u0083\u0084\7X\2\2\u0084\u0085\7C\2\2\u0085\u0086"+
		"\7T\2\2\u0086\36\3\2\2\2\u0087\u0088\7E\2\2\u0088\u0089\7Q\2\2\u0089\u008a"+
		"\7P\2\2\u008a\u008b\7U\2\2\u008b\u008c\7V\2\2\u008c \3\2\2\2\u008d\u0091"+
		"\5#\22\2\u008e\u0091\5%\23\2\u008f\u0091\5\'\24\2\u0090\u008d\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\"\3\2\2\2\u0092\u0093\7"+
		"R\2\2\u0093\u0094\7C\2\2\u0094\u0095\7R\2\2\u0095\u0096\7C\2\2\u0096$"+
		"\3\2\2\2\u0097\u0098\7U\2\2\u0098\u0099\7C\2\2\u0099\u009a\7E\2\2\u009a"+
		"\u009b\7G\2\2\u009b\u009c\7T\2\2\u009c\u009d\7F\2\2\u009d\u009e\7Q\2\2"+
		"\u009e\u009f\7V\2\2\u009f\u00a0\7K\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2"+
		"\7C\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7G\2\2\u00a4\u00a5\7O\2\2\u00a5\u00a6"+
		"\7R\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7T\2\2\u00a8\u00a9\7C\2\2\u00a9"+
		"\u00aa\7V\2\2\u00aa\u00ab\7T\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7\\\2"+
		"\2\u00ad(\3\2\2\2\u00ae\u00af\7U\2\2\u00af\u00b0\7Q\2\2\u00b0\u00b1\7"+
		"N\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7N\2\2\u00b3\u00b4\7W\2\2\u00b4\u00b5"+
		"\7P\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7a\2\2\u00b7\u00b8\7U\2\2\u00b8"+
		"\u00b9\7Q\2\2\u00b9\u00ba\7N\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7N\2\2\u00bc"+
		"\u00bd\7W\2\2\u00bd\u00be\7P\2\2\u00be\u00bf\7C\2\2\u00bf.\3\2\2\2\u00c0"+
		"\u00c1\7E\2\2\u00c1\u00c2\7Q\2\2\u00c2\u00c3\7N\2\2\u00c3\u00c4\7I\2\2"+
		"\u00c4\u00c5\7C\2\2\u00c5\u00c6\7F\2\2\u00c6\u00c7\7Q\2\2\u00c7\60\3\2"+
		"\2\2\u00c8\u00c9\7T\2\2\u00c9\u00ca\7W\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cc"+
		"\7F\2\2\u00cc\u00cd\7C\2\2\u00cd\u00ce\7a\2\2\u00ce\u00cf\7H\2\2\u00cf"+
		"\u00d0\7Q\2\2\u00d0\u00d1\7T\2\2\u00d1\u00d2\7V\2\2\u00d2\u00d3\7W\2\2"+
		"\u00d3\u00d4\7P\2\2\u00d4\u00d5\7C\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7"+
		"?\2\2\u00d7\u00d8\7?\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7#\2\2\u00da\u00db"+
		"\7?\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd\u00de\7?\2\2\u00de8"+
		"\3\2\2\2\u00df\u00e0\7/\2\2\u00e0\u00e1\7?\2\2\u00e1:\3\2\2\2\u00e2\u00e3"+
		"\7,\2\2\u00e3\u00e4\7?\2\2\u00e4<\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7"+
		"\7?\2\2\u00e7>\3\2\2\2\u00e8\u00ea\t\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec@\3\2\2\2\u00ed"+
		"\u00f1\5C\"\2\u00ee\u00f1\5E#\2\u00ef\u00f1\5I%\2\u00f0\u00ed\3\2\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1B\3\2\2\2\u00f2\u00f4\t"+
		"\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6D\3\2\2\2\u00f7\u00f9\t\3\2\2\u00f8\u00f7\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0102"+
		"\3\2\2\2\u00fc\u00fe\7\60\2\2\u00fd\u00ff\t\3\2\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103"+
		"\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u0103\3\2\2\2\u0103F\3\2\2\2\u0104"+
		"\u0106\t\4\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108H\3\2\2\2\u0109\u010c\7)\2\2\u010a\u010d"+
		"\5A!\2\u010b\u010d\5\r\7\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\7)\2\2\u0111J\3\2\2\2\20\2\u0081\u0090\u00e9\u00eb\u00f0"+
		"\u00f5\u00fa\u0100\u0102\u0105\u0107\u010c\u010e\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}