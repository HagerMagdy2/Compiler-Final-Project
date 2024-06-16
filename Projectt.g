grammar Project;


options {output=AST;}
tokens{
Start;
StartgeneralArithExpr;
GeneralArithExpr;
Term;
Factor;
Method;
COMMENT;
Assigment;
Forloop;
Whilestmt;
Decl;
Ifstmt;
Double_dec;
Int_dec;
ClassDec;
TYPE;
String_Dec;
Condition;
Conditions;
}
@members {
String s="";
}


startgeneralArithExpr	:	classDec -> ^(Start classDec);
// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
// The finally clause is the last part a rule executes before returning.
finally { s = s + "Exit..."+"\n"; }
  
classDec:	Modifier Class VAR '{' stmt* '}' ->^(ClassDec Modifier Class VAR '{' stmt* '}');
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


stmt    :   (
	decl -> ^(Decl decl)
	|ifstmt -> ^(Ifstmt ifstmt)
	|whilestmt -> ^(Whilestmt whilestmt)
	|forloop -> ^(Forloop forloop)
	|assigment -> ^(Assigment assigment)
	|method -> ^(Method method)
	|string_dec -> ^(String_Dec string_dec)
	);
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


method	:
	Modifier types VAR params '{' stmt* 'return' VAR SEMICOLON'}'
	 -> ^(Method Modifier types VAR params '{' stmt* 'return' VAR SEMICOLON'}')
	;
params	:	'('((types VAR) (',' types VAR)*)? ')';
decl    :   
	int_dec	-> ^(Int_dec int_dec)
	|double_dec -> ^(Double_dec double_dec)
	;
whilestmt	:	
	'while' '(' condition ')' '{' stmt* '}'
	 -> ^(Whilestmt 'while' '(' condition ')' '{' stmt* '}')
	; 
ifstmt  :    
	'if' '(' condition ')' '{' stmt* '}'('else' '{' stmt* '}')?
	 -> ^(Ifstmt 'if' '(' condition ')' '{' stmt* '}'('else' '{' stmt* '}')?)
	;  
forloop	:   
	'for' '(' (decl) (condition) SEMICOLON (VAR change) ')' '{' stmt* '}'
	;
assigment:   
	assign
	-> ^(Assigment assign)
	;
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

assign	:	
	VAR (change|'=' generalArithExpr) SEMICOLON
	;
change	:
	('++'|'--'|('+='|'-=')generalArithExpr)
	;
	
condition:   
	generalArithExpr RelationalOperators generalArithExpr (AndOr condition)?
	->^(Condition generalArithExpr RelationalOperators generalArithExpr (AndOr condition)?)
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  
int_dec	:	
	//(Modifier? INT VAR '=' (NUM|VAR) (Operation (NUM|VAR))* SEMICOLON)
	Modifier? INT VAR (('=' generalArithExpr)?|(',' VAR)*) SEMICOLON
	;
  
double_dec:	
	//(Modifier? DOUBLE VAR '=' (DNUM|NUM|VAR) (Operation (DNUM|NUM|VAR))* SEMICOLON)
	Modifier? DOUBLE VAR (('=' generalArithExpr)?|(',' VAR)*) SEMICOLON
	;

string_dec:	
	//(Modifier? DOUBLE VAR '=' (DNUM|NUM|VAR) (Operation (DNUM|NUM|VAR))* SEMICOLON)
	Modifier? STRING VAR ('=' Strings)? SEMICOLON
	 -> ^(String_Dec Modifier? STRING VAR ('=' Strings)? SEMICOLON)
	;
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

factor	:  
	VAR -> ^(Factor VAR)
	|NUM -> ^(Factor NUM)
	|DNUM -> ^(Factor DOUBLE)
	|'-'  VAR -> ^(Factor  '-' VAR)
	|'-'  INT -> ^(Factor  '-' INT)
	|'-'  DNUM  -> ^(Factor  '-' DOUBLE)
	|'(' generalArithExpr ')' -> ^(Factor  '(' generalArithExpr ')')
	| Fun '(' generalArithExpr ')' -> ^(Factor Fun '(' generalArithExpr ')')
	;
	
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
Class:'class';
types	:	STRING|BOOLEAN|DOUBLE|INT;
AndOr	:	'&&'|'||';
Modifier:	'private'|'public';   
Fun	: 'sin' | 'cos'| 'tan' ;
INT	:	'int';
DOUBLE	:	'double';
VOID	:	'void';
BOOLEAN	:	'boolean';
STRING  :	'String';
VAR	:	('a'..'z'|'A'..'Z'|'$'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$')*;
NUM	:	('-')?('0'..'9')*;
DNUM	:	('-')?('0'..'9')* '.' ('0'..'9')*;
SEMICOLON:	';';
Strings	:	'"' (.)* '"';
RelationalOperators:   '=='|'!='|'>'|'<'|'>='|'<=';
ML_COMMENT	:	'/*' ( options {greedy=false;} : .)* '*/'+{skip();};
SL_COMMENT	:	'//' (.)*'\n'+{skip();};
WhiteSpace:	(' '|'\n'|'\r'|'\t')+{skip();};