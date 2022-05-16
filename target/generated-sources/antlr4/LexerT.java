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
		ESPACIO=1, IGUAL=2, TIPO_VARIABLE=3, TIPO_VARIABLE_VAR=4, TIPO_VARIABLE_CONST=5, 
		NOMBRE_VARIABLE=6, TIPO_DATO=7, TIPO_DATO_INT=8, TIPO_DATO_REAL=9, TIPO_DATO_STRING=10, 
		VALOR_DATO=11, VALOR_DATO_ENTERO=12, VALOR_DATO_REAL=13, VALOR_DATO_TEXTO=14, 
		VALOR_DATO_STRING=15, ASIGNACION_VARIABLE=16, FUNCION_MATEMATICA=17, FUNCION_RAIZ=18, 
		FUNCION_SENO=19, FUNCION_COSENO=20, FUNCION_STRING=21, FUNCION_PRINT=22, 
		FUNCION_READ=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ESPACIO", "IGUAL", "TIPO_VARIABLE", "TIPO_VARIABLE_VAR", "TIPO_VARIABLE_CONST", 
		"NOMBRE_VARIABLE", "TIPO_DATO", "TIPO_DATO_INT", "TIPO_DATO_REAL", "TIPO_DATO_STRING", 
		"VALOR_DATO", "VALOR_DATO_ENTERO", "VALOR_DATO_REAL", "VALOR_DATO_TEXTO", 
		"VALOR_DATO_STRING", "ASIGNACION_VARIABLE", "FUNCION_MATEMATICA", "FUNCION_RAIZ", 
		"FUNCION_SENO", "FUNCION_COSENO", "FUNCION_STRING", "FUNCION_PRINT", "FUNCION_READ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'='", null, "'var'", "'const'", null, null, "'int'", "'real'", 
		"'string'", null, null, null, null, null, null, null, "'sqrt'", "'sin'", 
		"'cos'", null, "'print'", "'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ESPACIO", "IGUAL", "TIPO_VARIABLE", "TIPO_VARIABLE_VAR", "TIPO_VARIABLE_CONST", 
		"NOMBRE_VARIABLE", "TIPO_DATO", "TIPO_DATO_INT", "TIPO_DATO_REAL", "TIPO_DATO_STRING", 
		"VALOR_DATO", "VALOR_DATO_ENTERO", "VALOR_DATO_REAL", "VALOR_DATO_TEXTO", 
		"VALOR_DATO_STRING", "ASIGNACION_VARIABLE", "FUNCION_MATEMATICA", "FUNCION_RAIZ", 
		"FUNCION_SENO", "FUNCION_COSENO", "FUNCION_STRING", "FUNCION_PRINT", "FUNCION_READ"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\6\7F\n\7\r\7\16\7G\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\fb\n\f"+
		"\3\r\6\re\n\r\r\r\16\rf\3\16\6\16j\n\16\r\16\16\16k\3\16\3\16\6\16p\n"+
		"\16\r\16\16\16q\5\16t\n\16\3\17\6\17w\n\17\r\17\16\17x\3\20\3\20\3\20"+
		"\6\20~\n\20\r\20\16\20\177\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\5\22"+
		"\u008a\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\5\26\u009b\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\4\3\2"+
		"\62;\4\2C\\c|\2\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\67\3\2\2\2\t9\3\2"+
		"\2\2\13=\3\2\2\2\rE\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23R\3\2\2\2\25W\3"+
		"\2\2\2\27a\3\2\2\2\31d\3\2\2\2\33i\3\2\2\2\35v\3\2\2\2\37z\3\2\2\2!\u0083"+
		"\3\2\2\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'\u0090\3\2\2\2)\u0094\3\2\2\2"+
		"+\u009a\3\2\2\2-\u009c\3\2\2\2/\u00a2\3\2\2\2\61\62\7\"\2\2\62\4\3\2\2"+
		"\2\63\64\7?\2\2\64\6\3\2\2\2\658\5\t\5\2\668\5\13\6\2\67\65\3\2\2\2\67"+
		"\66\3\2\2\28\b\3\2\2\29:\7x\2\2:;\7c\2\2;<\7t\2\2<\n\3\2\2\2=>\7e\2\2"+
		">?\7q\2\2?@\7p\2\2@A\7u\2\2AB\7v\2\2B\f\3\2\2\2CF\5\35\17\2DF\7a\2\2E"+
		"C\3\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\16\3\2\2\2IM\5\21\t"+
		"\2JM\5\23\n\2KM\5\25\13\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\20\3\2\2\2NO"+
		"\7k\2\2OP\7p\2\2PQ\7v\2\2Q\22\3\2\2\2RS\7t\2\2ST\7g\2\2TU\7c\2\2UV\7n"+
		"\2\2V\24\3\2\2\2WX\7u\2\2XY\7v\2\2YZ\7t\2\2Z[\7k\2\2[\\\7p\2\2\\]\7i\2"+
		"\2]\26\3\2\2\2^b\5\31\r\2_b\5\33\16\2`b\5\37\20\2a^\3\2\2\2a_\3\2\2\2"+
		"a`\3\2\2\2b\30\3\2\2\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2g\32\3\2\2\2hj\t\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2ls\3\2"+
		"\2\2mo\7\60\2\2np\t\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3"+
		"\2\2\2sm\3\2\2\2st\3\2\2\2t\34\3\2\2\2uw\t\3\2\2vu\3\2\2\2wx\3\2\2\2x"+
		"v\3\2\2\2xy\3\2\2\2y\36\3\2\2\2z}\7)\2\2{~\5\27\f\2|~\5\3\2\2}{\3\2\2"+
		"\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0082\7)\2\2\u0082 \3\2\2\2\u0083\u0084\5\5\3\2\u0084\u0085"+
		"\5\27\f\2\u0085\"\3\2\2\2\u0086\u008a\5%\23\2\u0087\u008a\5\'\24\2\u0088"+
		"\u008a\5)\25\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2"+
		"\2\2\u008a$\3\2\2\2\u008b\u008c\7u\2\2\u008c\u008d\7s\2\2\u008d\u008e"+
		"\7t\2\2\u008e\u008f\7v\2\2\u008f&\3\2\2\2\u0090\u0091\7u\2\2\u0091\u0092"+
		"\7k\2\2\u0092\u0093\7p\2\2\u0093(\3\2\2\2\u0094\u0095\7e\2\2\u0095\u0096"+
		"\7q\2\2\u0096\u0097\7u\2\2\u0097*\3\2\2\2\u0098\u009b\5-\27\2\u0099\u009b"+
		"\5/\30\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b,\3\2\2\2\u009c"+
		"\u009d\7r\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\u00a1\7v\2\2\u00a1.\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2"+
		"\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7f\2\2\u00a6\60\3\2\2\2\22\2\67EGLa"+
		"fkqsvx}\177\u0089\u009a\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}