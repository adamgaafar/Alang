grammar Alang;

program : statements EOF;

statements : statement+;

statement: varDeclaration
         | printDeclaration
         | assignment
         | expression
         ;

varDeclaration : 'var' ID '=' (STRING | INT) (NEWLINE | ';');
printDeclaration : 'print' LPAREN expression RPAREN (NEWLINE | ';');
assignment: ID '=' expression (NEWLINE | ';');

expression: expression TIMES expression
          | expression DIVIDE expression
          | expression PLUS expression
          | expression MINUS expression
          | LPAREN expression RPAREN
          | INT
          | STRING
          | ID
          ;

// Lexical Rules
ID      : [a-zA-Z]+;
STRING  : '"' .*? '"';
NEWLINE : [\r\n]+;
INT     : [0-9]+ ;
LPAREN  : '(';
RPAREN  : ')';
TIMES   : '*';
DIVIDE  : '/';
PLUS    : '+';
MINUS   : '-';
WS      : [ \t]+ -> skip;
