// Generated from C:/Users/AdamGaafar23/Desktop/simpler-master/simpler-master/src/Alang/Alang.g4 by ANTLR 4.13.1
package Alang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlangParser}.
 */
public interface AlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AlangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AlangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(AlangParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(AlangParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AlangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(AlangParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(AlangParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlangParser#printDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrintDeclaration(AlangParser.PrintDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlangParser#printDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrintDeclaration(AlangParser.PrintDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AlangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AlangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AlangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AlangParser.ExpressionContext ctx);
}