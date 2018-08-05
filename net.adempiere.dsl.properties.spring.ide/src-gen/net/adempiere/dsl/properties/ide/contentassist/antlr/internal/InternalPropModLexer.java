package net.adempiere.dsl.properties.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPropModLexer extends Lexer {
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_VALID_ID=4;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalPropModLexer() {;} 
    public InternalPropModLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPropModLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPropMod.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:11:7: ( 'String' )
            // InternalPropMod.g:11:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:12:7: ( 'int' )
            // InternalPropMod.g:12:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:13:7: ( 'boolean' )
            // InternalPropMod.g:13:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:14:7: ( 'package' )
            // InternalPropMod.g:14:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:15:7: ( ';' )
            // InternalPropMod.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:16:7: ( 'prefix' )
            // InternalPropMod.g:16:9: 'prefix'
            {
            match("prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:17:7: ( 'java-class-name' )
            // InternalPropMod.g:17:9: 'java-class-name'
            {
            match("java-class-name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:18:7: ( '.' )
            // InternalPropMod.g:18:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:19:7: ( 'property' )
            // InternalPropMod.g:19:9: 'property'
            {
            match("property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:20:7: ( 'not-null' )
            // InternalPropMod.g:20:9: 'not-null'
            {
            match("not-null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_VALID_ID"
    public final void mRULE_VALID_ID() throws RecognitionException {
        try {
            int _type = RULE_VALID_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:913:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ) )
            // InternalPropMod.g:913:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPropMod.g:913:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='-'||(LA1_1>='0' && LA1_1<='9')||(LA1_1>='A' && LA1_1<='Z')||LA1_1=='_'||(LA1_1>='a' && LA1_1<='z')) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0=='-') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPropMod.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VALID_ID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:915:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPropMod.g:915:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPropMod.g:915:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPropMod.g:915:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPropMod.g:915:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPropMod.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:917:10: ( ( '0' .. '9' )+ )
            // InternalPropMod.g:917:12: ( '0' .. '9' )+
            {
            // InternalPropMod.g:917:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPropMod.g:917:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:919:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPropMod.g:919:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPropMod.g:919:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPropMod.g:919:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPropMod.g:919:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPropMod.g:919:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPropMod.g:919:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPropMod.g:919:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPropMod.g:919:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPropMod.g:919:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPropMod.g:919:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:921:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPropMod.g:921:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPropMod.g:921:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPropMod.g:921:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:923:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPropMod.g:923:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPropMod.g:923:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPropMod.g:923:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalPropMod.g:923:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPropMod.g:923:41: ( '\\r' )? '\\n'
                    {
                    // InternalPropMod.g:923:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalPropMod.g:923:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:925:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPropMod.g:925:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPropMod.g:925:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPropMod.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPropMod.g:927:16: ( . )
            // InternalPropMod.g:927:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPropMod.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_VALID_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=18;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalPropMod.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalPropMod.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalPropMod.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalPropMod.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalPropMod.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalPropMod.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalPropMod.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalPropMod.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalPropMod.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalPropMod.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalPropMod.g:1:70: RULE_VALID_ID
                {
                mRULE_VALID_ID(); 

                }
                break;
            case 12 :
                // InternalPropMod.g:1:84: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // InternalPropMod.g:1:92: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // InternalPropMod.g:1:101: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // InternalPropMod.g:1:113: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // InternalPropMod.g:1:129: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // InternalPropMod.g:1:145: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalPropMod.g:1:153: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\4\22\1\uffff\1\22\1\uffff\2\22\1\20\1\uffff\3\20\2\uffff\1\24\1\uffff\1\24\1\uffff\4\24\1\uffff\1\24\1\uffff\1\24\5\uffff\1\24\1\53\7\24\1\uffff\5\24\1\uffff\5\24\1\uffff\1\24\1\100\2\24\1\103\3\24\1\uffff\1\107\1\110\1\uffff\3\24\2\uffff\1\114\1\24\1\116\1\uffff\1\24\1\uffff\1\24\1\uffff\3\24\1\125\1\uffff";
    static final String DFA13_eofS =
        "\126\uffff";
    static final String DFA13_minS =
        "\1\0\4\55\1\uffff\1\55\1\uffff\2\55\1\101\1\uffff\2\0\1\52\2\uffff\1\60\1\uffff\1\60\1\uffff\4\60\1\uffff\1\60\1\uffff\1\60\5\uffff\1\60\1\55\5\60\1\55\1\60\1\uffff\4\60\2\55\5\60\1\55\1\165\1\55\2\60\1\55\1\60\2\154\1\uffff\2\55\1\uffff\1\60\1\141\1\154\2\uffff\1\55\1\163\1\55\1\uffff\1\163\1\uffff\2\55\1\141\1\155\1\145\1\55\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\4\172\1\uffff\1\172\1\uffff\3\172\1\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\1\172\1\uffff\4\172\1\uffff\1\172\1\uffff\1\172\5\uffff\11\172\1\uffff\14\172\1\165\5\172\2\154\1\uffff\2\172\1\uffff\1\172\1\141\1\154\2\uffff\1\172\1\163\1\172\1\uffff\1\163\1\uffff\1\55\1\172\1\141\1\155\1\145\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\5\1\uffff\1\10\3\uffff\1\15\3\uffff\1\21\1\22\1\uffff\1\14\1\uffff\1\13\4\uffff\1\5\1\uffff\1\10\1\uffff\1\15\1\16\1\17\1\20\1\21\11\uffff\1\2\24\uffff\1\1\2\uffff\1\6\3\uffff\1\3\1\4\3\uffff\1\11\1\uffff\1\12\6\uffff\1\7";
    static final String DFA13_specialS =
        "\1\1\13\uffff\1\0\1\2\110\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\14\4\20\1\15\6\20\1\7\1\16\12\13\1\20\1\5\5\20\22\11\1\1\7\11\3\20\1\12\1\11\1\20\1\11\1\3\6\11\1\2\1\6\3\11\1\10\1\11\1\4\12\11\uff85\20",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\21\6\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\15\23\1\25\14\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\16\23\1\26\13\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\1\27\20\23\1\30\10\23",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\1\32\31\23",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\16\23\1\34\13\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "\0\36",
            "\0\36",
            "\1\37\4\uffff\1\40",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\21\23\1\42\10\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\43\6\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\16\23\1\44\13\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\2\23\1\45\27\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\46\11\23\1\47\13\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\25\23\1\50\4\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\51\6\23",
            "",
            "",
            "",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\10\23\1\52\21\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\13\23\1\54\16\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\12\23\1\55\17\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\5\23\1\56\24\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\17\23\1\57\12\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\1\60\31\23",
            "\1\61\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\15\23\1\62\14\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\63\25\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\1\64\31\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\10\23\1\65\21\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\66\25\23",
            "\1\67\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\15\24\1\70\14\24",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\6\23\1\71\23\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\1\72\31\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\6\23\1\73\23\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\27\23\1\74\2\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\21\23\1\75\10\23",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\2\24\1\76\27\24",
            "\1\77",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\15\23\1\101\14\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\102\25\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\104\6\23",
            "\1\105",
            "\1\106",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\30\23\1\111\1\23",
            "\1\112",
            "\1\113",
            "",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\115",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\117",
            "",
            "\1\120",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\15\24\1\121\14\24",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_VALID_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_12 = input.LA(1);

                        s = -1;
                        if ( ((LA13_12>='\u0000' && LA13_12<='\uFFFF')) ) {s = 30;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='S') ) {s = 1;}

                        else if ( (LA13_0=='i') ) {s = 2;}

                        else if ( (LA13_0=='b') ) {s = 3;}

                        else if ( (LA13_0=='p') ) {s = 4;}

                        else if ( (LA13_0==';') ) {s = 5;}

                        else if ( (LA13_0=='j') ) {s = 6;}

                        else if ( (LA13_0=='.') ) {s = 7;}

                        else if ( (LA13_0=='n') ) {s = 8;}

                        else if ( ((LA13_0>='A' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||(LA13_0>='c' && LA13_0<='h')||(LA13_0>='k' && LA13_0<='m')||LA13_0=='o'||(LA13_0>='q' && LA13_0<='z')) ) {s = 9;}

                        else if ( (LA13_0=='^') ) {s = 10;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 11;}

                        else if ( (LA13_0=='\"') ) {s = 12;}

                        else if ( (LA13_0=='\'') ) {s = 13;}

                        else if ( (LA13_0=='/') ) {s = 14;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 15;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='-')||LA13_0==':'||(LA13_0>='<' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_13 = input.LA(1);

                        s = -1;
                        if ( ((LA13_13>='\u0000' && LA13_13<='\uFFFF')) ) {s = 30;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}