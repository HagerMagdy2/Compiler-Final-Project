// $ANTLR 3.4 F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g 2017-03-21 06:23:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOUBLE", "Factor", "Fun", "GeneralArithExpr", "ID", "INT", "StartgeneralArithExpr", "Term", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'"
    };

    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int DOUBLE=4;
    public static final int Factor=5;
    public static final int Fun=6;
    public static final int GeneralArithExpr=7;
    public static final int ID=8;
    public static final int INT=9;
    public static final int StartgeneralArithExpr=10;
    public static final int Term=11;
    public static final int WS=12;

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
    public String getGrammarFileName() { return "F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g"; }


    public static class startgeneralArithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "startgeneralArithExpr"
    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:11:1: startgeneralArithExpr : ( ( generalArithExpr )+ ) -> ^( StartgeneralArithExpr ( generalArithExpr )+ ) ;
    public final ArithmeticExpressionsParser.startgeneralArithExpr_return startgeneralArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.startgeneralArithExpr_return retval = new ArithmeticExpressionsParser.startgeneralArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr1 =null;


        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:11:22: ( ( ( generalArithExpr )+ ) -> ^( StartgeneralArithExpr ( generalArithExpr )+ ) )
            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:11:24: ( ( generalArithExpr )+ )
            {
            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:11:24: ( ( generalArithExpr )+ )
            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:11:25: ( generalArithExpr )+
            {
            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:11:25: ( generalArithExpr )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DOUBLE||LA1_0==Fun||(LA1_0 >= ID && LA1_0 <= INT)||LA1_0==13||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:11:25: generalArithExpr
            	    {
            	    pushFollow(FOLLOW_generalArithExpr_in_startgeneralArithExpr34);
            	    generalArithExpr1=generalArithExpr();

            	    state._fsp--;

            	    stream_generalArithExpr.add(generalArithExpr1.getTree());

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


            }


            // AST REWRITE
            // elements: generalArithExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 12:2: -> ^( StartgeneralArithExpr ( generalArithExpr )+ )
            {
                // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:12:5: ^( StartgeneralArithExpr ( generalArithExpr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(StartgeneralArithExpr, "StartgeneralArithExpr")
                , root_1);

                if ( !(stream_generalArithExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_generalArithExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                }
                stream_generalArithExpr.reset();

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
    // $ANTLR end "startgeneralArithExpr"


    public static class generalArithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generalArithExpr"
    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:15:1: generalArithExpr : term ( ( '+' | '-' ) ^ term )* ;
    public final ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr() throws RecognitionException {
        ArithmeticExpressionsParser.generalArithExpr_return retval = new ArithmeticExpressionsParser.generalArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set3=null;
        ArithmeticExpressionsParser.term_return term2 =null;

        ArithmeticExpressionsParser.term_return term4 =null;


        Object set3_tree=null;

        try {
            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:15:17: ( term ( ( '+' | '-' ) ^ term )* )
            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:15:19: term ( ( '+' | '-' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_generalArithExpr57);
            term2=term();

            state._fsp--;

            adaptor.addChild(root_0, term2.getTree());

            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:15:24: ( ( '+' | '-' ) ^ term )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    switch ( input.LA(2) ) {
                    case ID:
                        {
                        alt2=1;
                        }
                        break;
                    case INT:
                        {
                        alt2=1;
                        }
                        break;
                    case DOUBLE:
                    case Fun:
                    case 13:
                    case 17:
                        {
                        alt2=1;
                        }
                        break;

                    }

                }
                else if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:15:25: ( '+' | '-' ) ^ term
            	    {
            	    set3=(Token)input.LT(1);

            	    set3=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 16 && input.LA(1) <= 17) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set3)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_generalArithExpr70);
            	    term4=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "generalArithExpr"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:19:1: term : factor ( ( '*' | '/' ) ^ factor )* ;
    public final ArithmeticExpressionsParser.term_return term() throws RecognitionException {
        ArithmeticExpressionsParser.term_return retval = new ArithmeticExpressionsParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set6=null;
        ArithmeticExpressionsParser.factor_return factor5 =null;

        ArithmeticExpressionsParser.factor_return factor7 =null;


        Object set6_tree=null;

        try {
            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:19:6: ( factor ( ( '*' | '/' ) ^ factor )* )
            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:19:8: factor ( ( '*' | '/' ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term85);
            factor5=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor5.getTree());

            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:19:15: ( ( '*' | '/' ) ^ factor )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:19:17: ( '*' | '/' ) ^ factor
            	    {
            	    set6=(Token)input.LT(1);

            	    set6=(Token)input.LT(1);

            	    if ( input.LA(1)==15||input.LA(1)==18 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set6)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term100);
            	    factor7=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor7.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:23:1: factor : ( ID -> ^( Factor ID ) | INT -> ^( Factor INT ) | DOUBLE -> ^( Factor DOUBLE ) | '-' ID -> ^( Factor '-' ID ) | '-' INT -> ^( Factor '-' INT ) | '-' DOUBLE -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) );
    public final ArithmeticExpressionsParser.factor_return factor() throws RecognitionException {
        ArithmeticExpressionsParser.factor_return retval = new ArithmeticExpressionsParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID8=null;
        Token INT9=null;
        Token DOUBLE10=null;
        Token char_literal11=null;
        Token ID12=null;
        Token char_literal13=null;
        Token INT14=null;
        Token char_literal15=null;
        Token DOUBLE16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        Token Fun20=null;
        Token char_literal21=null;
        Token char_literal23=null;
        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr18 =null;

        ArithmeticExpressionsParser.generalArithExpr_return generalArithExpr22 =null;


        Object ID8_tree=null;
        Object INT9_tree=null;
        Object DOUBLE10_tree=null;
        Object char_literal11_tree=null;
        Object ID12_tree=null;
        Object char_literal13_tree=null;
        Object INT14_tree=null;
        Object char_literal15_tree=null;
        Object DOUBLE16_tree=null;
        Object char_literal17_tree=null;
        Object char_literal19_tree=null;
        Object Fun20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_Fun=new RewriteRuleTokenStream(adaptor,"token Fun");
        RewriteRuleTokenStream stream_DOUBLE=new RewriteRuleTokenStream(adaptor,"token DOUBLE");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:23:8: ( ID -> ^( Factor ID ) | INT -> ^( Factor INT ) | DOUBLE -> ^( Factor DOUBLE ) | '-' ID -> ^( Factor '-' ID ) | '-' INT -> ^( Factor '-' INT ) | '-' DOUBLE -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' -> ^( Factor '(' generalArithExpr ')' ) | Fun '(' generalArithExpr ')' -> ^( Factor Fun '(' generalArithExpr ')' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt4=1;
                }
                break;
            case INT:
                {
                alt4=2;
                }
                break;
            case DOUBLE:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt4=4;
                    }
                    break;
                case INT:
                    {
                    alt4=5;
                    }
                    break;
                case DOUBLE:
                    {
                    alt4=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;

                }

                }
                break;
            case 13:
                {
                alt4=7;
                }
                break;
            case Fun:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:23:11: ID
                    {
                    ID8=(Token)match(input,ID,FOLLOW_ID_in_factor117);  
                    stream_ID.add(ID8);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 23:14: -> ^( Factor ID )
                    {
                        // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:23:17: ^( Factor ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:24:3: INT
                    {
                    INT9=(Token)match(input,INT,FOLLOW_INT_in_factor129);  
                    stream_INT.add(INT9);


                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 24:7: -> ^( Factor INT )
                    {
                        // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:24:10: ^( Factor INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:25:3: DOUBLE
                    {
                    DOUBLE10=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_factor141);  
                    stream_DOUBLE.add(DOUBLE10);


                    // AST REWRITE
                    // elements: DOUBLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 25:10: -> ^( Factor DOUBLE )
                    {
                        // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:25:13: ^( Factor DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_DOUBLE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:26:4: '-' ID
                    {
                    char_literal11=(Token)match(input,17,FOLLOW_17_in_factor154);  
                    stream_17.add(char_literal11);


                    ID12=(Token)match(input,ID,FOLLOW_ID_in_factor157);  
                    stream_ID.add(ID12);


                    // AST REWRITE
                    // elements: ID, 17
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 26:12: -> ^( Factor '-' ID )
                    {
                        // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:26:15: ^( Factor '-' ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_17.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:27:4: '-' INT
                    {
                    char_literal13=(Token)match(input,17,FOLLOW_17_in_factor173);  
                    stream_17.add(char_literal13);


                    INT14=(Token)match(input,INT,FOLLOW_INT_in_factor176);  
                    stream_INT.add(INT14);


                    // AST REWRITE
                    // elements: INT, 17
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 27:13: -> ^( Factor '-' INT )
                    {
                        // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:27:16: ^( Factor '-' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_17.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:28:4: '-' DOUBLE
                    {
                    char_literal15=(Token)match(input,17,FOLLOW_17_in_factor192);  
                    stream_17.add(char_literal15);


                    DOUBLE16=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_factor195);  
                    stream_DOUBLE.add(DOUBLE16);


                    // AST REWRITE
                    // elements: DOUBLE, 17
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 28:17: -> ^( Factor '-' DOUBLE )
                    {
                        // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:28:20: ^( Factor '-' DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_17.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_DOUBLE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:29:4: '(' generalArithExpr ')'
                    {
                    char_literal17=(Token)match(input,13,FOLLOW_13_in_factor212);  
                    stream_13.add(char_literal17);


                    pushFollow(FOLLOW_generalArithExpr_in_factor214);
                    generalArithExpr18=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr18.getTree());

                    char_literal19=(Token)match(input,14,FOLLOW_14_in_factor216);  
                    stream_14.add(char_literal19);


                    // AST REWRITE
                    // elements: 14, generalArithExpr, 13
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 29:29: -> ^( Factor '(' generalArithExpr ')' )
                    {
                        // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:29:32: ^( Factor '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_13.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_14.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:30:4: Fun '(' generalArithExpr ')'
                    {
                    Fun20=(Token)match(input,Fun,FOLLOW_Fun_in_factor234);  
                    stream_Fun.add(Fun20);


                    char_literal21=(Token)match(input,13,FOLLOW_13_in_factor236);  
                    stream_13.add(char_literal21);


                    pushFollow(FOLLOW_generalArithExpr_in_factor238);
                    generalArithExpr22=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr22.getTree());

                    char_literal23=(Token)match(input,14,FOLLOW_14_in_factor240);  
                    stream_14.add(char_literal23);


                    // AST REWRITE
                    // elements: Fun, generalArithExpr, 13, 14
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 30:33: -> ^( Factor Fun '(' generalArithExpr ')' )
                    {
                        // F:\\Faculty\\Compiler Design CS407\\Labs\\Labs- Dr Rasha\\Lab3 B- Constructing ASTrees\\ArithmeticExpressions.g:30:36: ^( Factor Fun '(' generalArithExpr ')' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Fun.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_13.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_14.nextNode()
                        );

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
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_generalArithExpr_in_startgeneralArithExpr34 = new BitSet(new long[]{0x0000000000022352L});
    public static final BitSet FOLLOW_term_in_generalArithExpr57 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_set_in_generalArithExpr60 = new BitSet(new long[]{0x0000000000022350L});
    public static final BitSet FOLLOW_term_in_generalArithExpr70 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_factor_in_term85 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_set_in_term89 = new BitSet(new long[]{0x0000000000022350L});
    public static final BitSet FOLLOW_factor_in_term100 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_ID_in_factor117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_factor141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_factor154 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_factor157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_factor173 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_factor176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_factor192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_DOUBLE_in_factor195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_factor212 = new BitSet(new long[]{0x0000000000022350L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor214 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_factor216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fun_in_factor234 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_factor236 = new BitSet(new long[]{0x0000000000022350L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor238 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_factor240 = new BitSet(new long[]{0x0000000000000002L});

}