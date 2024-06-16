// $ANTLR 3.4 D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g 2024-05-09 13:47:55

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int AndOr=4;
    public static final int Body=5;
    public static final int Boolean=6;
    public static final int Class=7;
    public static final int ConditionOp=8;
    public static final int Decl=9;
    public static final int Double=10;
    public static final int Float=11;
    public static final int Fun=12;
    public static final int Func=13;
    public static final int ID=14;
    public static final int IF=15;
    public static final int If=16;
    public static final int Input=17;
    public static final int Int=18;
    public static final int Modifier=19;
    public static final int Num=20;
    public static final int Print=21;
    public static final int SL_COMMENT=22;
    public static final int STRING=23;
    public static final int Semi=24;
    public static final int Start=25;
    public static final int Strings=26;
    public static final int Void=27;
    public static final int WhiteSpace=28;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ArithmeticExpressionsLexer() {} 
    public ArithmeticExpressionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArithmeticExpressionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g"; }

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:2:7: ( '(' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:2:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:3:7: ( ')' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:3:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:4:7: ( ',' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:4:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:5:7: ( '<<' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:5:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:6:7: ( '=' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:6:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:7:7: ( 'else' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:7:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:8:7: ( 'end' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:8:9: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:9:7: ( 'input' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:9:9: 'input'
            {
            match("input"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:10:7: ( 'println' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:10:9: 'println'
            {
            match("println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:58:5: ( 'if' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:58:7: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:59:6: ( 'class' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:59:7: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Class"

    // $ANTLR start "AndOr"
    public final void mAndOr() throws RecognitionException {
        try {
            int _type = AndOr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:61:7: ( '&&' | '||' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='&') ) {
                alt1=1;
            }
            else if ( (LA1_0=='|') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:61:9: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:61:14: '||'
                    {
                    match("||"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AndOr"

    // $ANTLR start "Modifier"
    public final void mModifier() throws RecognitionException {
        try {
            int _type = Modifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:62:9: ( 'private' | 'public' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='p') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='r') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='u') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:62:11: 'private'
                    {
                    match("private"); 



                    }
                    break;
                case 2 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:62:21: 'public'
                    {
                    match("public"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Modifier"

    // $ANTLR start "Fun"
    public final void mFun() throws RecognitionException {
        try {
            int _type = Fun;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:63:5: ( 'sin' | 'cos' | 'tan' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt3=1;
                }
                break;
            case 'c':
                {
                alt3=2;
                }
                break;
            case 't':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:63:7: 'sin'
                    {
                    match("sin"); 



                    }
                    break;
                case 2 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:63:15: 'cos'
                    {
                    match("cos"); 



                    }
                    break;
                case 3 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:63:22: 'tan'
                    {
                    match("tan"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Fun"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:64:5: ( 'int' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:64:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Double"
    public final void mDouble() throws RecognitionException {
        try {
            int _type = Double;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:65:8: ( 'double' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:65:10: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Double"

    // $ANTLR start "Void"
    public final void mVoid() throws RecognitionException {
        try {
            int _type = Void;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:66:6: ( 'void' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:66:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Void"

    // $ANTLR start "Boolean"
    public final void mBoolean() throws RecognitionException {
        try {
            int _type = Boolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:67:9: ( 'boolean' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:67:11: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Boolean"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:68:9: ( 'String' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:68:11: 'String'
            {
            match("String"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:69:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )* )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:69:6: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:69:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='$'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "Num"
    public final void mNum() throws RecognitionException {
        try {
            int _type = Num;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:70:5: ( ( '-' )? ( '0' .. '9' )* )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:70:7: ( '-' )? ( '0' .. '9' )*
            {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:70:7: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:70:8: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:70:13: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Num"

    // $ANTLR start "Float"
    public final void mFloat() throws RecognitionException {
        try {
            int _type = Float;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:71:7: ( ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )* )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:71:9: ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )*
            {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:71:9: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:71:10: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:71:15: ( '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match('.'); 

            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:71:31: ( '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Float"

    // $ANTLR start "Semi"
    public final void mSemi() throws RecognitionException {
        try {
            int _type = Semi;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:72:5: ( ';' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:72:7: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Semi"

    // $ANTLR start "Strings"
    public final void mStrings() throws RecognitionException {
        try {
            int _type = Strings;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:73:9: ( '\"' ( . )* '\"' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:73:11: '\"' ( . )* '\"'
            {
            match('\"'); 

            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:73:15: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\"') ) {
                    alt10=2;
                }
                else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:73:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Strings"

    // $ANTLR start "ConditionOp"
    public final void mConditionOp() throws RecognitionException {
        try {
            int _type = ConditionOp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:74:12: ( '==' | '!=' | '>' | '<' | '>=' | '<=' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt11=1;
                }
                break;
            case '!':
                {
                alt11=2;
                }
                break;
            case '>':
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3=='=') ) {
                    alt11=5;
                }
                else {
                    alt11=3;
                }
                }
                break;
            case '<':
                {
                int LA11_4 = input.LA(2);

                if ( (LA11_4=='=') ) {
                    alt11=6;
                }
                else {
                    alt11=4;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:74:16: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 2 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:74:21: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 3 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:74:26: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:74:30: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 5 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:74:34: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 6 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:74:39: '<='
                    {
                    match("<="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ConditionOp"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:76:12: ( '%' ( . )* ( '\\n' )+ )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:76:14: '%' ( . )* ( '\\n' )+
            {
            match('%'); 

            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:76:18: ( . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\n') ) {
                    alt12=2;
                }
                else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:76:19: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:76:22: ( '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\n') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:76:22: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "WhiteSpace"
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:77:11: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:77:13: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:77:13: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WhiteSpace"

    public void mTokens() throws RecognitionException {
        // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:8: ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | IF | Class | AndOr | Modifier | Fun | Int | Double | Void | Boolean | STRING | ID | Num | Float | Semi | Strings | ConditionOp | SL_COMMENT | WhiteSpace )
        int alt15=27;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:10: T__29
                {
                mT__29(); 


                }
                break;
            case 2 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:16: T__30
                {
                mT__30(); 


                }
                break;
            case 3 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:22: T__31
                {
                mT__31(); 


                }
                break;
            case 4 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:28: T__32
                {
                mT__32(); 


                }
                break;
            case 5 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:34: T__33
                {
                mT__33(); 


                }
                break;
            case 6 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:40: T__34
                {
                mT__34(); 


                }
                break;
            case 7 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:46: T__35
                {
                mT__35(); 


                }
                break;
            case 8 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:52: T__36
                {
                mT__36(); 


                }
                break;
            case 9 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:58: T__37
                {
                mT__37(); 


                }
                break;
            case 10 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:64: IF
                {
                mIF(); 


                }
                break;
            case 11 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:67: Class
                {
                mClass(); 


                }
                break;
            case 12 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:73: AndOr
                {
                mAndOr(); 


                }
                break;
            case 13 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:79: Modifier
                {
                mModifier(); 


                }
                break;
            case 14 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:88: Fun
                {
                mFun(); 


                }
                break;
            case 15 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:92: Int
                {
                mInt(); 


                }
                break;
            case 16 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:96: Double
                {
                mDouble(); 


                }
                break;
            case 17 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:103: Void
                {
                mVoid(); 


                }
                break;
            case 18 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:108: Boolean
                {
                mBoolean(); 


                }
                break;
            case 19 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:116: STRING
                {
                mSTRING(); 


                }
                break;
            case 20 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:123: ID
                {
                mID(); 


                }
                break;
            case 21 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:126: Num
                {
                mNum(); 


                }
                break;
            case 22 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:130: Float
                {
                mFloat(); 


                }
                break;
            case 23 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:136: Semi
                {
                mSemi(); 


                }
                break;
            case 24 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:141: Strings
                {
                mStrings(); 


                }
                break;
            case 25 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:149: ConditionOp
                {
                mConditionOp(); 


                }
                break;
            case 26 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:161: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 27 :
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:1:172: WhiteSpace
                {
                mWhiteSpace(); 


                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\24\3\uffff\1\30\1\34\4\21\1\uffff\6\21\1\uffff\2\24\11\uffff"+
        "\3\21\1\57\13\21\1\73\1\21\1\75\1\uffff\3\21\3\102\4\21\1\107\1"+
        "\uffff\1\21\1\uffff\4\21\1\uffff\1\21\1\116\2\21\1\uffff\1\121\3"+
        "\21\1\125\1\21\1\uffff\2\21\1\uffff\2\21\1\133\1\uffff\1\134\1\21"+
        "\1\136\1\137\1\133\2\uffff\1\140\3\uffff";
    static final String DFA15_eofS =
        "\141\uffff";
    static final String DFA15_minS =
        "\1\11\3\uffff\1\74\1\75\1\154\1\146\1\162\1\154\1\uffff\1\151\1"+
        "\141\3\157\1\164\1\uffff\2\56\11\uffff\1\163\1\144\1\160\1\44\1"+
        "\151\1\142\1\141\1\163\2\156\1\165\1\151\1\157\1\162\1\145\1\44"+
        "\1\165\1\44\1\uffff\1\156\1\154\1\163\3\44\1\142\1\144\1\154\1\151"+
        "\1\44\1\uffff\1\164\1\uffff\1\164\1\141\1\151\1\163\1\uffff\1\154"+
        "\1\44\1\145\1\156\1\uffff\1\44\1\154\1\164\1\143\1\44\1\145\1\uffff"+
        "\1\141\1\147\1\uffff\1\156\1\145\1\44\1\uffff\1\44\1\156\3\44\2"+
        "\uffff\1\44\3\uffff";
    static final String DFA15_maxS =
        "\1\174\3\uffff\1\74\1\75\2\156\1\165\1\157\1\uffff\1\151\1\141\3"+
        "\157\1\164\1\uffff\2\71\11\uffff\1\163\1\144\1\164\1\172\1\151\1"+
        "\142\1\141\1\163\2\156\1\165\1\151\1\157\1\162\1\145\1\172\1\165"+
        "\1\172\1\uffff\1\166\1\154\1\163\3\172\1\142\1\144\1\154\1\151\1"+
        "\172\1\uffff\1\164\1\uffff\1\164\1\141\1\151\1\163\1\uffff\1\154"+
        "\1\172\1\145\1\156\1\uffff\1\172\1\154\1\164\1\143\1\172\1\145\1"+
        "\uffff\1\141\1\147\1\uffff\1\156\1\145\1\172\1\uffff\1\172\1\156"+
        "\3\172\2\uffff\1\172\3\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\6\uffff\1\14\6\uffff\1\24\2\uffff\1\25\1\26"+
        "\1\27\1\30\1\31\1\32\1\33\1\4\1\5\22\uffff\1\12\13\uffff\1\7\1\uffff"+
        "\1\17\4\uffff\1\16\4\uffff\1\6\6\uffff\1\21\2\uffff\1\10\3\uffff"+
        "\1\13\5\uffff\1\15\1\20\1\uffff\1\23\1\11\1\22";
    static final String DFA15_specialS =
        "\141\uffff}>";
    static final String[] DFA15_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\1\30\1\27\1\uffff\1\21\1\31"+
            "\1\12\1\uffff\1\1\1\2\2\uffff\1\3\1\22\1\25\1\uffff\12\23\1"+
            "\uffff\1\26\1\4\1\5\1\30\2\uffff\22\21\1\20\7\21\4\uffff\1\21"+
            "\1\uffff\1\21\1\17\1\11\1\15\1\6\3\21\1\7\6\21\1\10\2\21\1\13"+
            "\1\14\1\21\1\16\4\21\1\uffff\1\12",
            "",
            "",
            "",
            "\1\33",
            "\1\30",
            "\1\35\1\uffff\1\36",
            "\1\40\7\uffff\1\37",
            "\1\41\2\uffff\1\42",
            "\1\43\2\uffff\1\44",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "\1\25\1\uffff\12\23",
            "\1\25\1\uffff\12\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55\3\uffff\1\56",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\74",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "",
            "\1\76\7\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\117",
            "\1\120",
            "",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\135",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "",
            "",
            "\1\21\13\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | IF | Class | AndOr | Modifier | Fun | Int | Double | Void | Boolean | STRING | ID | Num | Float | Semi | Strings | ConditionOp | SL_COMMENT | WhiteSpace );";
        }
    }
 

}