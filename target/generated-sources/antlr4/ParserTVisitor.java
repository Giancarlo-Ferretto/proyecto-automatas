// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ParserTParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#linea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinea(ParserTParser.LineaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declararVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararVariable(ParserTParser.DeclararVariableContext ctx);
}