// Define a grammar called Hello

//r  : 'hello' ID ;         // match keyword hello followed by an identifier
//ID : [a-z]+ ;             // match lower-case identifiers
//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines



grammar Hello;
program : statement+;
statement : let | show ;
let : VAR '=' INT ;
show : 'show' (INT | VAR) ;
VAR : [a-z]+ ;
INT : [0–9]+ ;
WS : [ \n\t]+ -> skip;