grammar ArithmeticExpressions;

options {output=AST;}
tokens{
StartgeneralArithExpr;
Person;
Sisters;
Brothers;
NAME;
Domain;
LastName;
FirstName;
Phone;
Job;
Mother;
Father;
Perants;
COMMENT;
Email;

Family;

FullName;
}
@members {
String s="";
}


startgeneralArithExpr	:	'{'person*'}' -> ^(Person '{'person*'}');
// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
// The finally clause is the last part a rule executes before returning.
finally { s = s + "Exit..."+"\n"; }
  


person    :   (

	
	fullName->^(FullName fullName)
	|email+ ->^(Email email+)
	|phone ->^(Phone phone)
	|job ->^(Job job)
	|family->^(Family family)
	);
	// catch blocks go first
 
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
 email	:	 'Email' ':''[' name '@' domain extention (','name '@' VAR extention )* ']'','->^(Email 'Email' ':''[' name '@' domain extention (','name '@' VAR extention )* ']'',') ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
domain	:	VAR  ->^(Domain VAR);
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

extention	:	EXTention ->^(EXTention EXTention);
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

fullName:	'Name'  ':'fname lname ',' ->^(FullName 'Name'  ':'fname lname ',');
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

name	:VAR ->^(NAME VAR);
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

fname	:	 VAR  ->^(FirstName VAR) ;
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

lname	:	 VAR ->^(LastName VAR) ;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


phone	:	'Phone' ':' NUM ','  ->^(Phone 'Phone' ':' NUM ',');
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
job	:'job:' '{' 'jobTitle:' VAR',' 
'jobLocation:' VAR (',' VAR)* '}'','  
->^(Job 'job:' '{' 'jobTitle:' VAR',' 
'jobLocation:' VAR (',' VAR)* '}'',');

catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

family	:	'Family:' '{' perents ',' sister ',' brother'}' 
->^(Family 'Family:' '{' perents ',' sister ',' brother'}');
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

perents	:	'perants:''{' father mother'}' ->^(Perants 'perants:''{' father mother'}');
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

father	:	'Father:' VAR',' ->^(Father 'Father:' VAR',');
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

mother	:	'mother:' VAR  ->^(Mother 'mother:' VAR);
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

sister	:	'sisters:' '[' (VAR? (',' VAR))*']' ->^(Sisters 'sisters:' '[' (VAR? (',' VAR))*']');
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

brother	:	'brothers:' '[' VAR? (',' VAR)']' ->^(Brothers 'brothers:' '[' VAR? (',' VAR)']' );
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


 
// catch blocks go first
 EXTention	:	'.com'|'.edu'|'.org' ;
 NUM	:	('0'..'9')*;

VAR	:	 ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$')*;
//ML_COMMENT	:	'/' ( options {greedy=false;} : .) '*/'+{skip();};
SL_COMMENT	:	'%' (.)*'\n'+{skip();};
WhiteSpace:	(' '|'\n'|'\r'|'\t')+{skip();};