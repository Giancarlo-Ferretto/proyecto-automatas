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
		ESPACIO=1, IGUAL=2, PARENTESIS_ABIERTO=3, PARENTESIS_CERRADO=4, LLAVE_ABIERTA=5, 
		LLAVE_CERRADA=6, PUNTO_COMA=7, TIPO_VARIABLE=8, TIPO_VARIABLE_VAR=9, TIPO_VARIABLE_CONST=10, 
		NOMBRE_VARIABLE=11, TIPO_DATO=12, TIPO_DATO_INT=13, TIPO_DATO_REAL=14, 
		TIPO_DATO_STRING=15, VALOR_DATO=16, VALOR_DATO_ENTERO=17, VALOR_DATO_REAL=18, 
		VALOR_DATO_TEXTO=19, VALOR_DATO_STRING=20, ASIGNACION_VARIABLE=21, CONDICIONAL_IF=22, 
		CONDICIONAL_ELSE_IF=23, CONDICIONAL_ELSE=24, CICLO_FOR=25, CICLO_WHILE=26, 
		OPERADOR_IGUAL=27, OPERADOR_NO_IGUAL=28, OPERADOR_SUMA=29, OPERADOR_RESTA=30, 
		OPERADOR_MULT=31, OPERADOR_DIV=32, FUNCION_MATEMATICA=33, FUNCION_RAIZ=34, 
		FUNCION_SENO=35, FUNCION_COSENO=36, FUNCION_PRINT=37, FUNCION_READ=38;
	public static final int
		RULE_programa = 0, RULE_linea = 1, RULE_declararVariable = 2, RULE_expresion = 3, 
		RULE_expresionNumerica = 4, RULE_funcionLeerImprimir = 5, RULE_imprimirVariable = 6, 
		RULE_leerVariable = 7, RULE_funcionMatematica = 8, RULE_funcionRaiz = 9, 
		RULE_funcionSeno = 10, RULE_funcionCoseno = 11, RULE_operadorMatematico = 12, 
		RULE_operadorSuma = 13, RULE_operadorResta = 14, RULE_operadorMultiplicacion = 15, 
		RULE_operadorDivision = 16, RULE_operadorBooleano = 17, RULE_operadorIgual = 18, 
		RULE_operadorNoIgual = 19, RULE_expresionCondicional = 20, RULE_bloqueCondicional = 21, 
		RULE_condicionalIf = 22, RULE_condicionalElseIf = 23, RULE_condicionalElse = 24, 
		RULE_bloqueRepetitivo = 25, RULE_cicloFor = 26, RULE_cicloWhile = 27;
	public static final String[] ruleNames = {
		"programa", "linea", "declararVariable", "expresion", "expresionNumerica", 
		"funcionLeerImprimir", "imprimirVariable", "leerVariable", "funcionMatematica", 
		"funcionRaiz", "funcionSeno", "funcionCoseno", "operadorMatematico", "operadorSuma", 
		"operadorResta", "operadorMultiplicacion", "operadorDivision", "operadorBooleano", 
		"operadorIgual", "operadorNoIgual", "expresionCondicional", "bloqueCondicional", 
		"condicionalIf", "condicionalElseIf", "condicionalElse", "bloqueRepetitivo", 
		"cicloFor", "cicloWhile"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'='", "'('", "')'", "'{'", "'}'", "';'", null, "'var'", 
		"'const'", null, null, "'int'", "'real'", "'string'", null, null, null, 
		null, null, null, "'if'", "'else if'", "'else'", "'for'", "'while'", "'=='", 
		"'!='", "'+='", "'-='", "'*='", "'/='", null, "'sqrt'", "'sin'", "'cos'", 
		"'print'", "'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ESPACIO", "IGUAL", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", 
		"LLAVE_ABIERTA", "LLAVE_CERRADA", "PUNTO_COMA", "TIPO_VARIABLE", "TIPO_VARIABLE_VAR", 
		"TIPO_VARIABLE_CONST", "NOMBRE_VARIABLE", "TIPO_DATO", "TIPO_DATO_INT", 
		"TIPO_DATO_REAL", "TIPO_DATO_STRING", "VALOR_DATO", "VALOR_DATO_ENTERO", 
		"VALOR_DATO_REAL", "VALOR_DATO_TEXTO", "VALOR_DATO_STRING", "ASIGNACION_VARIABLE", 
		"CONDICIONAL_IF", "CONDICIONAL_ELSE_IF", "CONDICIONAL_ELSE", "CICLO_FOR", 
		"CICLO_WHILE", "OPERADOR_IGUAL", "OPERADOR_NO_IGUAL", "OPERADOR_SUMA", 
		"OPERADOR_RESTA", "OPERADOR_MULT", "OPERADOR_DIV", "FUNCION_MATEMATICA", 
		"FUNCION_RAIZ", "FUNCION_SENO", "FUNCION_COSENO", "FUNCION_PRINT", "FUNCION_READ"
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
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				linea();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO_VARIABLE) | (1L << CONDICIONAL_IF) | (1L << CICLO_FOR) | (1L << CICLO_WHILE) | (1L << FUNCION_RAIZ) | (1L << FUNCION_SENO) | (1L << FUNCION_COSENO) | (1L << FUNCION_PRINT) | (1L << FUNCION_READ))) != 0) );
			setState(61);
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
		public FuncionLeerImprimirContext funcionLeerImprimir() {
			return getRuleContext(FuncionLeerImprimirContext.class,0);
		}
		public BloqueCondicionalContext bloqueCondicional() {
			return getRuleContext(BloqueCondicionalContext.class,0);
		}
		public BloqueRepetitivoContext bloqueRepetitivo() {
			return getRuleContext(BloqueRepetitivoContext.class,0);
		}
		public OperadorMatematicoContext operadorMatematico() {
			return getRuleContext(OperadorMatematicoContext.class,0);
		}
		public FuncionMatematicaContext funcionMatematica() {
			return getRuleContext(FuncionMatematicaContext.class,0);
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				declararVariable();
				}
				break;
			case FUNCION_PRINT:
			case FUNCION_READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				funcionLeerImprimir();
				}
				break;
			case CONDICIONAL_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				bloqueCondicional();
				}
				break;
			case CICLO_FOR:
			case CICLO_WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				bloqueRepetitivo();
				setState(67);
				operadorMatematico();
				}
				break;
			case FUNCION_RAIZ:
			case FUNCION_SENO:
			case FUNCION_COSENO:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				funcionMatematica();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
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
			setState(72);
			match(TIPO_VARIABLE);
			setState(73);
			match(TIPO_DATO);
			setState(74);
			match(NOMBRE_VARIABLE);
			setState(75);
			match(ASIGNACION_VARIABLE);
			setState(76);
			match(PUNTO_COMA);
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode NOMBRE_VARIABLE() { return getToken(ParserTParser.NOMBRE_VARIABLE, 0); }
		public TerminalNode VALOR_DATO() { return getToken(ParserTParser.VALOR_DATO, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==NOMBRE_VARIABLE || _la==VALOR_DATO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ExpresionNumericaContext extends ParserRuleContext {
		public TerminalNode TIPO_DATO_INT() { return getToken(ParserTParser.TIPO_DATO_INT, 0); }
		public TerminalNode TIPO_DATO_REAL() { return getToken(ParserTParser.TIPO_DATO_REAL, 0); }
		public TerminalNode VALOR_DATO_ENTERO() { return getToken(ParserTParser.VALOR_DATO_ENTERO, 0); }
		public TerminalNode VALOR_DATO_REAL() { return getToken(ParserTParser.VALOR_DATO_REAL, 0); }
		public ExpresionNumericaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionNumerica; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitExpresionNumerica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionNumericaContext expresionNumerica() throws RecognitionException {
		ExpresionNumericaContext _localctx = new ExpresionNumericaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expresionNumerica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO_DATO_INT) | (1L << TIPO_DATO_REAL) | (1L << VALOR_DATO_ENTERO) | (1L << VALOR_DATO_REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class FuncionLeerImprimirContext extends ParserRuleContext {
		public ImprimirVariableContext imprimirVariable() {
			return getRuleContext(ImprimirVariableContext.class,0);
		}
		public LeerVariableContext leerVariable() {
			return getRuleContext(LeerVariableContext.class,0);
		}
		public FuncionLeerImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionLeerImprimir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncionLeerImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionLeerImprimirContext funcionLeerImprimir() throws RecognitionException {
		FuncionLeerImprimirContext _localctx = new FuncionLeerImprimirContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcionLeerImprimir);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION_PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				imprimirVariable();
				}
				break;
			case FUNCION_READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				leerVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ImprimirVariableContext extends ParserRuleContext {
		public TerminalNode FUNCION_PRINT() { return getToken(ParserTParser.FUNCION_PRINT, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public TerminalNode VALOR_DATO() { return getToken(ParserTParser.VALOR_DATO, 0); }
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public ImprimirVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimirVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitImprimirVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirVariableContext imprimirVariable() throws RecognitionException {
		ImprimirVariableContext _localctx = new ImprimirVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imprimirVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(FUNCION_PRINT);
			setState(87);
			match(PARENTESIS_ABIERTO);
			setState(88);
			match(VALOR_DATO);
			setState(89);
			match(PARENTESIS_CERRADO);
			setState(90);
			match(PUNTO_COMA);
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

	public static class LeerVariableContext extends ParserRuleContext {
		public TerminalNode FUNCION_READ() { return getToken(ParserTParser.FUNCION_READ, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public LeerVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leerVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLeerVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerVariableContext leerVariable() throws RecognitionException {
		LeerVariableContext _localctx = new LeerVariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_leerVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(FUNCION_READ);
			setState(93);
			match(PARENTESIS_ABIERTO);
			setState(94);
			match(PARENTESIS_CERRADO);
			setState(95);
			match(PUNTO_COMA);
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

	public static class FuncionMatematicaContext extends ParserRuleContext {
		public FuncionRaizContext funcionRaiz() {
			return getRuleContext(FuncionRaizContext.class,0);
		}
		public FuncionSenoContext funcionSeno() {
			return getRuleContext(FuncionSenoContext.class,0);
		}
		public FuncionCosenoContext funcionCoseno() {
			return getRuleContext(FuncionCosenoContext.class,0);
		}
		public FuncionMatematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionMatematica; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncionMatematica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionMatematicaContext funcionMatematica() throws RecognitionException {
		FuncionMatematicaContext _localctx = new FuncionMatematicaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcionMatematica);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION_RAIZ:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				funcionRaiz();
				}
				break;
			case FUNCION_SENO:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				funcionSeno();
				}
				break;
			case FUNCION_COSENO:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				funcionCoseno();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FuncionRaizContext extends ParserRuleContext {
		public TerminalNode FUNCION_RAIZ() { return getToken(ParserTParser.FUNCION_RAIZ, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public ExpresionNumericaContext expresionNumerica() {
			return getRuleContext(ExpresionNumericaContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public FuncionRaizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionRaiz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncionRaiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionRaizContext funcionRaiz() throws RecognitionException {
		FuncionRaizContext _localctx = new FuncionRaizContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcionRaiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(FUNCION_RAIZ);
			setState(103);
			match(PARENTESIS_ABIERTO);
			setState(104);
			expresionNumerica();
			setState(105);
			match(PARENTESIS_CERRADO);
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

	public static class FuncionSenoContext extends ParserRuleContext {
		public TerminalNode FUNCION_SENO() { return getToken(ParserTParser.FUNCION_SENO, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public ExpresionNumericaContext expresionNumerica() {
			return getRuleContext(ExpresionNumericaContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public FuncionSenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionSeno; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncionSeno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionSenoContext funcionSeno() throws RecognitionException {
		FuncionSenoContext _localctx = new FuncionSenoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcionSeno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(FUNCION_SENO);
			setState(108);
			match(PARENTESIS_ABIERTO);
			setState(109);
			expresionNumerica();
			setState(110);
			match(PARENTESIS_CERRADO);
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

	public static class FuncionCosenoContext extends ParserRuleContext {
		public TerminalNode FUNCION_COSENO() { return getToken(ParserTParser.FUNCION_COSENO, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public ExpresionNumericaContext expresionNumerica() {
			return getRuleContext(ExpresionNumericaContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public FuncionCosenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionCoseno; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncionCoseno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionCosenoContext funcionCoseno() throws RecognitionException {
		FuncionCosenoContext _localctx = new FuncionCosenoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcionCoseno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(FUNCION_COSENO);
			setState(113);
			match(PARENTESIS_ABIERTO);
			setState(114);
			expresionNumerica();
			setState(115);
			match(PARENTESIS_CERRADO);
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

	public static class OperadorMatematicoContext extends ParserRuleContext {
		public OperadorSumaContext operadorSuma() {
			return getRuleContext(OperadorSumaContext.class,0);
		}
		public OperadorRestaContext operadorResta() {
			return getRuleContext(OperadorRestaContext.class,0);
		}
		public OperadorMultiplicacionContext operadorMultiplicacion() {
			return getRuleContext(OperadorMultiplicacionContext.class,0);
		}
		public OperadorDivisionContext operadorDivision() {
			return getRuleContext(OperadorDivisionContext.class,0);
		}
		public OperadorMatematicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorMatematico; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorMatematico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorMatematicoContext operadorMatematico() throws RecognitionException {
		OperadorMatematicoContext _localctx = new OperadorMatematicoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operadorMatematico);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				operadorSuma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				operadorResta();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				operadorMultiplicacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				operadorDivision();
				}
				break;
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

	public static class OperadorSumaContext extends ParserRuleContext {
		public List<ExpresionNumericaContext> expresionNumerica() {
			return getRuleContexts(ExpresionNumericaContext.class);
		}
		public ExpresionNumericaContext expresionNumerica(int i) {
			return getRuleContext(ExpresionNumericaContext.class,i);
		}
		public TerminalNode OPERADOR_SUMA() { return getToken(ParserTParser.OPERADOR_SUMA, 0); }
		public OperadorSumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorSuma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorSumaContext operadorSuma() throws RecognitionException {
		OperadorSumaContext _localctx = new OperadorSumaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operadorSuma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			expresionNumerica();
			setState(124);
			match(OPERADOR_SUMA);
			setState(125);
			expresionNumerica();
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

	public static class OperadorRestaContext extends ParserRuleContext {
		public List<ExpresionNumericaContext> expresionNumerica() {
			return getRuleContexts(ExpresionNumericaContext.class);
		}
		public ExpresionNumericaContext expresionNumerica(int i) {
			return getRuleContext(ExpresionNumericaContext.class,i);
		}
		public TerminalNode OPERADOR_RESTA() { return getToken(ParserTParser.OPERADOR_RESTA, 0); }
		public OperadorRestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorResta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorRestaContext operadorResta() throws RecognitionException {
		OperadorRestaContext _localctx = new OperadorRestaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operadorResta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			expresionNumerica();
			setState(128);
			match(OPERADOR_RESTA);
			setState(129);
			expresionNumerica();
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

	public static class OperadorMultiplicacionContext extends ParserRuleContext {
		public List<ExpresionNumericaContext> expresionNumerica() {
			return getRuleContexts(ExpresionNumericaContext.class);
		}
		public ExpresionNumericaContext expresionNumerica(int i) {
			return getRuleContext(ExpresionNumericaContext.class,i);
		}
		public TerminalNode OPERADOR_MULT() { return getToken(ParserTParser.OPERADOR_MULT, 0); }
		public OperadorMultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorMultiplicacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorMultiplicacionContext operadorMultiplicacion() throws RecognitionException {
		OperadorMultiplicacionContext _localctx = new OperadorMultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operadorMultiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			expresionNumerica();
			setState(132);
			match(OPERADOR_MULT);
			setState(133);
			expresionNumerica();
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

	public static class OperadorDivisionContext extends ParserRuleContext {
		public List<ExpresionNumericaContext> expresionNumerica() {
			return getRuleContexts(ExpresionNumericaContext.class);
		}
		public ExpresionNumericaContext expresionNumerica(int i) {
			return getRuleContext(ExpresionNumericaContext.class,i);
		}
		public TerminalNode OPERADOR_DIV() { return getToken(ParserTParser.OPERADOR_DIV, 0); }
		public OperadorDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorDivision; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorDivisionContext operadorDivision() throws RecognitionException {
		OperadorDivisionContext _localctx = new OperadorDivisionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operadorDivision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			expresionNumerica();
			setState(136);
			match(OPERADOR_DIV);
			setState(137);
			expresionNumerica();
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

	public static class OperadorBooleanoContext extends ParserRuleContext {
		public OperadorIgualContext operadorIgual() {
			return getRuleContext(OperadorIgualContext.class,0);
		}
		public OperadorNoIgualContext operadorNoIgual() {
			return getRuleContext(OperadorNoIgualContext.class,0);
		}
		public OperadorBooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorBooleano; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorBooleanoContext operadorBooleano() throws RecognitionException {
		OperadorBooleanoContext _localctx = new OperadorBooleanoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operadorBooleano);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				operadorIgual();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				operadorNoIgual();
				}
				break;
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

	public static class OperadorIgualContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OPERADOR_IGUAL() { return getToken(ParserTParser.OPERADOR_IGUAL, 0); }
		public OperadorIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorIgual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorIgualContext operadorIgual() throws RecognitionException {
		OperadorIgualContext _localctx = new OperadorIgualContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operadorIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			expresion();
			setState(144);
			match(OPERADOR_IGUAL);
			setState(145);
			expresion();
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

	public static class OperadorNoIgualContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OPERADOR_NO_IGUAL() { return getToken(ParserTParser.OPERADOR_NO_IGUAL, 0); }
		public OperadorNoIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorNoIgual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorNoIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorNoIgualContext operadorNoIgual() throws RecognitionException {
		OperadorNoIgualContext _localctx = new OperadorNoIgualContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operadorNoIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			expresion();
			setState(148);
			match(OPERADOR_NO_IGUAL);
			setState(149);
			expresion();
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

	public static class ExpresionCondicionalContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public OperadorBooleanoContext operadorBooleano() {
			return getRuleContext(OperadorBooleanoContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public ExpresionCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionCondicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitExpresionCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionCondicionalContext expresionCondicional() throws RecognitionException {
		ExpresionCondicionalContext _localctx = new ExpresionCondicionalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresionCondicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(PARENTESIS_ABIERTO);
			setState(152);
			operadorBooleano();
			setState(153);
			match(PARENTESIS_CERRADO);
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

	public static class BloqueCondicionalContext extends ParserRuleContext {
		public CondicionalIfContext condicionalIf() {
			return getRuleContext(CondicionalIfContext.class,0);
		}
		public CondicionalElseIfContext condicionalElseIf() {
			return getRuleContext(CondicionalElseIfContext.class,0);
		}
		public CondicionalElseContext condicionalElse() {
			return getRuleContext(CondicionalElseContext.class,0);
		}
		public BloqueCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueCondicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitBloqueCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueCondicionalContext bloqueCondicional() throws RecognitionException {
		BloqueCondicionalContext _localctx = new BloqueCondicionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bloqueCondicional);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				condicionalIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				condicionalElseIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				condicionalElse();
				}
				break;
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

	public static class CondicionalIfContext extends ParserRuleContext {
		public TerminalNode CONDICIONAL_IF() { return getToken(ParserTParser.CONDICIONAL_IF, 0); }
		public ExpresionCondicionalContext expresionCondicional() {
			return getRuleContext(ExpresionCondicionalContext.class,0);
		}
		public TerminalNode LLAVE_ABIERTA() { return getToken(ParserTParser.LLAVE_ABIERTA, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(ParserTParser.LLAVE_CERRADA, 0); }
		public CondicionalIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicionalIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalIfContext condicionalIf() throws RecognitionException {
		CondicionalIfContext _localctx = new CondicionalIfContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condicionalIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(CONDICIONAL_IF);
			setState(161);
			expresionCondicional();
			setState(162);
			match(LLAVE_ABIERTA);
			setState(163);
			programa();
			setState(164);
			match(LLAVE_CERRADA);
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

	public static class CondicionalElseIfContext extends ParserRuleContext {
		public CondicionalIfContext condicionalIf() {
			return getRuleContext(CondicionalIfContext.class,0);
		}
		public TerminalNode CONDICIONAL_ELSE_IF() { return getToken(ParserTParser.CONDICIONAL_ELSE_IF, 0); }
		public ExpresionCondicionalContext expresionCondicional() {
			return getRuleContext(ExpresionCondicionalContext.class,0);
		}
		public TerminalNode LLAVE_ABIERTA() { return getToken(ParserTParser.LLAVE_ABIERTA, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(ParserTParser.LLAVE_CERRADA, 0); }
		public CondicionalElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalElseIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicionalElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalElseIfContext condicionalElseIf() throws RecognitionException {
		CondicionalElseIfContext _localctx = new CondicionalElseIfContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condicionalElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			condicionalIf();
			setState(167);
			match(CONDICIONAL_ELSE_IF);
			setState(168);
			expresionCondicional();
			setState(169);
			match(LLAVE_ABIERTA);
			setState(170);
			programa();
			setState(171);
			match(LLAVE_CERRADA);
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

	public static class CondicionalElseContext extends ParserRuleContext {
		public CondicionalIfContext condicionalIf() {
			return getRuleContext(CondicionalIfContext.class,0);
		}
		public TerminalNode CONDICIONAL_ELSE() { return getToken(ParserTParser.CONDICIONAL_ELSE, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(ParserTParser.LLAVE_ABIERTA, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(ParserTParser.LLAVE_CERRADA, 0); }
		public CondicionalElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalElse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicionalElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalElseContext condicionalElse() throws RecognitionException {
		CondicionalElseContext _localctx = new CondicionalElseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condicionalElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			condicionalIf();
			setState(174);
			match(CONDICIONAL_ELSE);
			setState(175);
			match(LLAVE_ABIERTA);
			setState(176);
			programa();
			setState(177);
			match(LLAVE_CERRADA);
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

	public static class BloqueRepetitivoContext extends ParserRuleContext {
		public CicloForContext cicloFor() {
			return getRuleContext(CicloForContext.class,0);
		}
		public CicloWhileContext cicloWhile() {
			return getRuleContext(CicloWhileContext.class,0);
		}
		public BloqueRepetitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueRepetitivo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitBloqueRepetitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueRepetitivoContext bloqueRepetitivo() throws RecognitionException {
		BloqueRepetitivoContext _localctx = new BloqueRepetitivoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bloqueRepetitivo);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CICLO_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				cicloFor();
				}
				break;
			case CICLO_WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				cicloWhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CicloForContext extends ParserRuleContext {
		public TerminalNode CICLO_FOR() { return getToken(ParserTParser.CICLO_FOR, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public TerminalNode NOMBRE_VARIABLE() { return getToken(ParserTParser.NOMBRE_VARIABLE, 0); }
		public List<TerminalNode> PUNTO_COMA() { return getTokens(ParserTParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(ParserTParser.PUNTO_COMA, i);
		}
		public OperadorBooleanoContext operadorBooleano() {
			return getRuleContext(OperadorBooleanoContext.class,0);
		}
		public OperadorMatematicoContext operadorMatematico() {
			return getRuleContext(OperadorMatematicoContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(ParserTParser.LLAVE_ABIERTA, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(ParserTParser.LLAVE_CERRADA, 0); }
		public CicloForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloFor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCicloFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloForContext cicloFor() throws RecognitionException {
		CicloForContext _localctx = new CicloForContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cicloFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(CICLO_FOR);
			setState(184);
			match(PARENTESIS_ABIERTO);
			setState(185);
			match(NOMBRE_VARIABLE);
			setState(186);
			match(PUNTO_COMA);
			setState(187);
			operadorBooleano();
			setState(188);
			match(PUNTO_COMA);
			setState(189);
			operadorMatematico();
			setState(190);
			match(PUNTO_COMA);
			setState(191);
			match(PARENTESIS_CERRADO);
			setState(192);
			match(LLAVE_ABIERTA);
			setState(193);
			programa();
			setState(194);
			match(LLAVE_CERRADA);
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

	public static class CicloWhileContext extends ParserRuleContext {
		public TerminalNode CICLO_WHILE() { return getToken(ParserTParser.CICLO_WHILE, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public OperadorBooleanoContext operadorBooleano() {
			return getRuleContext(OperadorBooleanoContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(ParserTParser.LLAVE_ABIERTA, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(ParserTParser.LLAVE_CERRADA, 0); }
		public CicloWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloWhile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCicloWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloWhileContext cicloWhile() throws RecognitionException {
		CicloWhileContext _localctx = new CicloWhileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cicloWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(CICLO_WHILE);
			setState(197);
			match(PARENTESIS_ABIERTO);
			setState(198);
			operadorBooleano();
			setState(199);
			match(PARENTESIS_CERRADO);
			setState(200);
			match(LLAVE_ABIERTA);
			setState(201);
			programa();
			setState(202);
			match(LLAVE_CERRADA);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2<\n\2\r\2\16\2=\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\5\7W\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\5\ng\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16|\n\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\5\23\u0090\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\5\27\u00a1\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\5\33\u00b8\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\2\2\36\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\4\4\2\r\r\22\22"+
		"\4\2\17\20\23\24\2\u00c1\2;\3\2\2\2\4H\3\2\2\2\6J\3\2\2\2\bP\3\2\2\2\n"+
		"R\3\2\2\2\fV\3\2\2\2\16X\3\2\2\2\20^\3\2\2\2\22f\3\2\2\2\24h\3\2\2\2\26"+
		"m\3\2\2\2\30r\3\2\2\2\32{\3\2\2\2\34}\3\2\2\2\36\u0081\3\2\2\2 \u0085"+
		"\3\2\2\2\"\u0089\3\2\2\2$\u008f\3\2\2\2&\u0091\3\2\2\2(\u0095\3\2\2\2"+
		"*\u0099\3\2\2\2,\u00a0\3\2\2\2.\u00a2\3\2\2\2\60\u00a8\3\2\2\2\62\u00af"+
		"\3\2\2\2\64\u00b7\3\2\2\2\66\u00b9\3\2\2\28\u00c6\3\2\2\2:<\5\4\3\2;:"+
		"\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\2\2\3@\3\3\2\2\2"+
		"AI\5\6\4\2BI\5\f\7\2CI\5,\27\2DE\5\64\33\2EF\5\32\16\2FI\3\2\2\2GI\5\22"+
		"\n\2HA\3\2\2\2HB\3\2\2\2HC\3\2\2\2HD\3\2\2\2HG\3\2\2\2I\5\3\2\2\2JK\7"+
		"\n\2\2KL\7\16\2\2LM\7\r\2\2MN\7\27\2\2NO\7\t\2\2O\7\3\2\2\2PQ\t\2\2\2"+
		"Q\t\3\2\2\2RS\t\3\2\2S\13\3\2\2\2TW\5\16\b\2UW\5\20\t\2VT\3\2\2\2VU\3"+
		"\2\2\2W\r\3\2\2\2XY\7\'\2\2YZ\7\5\2\2Z[\7\22\2\2[\\\7\6\2\2\\]\7\t\2\2"+
		"]\17\3\2\2\2^_\7(\2\2_`\7\5\2\2`a\7\6\2\2ab\7\t\2\2b\21\3\2\2\2cg\5\24"+
		"\13\2dg\5\26\f\2eg\5\30\r\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\23\3\2\2\2"+
		"hi\7$\2\2ij\7\5\2\2jk\5\n\6\2kl\7\6\2\2l\25\3\2\2\2mn\7%\2\2no\7\5\2\2"+
		"op\5\n\6\2pq\7\6\2\2q\27\3\2\2\2rs\7&\2\2st\7\5\2\2tu\5\n\6\2uv\7\6\2"+
		"\2v\31\3\2\2\2w|\5\34\17\2x|\5\36\20\2y|\5 \21\2z|\5\"\22\2{w\3\2\2\2"+
		"{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\33\3\2\2\2}~\5\n\6\2~\177\7\37\2\2\177"+
		"\u0080\5\n\6\2\u0080\35\3\2\2\2\u0081\u0082\5\n\6\2\u0082\u0083\7 \2\2"+
		"\u0083\u0084\5\n\6\2\u0084\37\3\2\2\2\u0085\u0086\5\n\6\2\u0086\u0087"+
		"\7!\2\2\u0087\u0088\5\n\6\2\u0088!\3\2\2\2\u0089\u008a\5\n\6\2\u008a\u008b"+
		"\7\"\2\2\u008b\u008c\5\n\6\2\u008c#\3\2\2\2\u008d\u0090\5&\24\2\u008e"+
		"\u0090\5(\25\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090%\3\2\2\2"+
		"\u0091\u0092\5\b\5\2\u0092\u0093\7\35\2\2\u0093\u0094\5\b\5\2\u0094\'"+
		"\3\2\2\2\u0095\u0096\5\b\5\2\u0096\u0097\7\36\2\2\u0097\u0098\5\b\5\2"+
		"\u0098)\3\2\2\2\u0099\u009a\7\5\2\2\u009a\u009b\5$\23\2\u009b\u009c\7"+
		"\6\2\2\u009c+\3\2\2\2\u009d\u00a1\5.\30\2\u009e\u00a1\5\60\31\2\u009f"+
		"\u00a1\5\62\32\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3"+
		"\2\2\2\u00a1-\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\5*\26\2\u00a4\u00a5"+
		"\7\7\2\2\u00a5\u00a6\5\2\2\2\u00a6\u00a7\7\b\2\2\u00a7/\3\2\2\2\u00a8"+
		"\u00a9\5.\30\2\u00a9\u00aa\7\31\2\2\u00aa\u00ab\5*\26\2\u00ab\u00ac\7"+
		"\7\2\2\u00ac\u00ad\5\2\2\2\u00ad\u00ae\7\b\2\2\u00ae\61\3\2\2\2\u00af"+
		"\u00b0\5.\30\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3\5"+
		"\2\2\2\u00b3\u00b4\7\b\2\2\u00b4\63\3\2\2\2\u00b5\u00b8\5\66\34\2\u00b6"+
		"\u00b8\58\35\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\65\3\2\2"+
		"\2\u00b9\u00ba\7\33\2\2\u00ba\u00bb\7\5\2\2\u00bb\u00bc\7\r\2\2\u00bc"+
		"\u00bd\7\t\2\2\u00bd\u00be\5$\23\2\u00be\u00bf\7\t\2\2\u00bf\u00c0\5\32"+
		"\16\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3\7\7\2\2\u00c3"+
		"\u00c4\5\2\2\2\u00c4\u00c5\7\b\2\2\u00c5\67\3\2\2\2\u00c6\u00c7\7\34\2"+
		"\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9\5$\23\2\u00c9\u00ca\7\6\2\2\u00ca\u00cb"+
		"\7\7\2\2\u00cb\u00cc\5\2\2\2\u00cc\u00cd\7\b\2\2\u00cd9\3\2\2\2\n=HVf"+
		"{\u008f\u00a0\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}