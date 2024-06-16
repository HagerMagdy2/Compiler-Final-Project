// $ANTLR 3.4 D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g 2024-05-09 13:47:55

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndOr", "Body", "Boolean", "Class", "ConditionOp", "Decl", "Double", "Float", "Fun", "Func", "ID", "IF", "If", "Input", "Int", "Modifier", "Num", "Print", "SL_COMMENT", "STRING", "Semi", "Start", "Strings", "Void", "WhiteSpace", "'('", "')'", "','", "'<<'", "'='", "'else'", "'end'", "'input'", "'println'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ArithmeticExpressionsParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArithmeticExpressionsParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ArithmeticExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g"; }


    String s="";


    public static class startgeneral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "startgeneral"
    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:18:1: startgeneral : body -> ^( Start body ) ;
    public final ArithmeticExpressionsParser.startgeneral_return startgeneral() throws RecognitionException {
        ArithmeticExpressionsParser.startgeneral_return retval = new ArithmeticExpressionsParser.startgeneral_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.body_return body1 =null;


        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:19:2: ( body -> ^( Start body ) )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:19:4: body
            {
            pushFollow(FOLLOW_body_in_startgeneral51);
            body1=body();

            state._fsp--;

            stream_body.add(body1.getTree());

            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 19:9: -> ^( Start body )
            {
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:19:12: ^( Start body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "startgeneral"


    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "body"
    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:20:1: body : ( expressions )+ -> ^( Body ( expressions )+ ) ;
    public final ArithmeticExpressionsParser.body_return body() throws RecognitionException {
        ArithmeticExpressionsParser.body_return retval = new ArithmeticExpressionsParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.expressions_return expressions2 =null;


        RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");
        try {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:20:7: ( ( expressions )+ -> ^( Body ( expressions )+ ) )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:20:9: ( expressions )+
            {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:20:9: ( expressions )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= IF)||LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:20:9: expressions
            	    {
            	    pushFollow(FOLLOW_expressions_in_body67);
            	    expressions2=expressions();

            	    state._fsp--;

            	    stream_expressions.add(expressions2.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: expressions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 20:22: -> ^( Body ( expressions )+ )
            {
                // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:20:25: ^( Body ( expressions )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Body, "Body")
                , root_1);

                if ( !(stream_expressions.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expressions.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressions.nextTree());

                }
                stream_expressions.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "body"


    public static class expressions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressions"
    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:28:1: expressions : ( decl -> ^( Decl decl ) | input -> ^( Input input ) | println -> ^( Print println ) | func -> ^( Func func ) | ifstmnt -> ^( If ifstmnt ) );
    public final ArithmeticExpressionsParser.expressions_return expressions() throws RecognitionException {
        ArithmeticExpressionsParser.expressions_return retval = new ArithmeticExpressionsParser.expressions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.decl_return decl3 =null;

        ArithmeticExpressionsParser.input_return input4 =null;

        ArithmeticExpressionsParser.println_return println5 =null;

        ArithmeticExpressionsParser.func_return func6 =null;

        ArithmeticExpressionsParser.ifstmnt_return ifstmnt7 =null;


        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_println=new RewriteRuleSubtreeStream(adaptor,"rule println");
        RewriteRuleSubtreeStream stream_ifstmnt=new RewriteRuleSubtreeStream(adaptor,"rule ifstmnt");
        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:29:2: ( decl -> ^( Decl decl ) | input -> ^( Input input ) | println -> ^( Print println ) | func -> ^( Func func ) | ifstmnt -> ^( If ifstmnt ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==33) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==Float||LA2_4==Num) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==36) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;

                    }
                }
                else if ( (LA2_1==29) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case IF:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:29:4: decl
                    {
                    pushFollow(FOLLOW_decl_in_expressions112);
                    decl3=decl();

                    state._fsp--;

                    stream_decl.add(decl3.getTree());

                    // AST REWRITE
                    // elements: decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 29:9: -> ^( Decl decl )
                    {
                        // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:29:12: ^( Decl decl )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Decl, "Decl")
                        , root_1);

                        adaptor.addChild(root_1, stream_decl.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:30:10: input
                    {
                    pushFollow(FOLLOW_input_in_expressions131);
                    input4=input();

                    state._fsp--;

                    stream_input.add(input4.getTree());

                    // AST REWRITE
                    // elements: input
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 30:16: -> ^( Input input )
                    {
                        // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:30:19: ^( Input input )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Input, "Input")
                        , root_1);

                        adaptor.addChild(root_1, stream_input.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:31:10: println
                    {
                    pushFollow(FOLLOW_println_in_expressions150);
                    println5=println();

                    state._fsp--;

                    stream_println.add(println5.getTree());

                    // AST REWRITE
                    // elements: println
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 31:18: -> ^( Print println )
                    {
                        // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:31:21: ^( Print println )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Print, "Print")
                        , root_1);

                        adaptor.addChild(root_1, stream_println.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:32:10: func
                    {
                    pushFollow(FOLLOW_func_in_expressions169);
                    func6=func();

                    state._fsp--;

                    stream_func.add(func6.getTree());

                    // AST REWRITE
                    // elements: func
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 32:15: -> ^( Func func )
                    {
                        // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:32:18: ^( Func func )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Func, "Func")
                        , root_1);

                        adaptor.addChild(root_1, stream_func.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:33:10: ifstmnt
                    {
                    pushFollow(FOLLOW_ifstmnt_in_expressions188);
                    ifstmnt7=ifstmnt();

                    state._fsp--;

                    stream_ifstmnt.add(ifstmnt7.getTree());

                    // AST REWRITE
                    // elements: ifstmnt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 33:18: -> ^( If ifstmnt )
                    {
                        // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:33:21: ^( If ifstmnt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(If, "If")
                        , root_1);

                        adaptor.addChild(root_1, stream_ifstmnt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressions"


    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decl"
    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:37:1: decl : ID '=' ( Num | Float ) Semi ;
    public final ArithmeticExpressionsParser.decl_return decl() throws RecognitionException {
        ArithmeticExpressionsParser.decl_return retval = new ArithmeticExpressionsParser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID8=null;
        Token char_literal9=null;
        Token set10=null;
        Token Semi11=null;

        Object ID8_tree=null;
        Object char_literal9_tree=null;
        Object set10_tree=null;
        Object Semi11_tree=null;

        try {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:37:7: ( ID '=' ( Num | Float ) Semi )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:37:9: ID '=' ( Num | Float ) Semi
            {
            root_0 = (Object)adaptor.nil();


            ID8=(Token)match(input,ID,FOLLOW_ID_in_decl219); 
            ID8_tree = 
            (Object)adaptor.create(ID8)
            ;
            adaptor.addChild(root_0, ID8_tree);


            char_literal9=(Token)match(input,33,FOLLOW_33_in_decl221); 
            char_literal9_tree = 
            (Object)adaptor.create(char_literal9)
            ;
            adaptor.addChild(root_0, char_literal9_tree);


            set10=(Token)input.LT(1);

            if ( input.LA(1)==Float||input.LA(1)==Num ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set10)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            Semi11=(Token)match(input,Semi,FOLLOW_Semi_in_decl229); 
            Semi11_tree = 
            (Object)adaptor.create(Semi11)
            ;
            adaptor.addChild(root_0, Semi11_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decl"


    public static class input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "input"
    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:41:1: input : ID '=' 'input' '(' ( Strings )? ')' Semi ;
    public final ArithmeticExpressionsParser.input_return input() throws RecognitionException {
        ArithmeticExpressionsParser.input_return retval = new ArithmeticExpressionsParser.input_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID12=null;
        Token char_literal13=null;
        Token string_literal14=null;
        Token char_literal15=null;
        Token Strings16=null;
        Token char_literal17=null;
        Token Semi18=null;

        Object ID12_tree=null;
        Object char_literal13_tree=null;
        Object string_literal14_tree=null;
        Object char_literal15_tree=null;
        Object Strings16_tree=null;
        Object char_literal17_tree=null;
        Object Semi18_tree=null;

        try {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:41:8: ( ID '=' 'input' '(' ( Strings )? ')' Semi )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:41:10: ID '=' 'input' '(' ( Strings )? ')' Semi
            {
            root_0 = (Object)adaptor.nil();


            ID12=(Token)match(input,ID,FOLLOW_ID_in_input252); 
            ID12_tree = 
            (Object)adaptor.create(ID12)
            ;
            adaptor.addChild(root_0, ID12_tree);


            char_literal13=(Token)match(input,33,FOLLOW_33_in_input254); 
            char_literal13_tree = 
            (Object)adaptor.create(char_literal13)
            ;
            adaptor.addChild(root_0, char_literal13_tree);


            string_literal14=(Token)match(input,36,FOLLOW_36_in_input256); 
            string_literal14_tree = 
            (Object)adaptor.create(string_literal14)
            ;
            adaptor.addChild(root_0, string_literal14_tree);


            char_literal15=(Token)match(input,29,FOLLOW_29_in_input258); 
            char_literal15_tree = 
            (Object)adaptor.create(char_literal15)
            ;
            adaptor.addChild(root_0, char_literal15_tree);


            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:41:28: ( Strings )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Strings) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:41:28: Strings
                    {
                    Strings16=(Token)match(input,Strings,FOLLOW_Strings_in_input259); 
                    Strings16_tree = 
                    (Object)adaptor.create(Strings16)
                    ;
                    adaptor.addChild(root_0, Strings16_tree);


                    }
                    break;

            }


            char_literal17=(Token)match(input,30,FOLLOW_30_in_input261); 
            char_literal17_tree = 
            (Object)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);


            Semi18=(Token)match(input,Semi,FOLLOW_Semi_in_input262); 
            Semi18_tree = 
            (Object)adaptor.create(Semi18)
            ;
            adaptor.addChild(root_0, Semi18_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "input"


    public static class println_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "println"
    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:45:1: println : 'println' '<<' ( ID | Num | Float | Strings ) ( '<<' ( ID | Num | Float | Strings ) )* Semi ;
    public final ArithmeticExpressionsParser.println_return println() throws RecognitionException {
        ArithmeticExpressionsParser.println_return retval = new ArithmeticExpressionsParser.println_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal19=null;
        Token string_literal20=null;
        Token set21=null;
        Token string_literal22=null;
        Token set23=null;
        Token Semi24=null;

        Object string_literal19_tree=null;
        Object string_literal20_tree=null;
        Object set21_tree=null;
        Object string_literal22_tree=null;
        Object set23_tree=null;
        Object Semi24_tree=null;

        try {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:45:9: ( 'println' '<<' ( ID | Num | Float | Strings ) ( '<<' ( ID | Num | Float | Strings ) )* Semi )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:45:11: 'println' '<<' ( ID | Num | Float | Strings ) ( '<<' ( ID | Num | Float | Strings ) )* Semi
            {
            root_0 = (Object)adaptor.nil();


            string_literal19=(Token)match(input,37,FOLLOW_37_in_println284); 
            string_literal19_tree = 
            (Object)adaptor.create(string_literal19)
            ;
            adaptor.addChild(root_0, string_literal19_tree);


            string_literal20=(Token)match(input,32,FOLLOW_32_in_println286); 
            string_literal20_tree = 
            (Object)adaptor.create(string_literal20)
            ;
            adaptor.addChild(root_0, string_literal20_tree);


            set21=(Token)input.LT(1);

            if ( input.LA(1)==Float||input.LA(1)==ID||input.LA(1)==Num||input.LA(1)==Strings ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set21)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:45:49: ( '<<' ( ID | Num | Float | Strings ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:45:50: '<<' ( ID | Num | Float | Strings )
            	    {
            	    string_literal22=(Token)match(input,32,FOLLOW_32_in_println299); 
            	    string_literal22_tree = 
            	    (Object)adaptor.create(string_literal22)
            	    ;
            	    adaptor.addChild(root_0, string_literal22_tree);


            	    set23=(Token)input.LT(1);

            	    if ( input.LA(1)==Float||input.LA(1)==ID||input.LA(1)==Num||input.LA(1)==Strings ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set23)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            Semi24=(Token)match(input,Semi,FOLLOW_Semi_in_println313); 
            Semi24_tree = 
            (Object)adaptor.create(Semi24)
            ;
            adaptor.addChild(root_0, Semi24_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "println"


    public static class func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:49:1: func : ID '(' ( ID | Num ) ( ',' ( ID | Num ) )* ')' ;
    public final ArithmeticExpressionsParser.func_return func() throws RecognitionException {
        ArithmeticExpressionsParser.func_return retval = new ArithmeticExpressionsParser.func_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID25=null;
        Token char_literal26=null;
        Token set27=null;
        Token char_literal28=null;
        Token set29=null;
        Token char_literal30=null;

        Object ID25_tree=null;
        Object char_literal26_tree=null;
        Object set27_tree=null;
        Object char_literal28_tree=null;
        Object set29_tree=null;
        Object char_literal30_tree=null;

        try {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:49:7: ( ID '(' ( ID | Num ) ( ',' ( ID | Num ) )* ')' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:49:9: ID '(' ( ID | Num ) ( ',' ( ID | Num ) )* ')'
            {
            root_0 = (Object)adaptor.nil();


            ID25=(Token)match(input,ID,FOLLOW_ID_in_func336); 
            ID25_tree = 
            (Object)adaptor.create(ID25)
            ;
            adaptor.addChild(root_0, ID25_tree);


            char_literal26=(Token)match(input,29,FOLLOW_29_in_func338); 
            char_literal26_tree = 
            (Object)adaptor.create(char_literal26)
            ;
            adaptor.addChild(root_0, char_literal26_tree);


            set27=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==Num ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set27)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:49:25: ( ',' ( ID | Num ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:49:26: ',' ( ID | Num )
            	    {
            	    char_literal28=(Token)match(input,31,FOLLOW_31_in_func347); 
            	    char_literal28_tree = 
            	    (Object)adaptor.create(char_literal28)
            	    ;
            	    adaptor.addChild(root_0, char_literal28_tree);


            	    set29=(Token)input.LT(1);

            	    if ( input.LA(1)==ID||input.LA(1)==Num ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set29)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            char_literal30=(Token)match(input,30,FOLLOW_30_in_func357); 
            char_literal30_tree = 
            (Object)adaptor.create(char_literal30)
            ;
            adaptor.addChild(root_0, char_literal30_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class ifstmnt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifstmnt"
    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:53:1: ifstmnt : IF func ConditionOp ( ID | Num | Float ) println ( 'else' println )? 'end' ;
    public final ArithmeticExpressionsParser.ifstmnt_return ifstmnt() throws RecognitionException {
        ArithmeticExpressionsParser.ifstmnt_return retval = new ArithmeticExpressionsParser.ifstmnt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF31=null;
        Token ConditionOp33=null;
        Token set34=null;
        Token string_literal36=null;
        Token string_literal38=null;
        ArithmeticExpressionsParser.func_return func32 =null;

        ArithmeticExpressionsParser.println_return println35 =null;

        ArithmeticExpressionsParser.println_return println37 =null;


        Object IF31_tree=null;
        Object ConditionOp33_tree=null;
        Object set34_tree=null;
        Object string_literal36_tree=null;
        Object string_literal38_tree=null;

        try {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:53:9: ( IF func ConditionOp ( ID | Num | Float ) println ( 'else' println )? 'end' )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:53:11: IF func ConditionOp ( ID | Num | Float ) println ( 'else' println )? 'end'
            {
            root_0 = (Object)adaptor.nil();


            IF31=(Token)match(input,IF,FOLLOW_IF_in_ifstmnt379); 
            IF31_tree = 
            (Object)adaptor.create(IF31)
            ;
            adaptor.addChild(root_0, IF31_tree);


            pushFollow(FOLLOW_func_in_ifstmnt381);
            func32=func();

            state._fsp--;

            adaptor.addChild(root_0, func32.getTree());

            ConditionOp33=(Token)match(input,ConditionOp,FOLLOW_ConditionOp_in_ifstmnt383); 
            ConditionOp33_tree = 
            (Object)adaptor.create(ConditionOp33)
            ;
            adaptor.addChild(root_0, ConditionOp33_tree);


            set34=(Token)input.LT(1);

            if ( input.LA(1)==Float||input.LA(1)==ID||input.LA(1)==Num ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set34)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_println_in_ifstmnt394);
            println35=println();

            state._fsp--;

            adaptor.addChild(root_0, println35.getTree());

            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:53:56: ( 'else' println )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:53:57: 'else' println
                    {
                    string_literal36=(Token)match(input,34,FOLLOW_34_in_ifstmnt398); 
                    string_literal36_tree = 
                    (Object)adaptor.create(string_literal36)
                    ;
                    adaptor.addChild(root_0, string_literal36_tree);


                    pushFollow(FOLLOW_println_in_ifstmnt401);
                    println37=println();

                    state._fsp--;

                    adaptor.addChild(root_0, println37.getTree());

                    }
                    break;

            }


            string_literal38=(Token)match(input,35,FOLLOW_35_in_ifstmnt405); 
            string_literal38_tree = 
            (Object)adaptor.create(string_literal38)
            ;
            adaptor.addChild(root_0, string_literal38_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifstmnt"


    public static class types_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "types"
    // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:60:1: types : ( STRING | Boolean | Double | Int );
    public final ArithmeticExpressionsParser.types_return types() throws RecognitionException {
        ArithmeticExpressionsParser.types_return retval = new ArithmeticExpressionsParser.types_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set39=null;

        Object set39_tree=null;

        try {
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:60:7: ( STRING | Boolean | Double | Int )
            // D:\\Compiler\\Lab3 B- Constructing ASTrees\\Complete\\ArithmeticExpressions.g:
            {
            root_0 = (Object)adaptor.nil();


            set39=(Token)input.LT(1);

            if ( input.LA(1)==Boolean||input.LA(1)==Double||input.LA(1)==Int||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set39)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "types"

    // Delegated rules


 

    public static final BitSet FOLLOW_body_in_startgeneral51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressions_in_body67 = new BitSet(new long[]{0x000000200000C002L});
    public static final BitSet FOLLOW_decl_in_expressions112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_input_in_expressions131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_println_in_expressions150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_expressions169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmnt_in_expressions188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_decl219 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_decl221 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_set_in_decl223 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_Semi_in_decl229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_input252 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_input254 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_input256 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_input258 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_Strings_in_input259 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_input261 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_Semi_in_input262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_println284 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_println286 = new BitSet(new long[]{0x0000000004104800L});
    public static final BitSet FOLLOW_set_in_println288 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_32_in_println299 = new BitSet(new long[]{0x0000000004104800L});
    public static final BitSet FOLLOW_set_in_println301 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_Semi_in_println313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_func336 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_func338 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_set_in_func340 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31_in_func347 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_set_in_func349 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_func357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstmnt379 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_func_in_ifstmnt381 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ConditionOp_in_ifstmnt383 = new BitSet(new long[]{0x0000000000104800L});
    public static final BitSet FOLLOW_set_in_ifstmnt385 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_println_in_ifstmnt394 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ifstmnt398 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_println_in_ifstmnt401 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ifstmnt405 = new BitSet(new long[]{0x0000000000000002L});

}