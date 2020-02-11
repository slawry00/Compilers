// Define a grammar called Hello - rename to Little.g4

//r  : 'hello' ID ;         // match keyword hello followed by an identifier
//ID : [a-z]+ ;             // match lower-case identifiers
//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines



grammar Hello;
start				: program EOF ;
program				: PROGRAM BEGIN ;
//program_end			: END ;
//id					: IDENTIFIER ;
//pgm_body			: decl func_declarations ;
//decl				: string_decl decl
//					| var_decl decl
//					|;


// Tokens
PROGRAM			: 'PROGRAM' ;
BEGIN			: 'BEGIN' ;
END				: 'END' ;
FUNCTION		: 'FUNCTION' ;
READ			: 'READ' ;
WRITE			: 'WRITE' ;
IF				: 'IF' ;
ELSE			: 'ELSE' ;
ENDIF			: 'ENDIF' ;
WHILE			: 'WHILE' ;
ENDWHILE		: 'ENDWHILE' ;
CONTINUE		: 'CONTINUE' ;
BREAK			: 'BREAK' ;
RETURN			: 'RETURN' ;
INT				: 'INT' ;
VOID			: 'VOID' ;
STRING			: 'STRING' ;
FLOAT			: 'FLOAT' ;

//Operators
OP_ASSIGN		: ':=' ;
OP_PLUS			: '+' ;
OP_MINUS		: '-' ;
OP_STAR			: '*' ;
OP_SLASH		: '/' ;
OP_EQUALS		: '=' ;
OP_NOT_EQUALS	: '!=' ;
OP_CLT			: '<' ;
OP_CGT			: '>' ;
OP_LP			: '(' ;
OP_RP			: ')' ;
OP_SEMIC		: ';' ;
OP_COMMA		: ',' ;
OP_CLTE			: '<=' ;
OP_CGTE			: '>=' ;

INTLITERAL		: [0-9]+ ;
FLOATLITERAL 	: [0-9]* '.' [0-9]+ ;
STRINGLITERAL	: '"' ~'"'* '"' ;
COMMENT			: '--' ~[\r\n]* [\r\n] -> skip ;
WHITESPACE		: (' '|'\t'|'\r'|'\n')+ -> skip ;  //\t is tab, \r is char return ' '\t\r\n
IDENTIFIER		: [a-zA-Z][a-zA-Z0-9]* ;