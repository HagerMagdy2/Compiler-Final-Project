grammar ArithmeticExpressions;

options {output=AST;}

tokens{
StartgeneralArithExpr;
GeneralArithExpr;
Start;
Term;
Factor;
Classrule;
Declaration;
MethodDefinition;
Parameters;
Statements;
IfStatement;
WhileStatement;
ForStatement;
ForCondition;
Assignment;
Condition;
Modifier;
Type;
}
@members {
String s="";
}
// Arithmetic Expressions
startgeneralArithExpr: (classrule+) 
	-> ^(StartgeneralArithExpr classrule+) 
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
  // The finally clause is the last part a rule executes before returning.
  finally { s = s + "Exit..."+"\n"; }

classrule: Modifier 'class' ID '{' ((declaration | methodDefinition)^)* '}';

 catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
declaration: Modifier? Type ID ('=' generalArithExpr)? SEMI->^(Declaration Modifier? Type ID ('=' generalArithExpr)? SEMI);

 catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
methodDefinition: Modifier? Type ID '(' parameters ')' '{' statements 'return' generalArithExpr SEMI '}'->^(MethodDefinition  Modifier? Type ID '(' parameters ')' '{' statements 'return' generalArithExpr SEMI '}');

 catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    

parameters: Type ID (',' Type ID)*->^( Parameters Type ID (',' Type ID)*)  ;

 catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
statements: ((ifStatement | whileStatement | forStatement | declaration | assignment)^)*;

 catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    

ifStatement: 'if' '(' condition ')' '{' statements '}'->^(IfStatement 'if' '(' condition ')' '{' statements '}');

 catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
whileStatement: 'while' '(' condition ')' '{' statements '}'->^(WhileStatement 'while' '(' condition ')' '{' statements '}');

 catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
forStatement: 'for'  forCondition '{' statements '}'->^(ForStatement 'for'  forCondition '{' statements '}');

 catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
forCondition: '(' Type ID '=' (INT) SEMI ID ('>' | '<')^ INT SEMI ID (('+' |'-')^)+ ')' ;

 catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
assignment: ID '=' generalArithExpr SEMI->^(Assignment ID '=' generalArithExpr SEMI);

 catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
condition:  ID ('>' | '<')^ INT ;

 catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
  
generalArithExpr: term (('+' | '-')^  term)*
	//-> ^(GeneralArithExpr term (('+' | '-')  term)*)	
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  
term	: factor ( ( '*' | '/' )^ factor)* 
	//-> ^(Term factor ( ( '*' | '/' ) factor)*)
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

factor	:  ID -> ^(Factor ID)
	|INT -> ^(Factor INT)
	|DOUBLE -> ^(Factor DOUBLE)
	| '-'  ID -> ^(Factor  '-' ID)
	| '-'  INT -> ^(Factor  '-' INT)
	| '-'  DOUBLE  -> ^(Factor  '-' DOUBLE)
	| '(' generalArithExpr ')' -> ^(Factor  '(' generalArithExpr ')')
	| Fun '(' generalArithExpr ')' -> ^(Factor Fun '(' generalArithExpr ')')
	;
	
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
Fun	: 'sin' | 'cos'| 'tan' ;
Type: 'int' | 'double' | 'void'|'static';
Modifier: 'public' | 'private';


ID 	:	('a'..'z'|'A'..'Z'|'_')  ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*  ;
INT	:	 ('0'..'9')+ ;
SEMI	:	';';
DOUBLE	:	INT '.' INT;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();};
COMMENT :  '//' (.)* '\n' +{skip();};
    // ignore whitespace