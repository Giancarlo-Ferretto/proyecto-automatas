// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESPACIO=1, IGUAL=2, TIPO_VARIABLE=3, TIPO_VARIABLE_VAR=4, TIPO_VARIABLE_CONST=5, 
		NOMBRE_VARIABLE=6, TIPO_DATO=7, TIPO_DATO_INT=8, TIPO_DATO_REAL=9, TIPO_DATO_STRING=10, 
		VALOR_DATO=11, VALOR_DATO_ENTERO=12, VALOR_DATO_REAL=13, VALOR_DATO_TEXTO=14, 
		VALOR_DATO_STRING=15, FUNCION_MATEMATICA=16, FUNCION_RAIZ=17, FUNCION_SENO=18, 
		FUNCION_COSENO=19, FUNCION_STRING=20, FUNCION_PRINT=21, FUNCION_READ=22;
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
		"VALOR_DATO_STRING", "FUNCION_MATEMATICA", "FUNCION_RAIZ", "FUNCION_SENO", 
		"FUNCION_COSENO", "FUNCION_STRING", "FUNCION_PRINT", "FUNCION_READ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'='", null, "'var'", "'const'", null, null, "'int'", "'real'", 
		"'string'", null, null, null, null, null, null, "'sqrt'", "'sin'", "'cos'", 
		null, "'print'", "'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ESPACIO", "IGUAL", "TIPO_VARIABLE", "TIPO_VARIABLE_VAR", "TIPO_VARIABLE_CONST", 
		"NOMBRE_VARIABLE", "TIPO_DATO", "TIPO_DATO_INT", "TIPO_DATO_REAL", "TIPO_DATO_STRING", 
		"VALOR_DATO", "VALOR_DATO_ENTERO", "VALOR_DATO_REAL", "VALOR_DATO_TEXTO", 
		"VALOR_DATO_STRING", "FUNCION_MATEMATICA", "FUNCION_RAIZ", "FUNCION_SENO", 
		"FUNCION_COSENO", "FUNCION_STRING", "FUNCION_PRINT", "FUNCION_READ"
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


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\5\4\66\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\6\7D\n\7\r\7\16\7E\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f`\n\f\3\r\6\r"+
		"c\n\r\r\r\16\rd\3\16\6\16h\n\16\r\16\16\16i\3\16\3\16\6\16n\n\16\r\16"+
		"\16\16o\5\16r\n\16\3\17\6\17u\n\17\r\17\16\17v\3\20\3\20\3\20\5\20|\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\5\21\u0083\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u0094\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30\3\2\4\3\2\62;\4\2C\\c|\2\u00af\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\65"+
		"\3\2\2\2\t\67\3\2\2\2\13;\3\2\2\2\rC\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23"+
		"P\3\2\2\2\25U\3\2\2\2\27_\3\2\2\2\31b\3\2\2\2\33g\3\2\2\2\35t\3\2\2\2"+
		"\37x\3\2\2\2!\u0082\3\2\2\2#\u0084\3\2\2\2%\u0089\3\2\2\2\'\u008d\3\2"+
		"\2\2)\u0093\3\2\2\2+\u0095\3\2\2\2-\u009b\3\2\2\2/\60\7\"\2\2\60\4\3\2"+
		"\2\2\61\62\7?\2\2\62\6\3\2\2\2\63\66\5\t\5\2\64\66\5\13\6\2\65\63\3\2"+
		"\2\2\65\64\3\2\2\2\66\b\3\2\2\2\678\7x\2\289\7c\2\29:\7t\2\2:\n\3\2\2"+
		"\2;<\7e\2\2<=\7q\2\2=>\7p\2\2>?\7u\2\2?@\7v\2\2@\f\3\2\2\2AD\5\35\17\2"+
		"BD\7a\2\2CA\3\2\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\16\3\2\2"+
		"\2GK\5\21\t\2HK\5\23\n\2IK\5\25\13\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\20"+
		"\3\2\2\2LM\7k\2\2MN\7p\2\2NO\7v\2\2O\22\3\2\2\2PQ\7t\2\2QR\7g\2\2RS\7"+
		"c\2\2ST\7n\2\2T\24\3\2\2\2UV\7u\2\2VW\7v\2\2WX\7t\2\2XY\7k\2\2YZ\7p\2"+
		"\2Z[\7i\2\2[\26\3\2\2\2\\`\5\31\r\2]`\5\33\16\2^`\5\37\20\2_\\\3\2\2\2"+
		"_]\3\2\2\2_^\3\2\2\2`\30\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2"+
		"\2de\3\2\2\2e\32\3\2\2\2fh\t\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2jq\3\2\2\2km\7\60\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2pr\3\2\2\2qk\3\2\2\2qr\3\2\2\2r\34\3\2\2\2su\t\3\2\2ts\3\2\2\2u"+
		"v\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\36\3\2\2\2x{\7)\2\2y|\5\35\17\2z|\5\3\2"+
		"\2{y\3\2\2\2{z\3\2\2\2|}\3\2\2\2}~\7)\2\2~ \3\2\2\2\177\u0083\5#\22\2"+
		"\u0080\u0083\5%\23\2\u0081\u0083\5\'\24\2\u0082\177\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0081\3\2\2\2\u0083\"\3\2\2\2\u0084\u0085\7u\2\2\u0085"+
		"\u0086\7s\2\2\u0086\u0087\7t\2\2\u0087\u0088\7v\2\2\u0088$\3\2\2\2\u0089"+
		"\u008a\7u\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c&\3\2\2\2\u008d"+
		"\u008e\7e\2\2\u008e\u008f\7q\2\2\u008f\u0090\7u\2\2\u0090(\3\2\2\2\u0091"+
		"\u0094\5+\26\2\u0092\u0094\5-\27\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094*\3\2\2\2\u0095\u0096\7r\2\2\u0096\u0097\7t\2\2\u0097\u0098"+
		"\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a,\3\2\2\2\u009b\u009c"+
		"\7t\2\2\u009c\u009d\7g\2\2\u009d\u009e\7c\2\2\u009e\u009f\7f\2\2\u009f"+
		".\3\2\2\2\21\2\65CEJ_dioqtv{\u0082\u0093\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}