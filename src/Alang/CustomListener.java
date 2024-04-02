package Alang;

import java.util.HashMap;

public class CustomListener extends AlangBaseListener {

    HashMap<String, Object> variableMap = new HashMap<>();

    @Override
    public void exitPrintDeclaration(AlangParser.PrintDeclarationContext ctx) {
        if (ctx.expression() != null) {
            String valueStr = ctx.expression().getText(); // Get the full text of the expression
            Object value;

            // Try parsing the expression as an integer
            try {
                value = Integer.parseInt(valueStr);
            } catch (NumberFormatException e) {
                // If parsing as an integer fails, treat it as a string
                // Check if the value is a string literal with quotes
                if (valueStr.startsWith("\"") && valueStr.endsWith("\"")) {
                    // Remove leading and trailing quotes from the string literal
                    value = valueStr.substring(1, valueStr.length() - 1);
                } else {
                    // If it's not a string literal, check if it's a variable in the map
                    value = variableMap.getOrDefault(valueStr, "Undefined");
                }
            }

            System.out.println(value);
        }
    }

    @Override
    public void exitVarDeclaration(AlangParser.VarDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        Object value;

        // Check if the value is an integer or string
        if (ctx.INT() != null) {
            value = Integer.parseInt(ctx.INT().getText());
        } else if (ctx.STRING() != null) {
            String valueStr = ctx.STRING().getText();
            // Remove quotes from the string value
            value = valueStr.substring(1, valueStr.length() - 1);
        } else {
            value = "Undefined";
        }

        variableMap.put(varName, value);
    }

    @Override
    public void exitAssignment(AlangParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        String valueStr = ctx.expression().getText(); // Get the full text of the expression
        Object value;

        // Try parsing the expression as an integer
        try {
            value = Integer.parseInt(valueStr);
        } catch (NumberFormatException e) {
            // If parsing as an integer fails, treat it as a string
            // Check if the value is a string literal with quotes
            if (valueStr.startsWith("\"") && valueStr.endsWith("\"")) {
                // Remove leading and trailing quotes from the string literal
                value = valueStr.substring(1, valueStr.length() - 1);
            } else {
                // If it's not a string literal, check if it's a variable in the map
                value = variableMap.getOrDefault(valueStr, "Undefined");
            }
        }

        variableMap.put(varName, value);
    }
}
