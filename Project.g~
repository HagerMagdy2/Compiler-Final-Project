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
Main;
Print;
Boolean_dec;
List_dec;
Object_dec;
MethodCall;
ReturnStmt;
}
@members {
String s="";
}


startgeneralArithExpr	:	classDec+ -> ^(Start classDec+);
// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
// The finally clause is the last part a rule executes before returning.
finally { s = s + "Exit..."+"\n"; }
  
classDec:	Modifier? Class VAR 'extends'? VAR? '{' (main)? stmt*  '}' ->^(ClassDec Modifier? Class VAR '{' (main)? stmt* '}');
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


stmt    :
	decl -> ^(Decl decl)
	|ifstmt -> ^(Ifstmt ifstmt)
	|whilestmt -> ^(Whilestmt whilestmt)
	|forloop -> ^(Forloop forloop)
	|assigment -> ^(Assigment assigment)
	|method -> ^(Method method)
	|string_dec -> ^(String_Dec string_dec)
	|print ->^(Print print)
	;
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


method	:
	Modifier (types|VAR) VAR params '{' stmt* returnStmt'}'
	 
	;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
	
methodCall3 : ('new')? '('? VAR*  ('('')')?  ( '.' VAR '('? ('('( (NUM|methodCall)')'?  (',' (NUM|methodCall))*)?')'')'?)?)* ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

methodCall : ('new')? VAR  ('('')')?  ( '.' VAR ('('( (NUM|generalArithExpr|methodCall2)(',' (NUM|generalArithExpr|methodCall2))*)?')')?)* ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

methodCall2 : ('new')? VAR ('('')')? ( '.' VAR ('('( (NUM|generalArithExpr)(',' (NUM|generalArithExpr))*)?')')?)* ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

print :'System' '.out' '.println' '(' print_stat ')' SEMICOLON ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


params	:	'('(((types|VAR) VAR)(',' (types|VAR) VAR)*)? ')';
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

print_stat
	:	(NUM|Strings|DNUM|methodCall|decl|'('((VAR) (',' VAR)*)? ')')* ('"' (VAR|NUM|DNUM|Strings)'"')*;
	catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

decl    :   
  int_dec  -> ^(Int_dec int_dec)
  |list_dec ->^(List_dec list_dec)
  |object_dec -> ^(Object_dec object_dec)
  ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

list_dec : 'new'?types ('[]'|'['((NUM|VAR)(',' (NUM|VAR))*)?']')  VAR? ';' |'new'?VAR'[' (NUM|VAR)(',' (NUM|VAR))* ']'
  | VAR '['((NUM|VAR)(',' (NUM|VAR))*)?']'  '=' generalArithExpr SEMICOLON|VAR '['((NUM|VAR)(',' (NUM|VAR))*)?']'  '=' VAR '['((NUM|VAR)(',' (NUM|VAR))*)?']'  SEMICOLON
    ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

object_dec : VAR  VAR? ('=' 'new'?    methodCall3    )? SEMICOLON;

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

whilestmt	:	
	'while' '(' ifCon2 ')' '{' stmt* '}'
	; 
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
	
returnStmt   :  'return' (NUM|VAR)^  SEMICOLON;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

ifstmt:  
  'if' '('ifCon2 ')' ifBody ('else' elseBody)?;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
 
 ifCon	:	 condition|methodCall|('!') methodCall(AndOr ('!') methodCall )*|('!') '(' condition ')' ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

 condition:   
 generalArithExpr RelationalOperators generalArithExpr (AndOr generalArithExpr RelationalOperators generalArithExpr)*
  //->^(Condition generalArithExpr RelationalOperators generalArithExpr (AndOr condition)?)
  ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
 
ifCon2  :   condition |methodCall (AndOr methodCall )*|'('?('!') methodCall ')'? (AndOr '('?('!')  methodCall')'?)*|('!') '(' condition ')' ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

ifBody : block? stmt* ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

elseBody : block? stmt*;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

block : '{'stmt*'}'; 
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  
forloop	:   
	'for' '(' (decl) (condition) SEMICOLON (VAR change) ')' '{' stmt* '}'
	;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
	
assigment:   
	assign
	
	;
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

assign  :  
    VAR (change|'=' (generalArithExpr|list_dec) )SEMICOLON?
    ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
change	:
	('++'|'--'|('+='|'-=')generalArithExpr)
	;
	

// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  
int_dec	:	
	//(Modifier? INT VAR '=' (NUM|VAR) (Operation (NUM|VAR))* SEMICOLON)
	Modifier? (BOOLEAN|INT|DOUBLE) VAR (('=' generalArithExpr)?|(',' VAR)*) SEMICOLON;
	
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

 main: Modifier 'static' 'void' 'main' '(' 'String''[]' VAR')' '{' stmt*  '}' ->^(Main Modifier 'static' 'void' 'main' '(' 'String''[]' VAR')' '{' stmt*  '}');
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

string_dec:	
	//(Modifier? DOUBLE VAR '=' (DNUM|NUM|VAR) (Operation (DNUM|NUM|VAR))* SEMICOLON)
	Modifier? STRING VAR ('=' Strings)? SEMICOLON
	 
	;
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
  
term	: factor ( ( '*' | '/' )^ (factor|'(' methodCall ')'))* 
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
