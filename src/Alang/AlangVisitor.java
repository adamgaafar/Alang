// Generated from C:/Users/AdamGaafar23/Desktop/simpler-master/simpler-master/src/Alang/Alang.g4 by ANTLR 4.13.1
package Alang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AlangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(AlangParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AlangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlangParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(AlangParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlangParser#printDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintDeclaration(AlangParser.PrintDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AlangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AlangParser.ExpressionContext ctx);
}