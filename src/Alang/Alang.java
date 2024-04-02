/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alang;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;


/**
 *
 * @author Adam Gaafar
 */
public class Alang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            CharStream input = (CharStream) new ANTLRFileStream("test.alang");
            AlangLexer lexer = new AlangLexer(input);
            AlangParser parser = new AlangParser(new CommonTokenStream(lexer));
            parser.addParseListener(new CustomListener());
            parser.program();
        } catch (IOException ex) {
            Logger.getLogger(Alang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
