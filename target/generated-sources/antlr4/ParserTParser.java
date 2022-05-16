// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESPACIO=1, IGUAL=2, TIPO_VARIABLE=3, TIPO_VARIABLE_VAR=4, TIPO_VARIABLE_CONST=5, 
		NOMBRE_VARIABLE=6, TIPO_DATO=7, TIPO_DATO_INT=8, TIPO_DATO_REAL=9, TIPO_DATO_STRING=10, 
		VALOR_DATO=11, VALOR_DATO_ENTERO=12, VALOR_DATO_REAL=13, VALOR_DATO_TEXTO=14, 
		VALOR_DATO_STRING=15, FUNCION_MATEMATICA=16, FUNCION_RAIZ=17, FUNCION_SENO=18, 
		FUNCION_COSENO=19, FUNCION_STRING=20, FUNCION_PRINT=21, FUNCION_READ=22, 
		ASIGNACION_VARIABLE=23;
	public static final int
		RULE_programa = 0, RULE_linea = 1, RULE_declararVariable = 2;
	public static final String[] ruleNames = {
		"programa", "linea", "declararVariable"
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
		"FUNCION_COSENO", "FUNCION_STRING", "FUNCION_PRINT", "FUNCION_READ", "ASIGNACION_VARIABLE"
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

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ParserTParser.EOF, 0); }
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				linea();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TIPO_VARIABLE );
			setState(11);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineaContext extends ParserRuleContext {
		public DeclararVariableContext declararVariable() {
			return getRuleContext(DeclararVariableContext.class,0);
		}
		public LineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linea; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLinea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineaContext linea() throws RecognitionException {
		LineaContext _localctx = new LineaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			declararVariable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclararVariableContext extends ParserRuleContext {
		public TerminalNode TIPO_VARIABLE() { return getToken(ParserTParser.TIPO_VARIABLE, 0); }
		public TerminalNode TIPO_DATO() { return getToken(ParserTParser.TIPO_DATO, 0); }
		public TerminalNode NOMBRE_VARIABLE() { return getToken(ParserTParser.NOMBRE_VARIABLE, 0); }
		public TerminalNode ASIGNACION_VARIABLE() { return getToken(ParserTParser.ASIGNACION_VARIABLE, 0); }
		public DeclararVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclararVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararVariableContext declararVariable() throws RecognitionException {
		DeclararVariableContext _localctx = new DeclararVariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declararVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(TIPO_VARIABLE);
			setState(16);
			match(TIPO_DATO);
			setState(17);
			match(NOMBRE_VARIABLE);
			setState(18);
			match(ASIGNACION_VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\27\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\2\2\5\2\4\6\2\2\2\24\2\t\3\2\2\2\4\17\3\2\2\2\6\21\3\2\2\2\b"+
		"\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\r\3\2"+
		"\2\2\r\16\7\2\2\3\16\3\3\2\2\2\17\20\5\6\4\2\20\5\3\2\2\2\21\22\7\5\2"+
		"\2\22\23\7\t\2\2\23\24\7\b\2\2\24\25\7\31\2\2\25\7\3\2\2\2\3\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}