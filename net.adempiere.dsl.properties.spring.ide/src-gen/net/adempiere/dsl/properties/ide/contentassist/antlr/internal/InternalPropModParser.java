package net.adempiere.dsl.properties.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import net.adempiere.dsl.properties.services.PropModGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPropModParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALID_ID", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'int'", "'boolean'", "'package'", "';'", "'prefix'", "'java-class-name'", "'.'", "'property'", "'not-null'"
    };
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


        public InternalPropModParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPropModParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPropModParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPropMod.g"; }


    	private PropModGrammarAccess grammarAccess;

    	public void setGrammarAccess(PropModGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePropModel"
    // InternalPropMod.g:53:1: entryRulePropModel : rulePropModel EOF ;
    public final void entryRulePropModel() throws RecognitionException {
        try {
            // InternalPropMod.g:54:1: ( rulePropModel EOF )
            // InternalPropMod.g:55:1: rulePropModel EOF
            {
             before(grammarAccess.getPropModelRule()); 
            pushFollow(FOLLOW_1);
            rulePropModel();

            state._fsp--;

             after(grammarAccess.getPropModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropModel"


    // $ANTLR start "rulePropModel"
    // InternalPropMod.g:62:1: rulePropModel : ( ( rule__PropModel__Group__0 ) ) ;
    public final void rulePropModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:66:2: ( ( ( rule__PropModel__Group__0 ) ) )
            // InternalPropMod.g:67:2: ( ( rule__PropModel__Group__0 ) )
            {
            // InternalPropMod.g:67:2: ( ( rule__PropModel__Group__0 ) )
            // InternalPropMod.g:68:3: ( rule__PropModel__Group__0 )
            {
             before(grammarAccess.getPropModelAccess().getGroup()); 
            // InternalPropMod.g:69:3: ( rule__PropModel__Group__0 )
            // InternalPropMod.g:69:4: rule__PropModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropModel"


    // $ANTLR start "entryRuleMetadata"
    // InternalPropMod.g:78:1: entryRuleMetadata : ruleMetadata EOF ;
    public final void entryRuleMetadata() throws RecognitionException {
        try {
            // InternalPropMod.g:79:1: ( ruleMetadata EOF )
            // InternalPropMod.g:80:1: ruleMetadata EOF
            {
             before(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_1);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getMetadataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalPropMod.g:87:1: ruleMetadata : ( ( rule__Metadata__Group__0 ) ) ;
    public final void ruleMetadata() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:91:2: ( ( ( rule__Metadata__Group__0 ) ) )
            // InternalPropMod.g:92:2: ( ( rule__Metadata__Group__0 ) )
            {
            // InternalPropMod.g:92:2: ( ( rule__Metadata__Group__0 ) )
            // InternalPropMod.g:93:3: ( rule__Metadata__Group__0 )
            {
             before(grammarAccess.getMetadataAccess().getGroup()); 
            // InternalPropMod.g:94:3: ( rule__Metadata__Group__0 )
            // InternalPropMod.g:94:4: rule__Metadata__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalPropMod.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalPropMod.g:104:1: ( ruleQualifiedName EOF )
            // InternalPropMod.g:105:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalPropMod.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalPropMod.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalPropMod.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalPropMod.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalPropMod.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalPropMod.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRulePropertyDefinition"
    // InternalPropMod.g:128:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // InternalPropMod.g:129:1: ( rulePropertyDefinition EOF )
            // InternalPropMod.g:130:1: rulePropertyDefinition EOF
            {
             before(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // InternalPropMod.g:137:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Group__0 ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:141:2: ( ( ( rule__PropertyDefinition__Group__0 ) ) )
            // InternalPropMod.g:142:2: ( ( rule__PropertyDefinition__Group__0 ) )
            {
            // InternalPropMod.g:142:2: ( ( rule__PropertyDefinition__Group__0 ) )
            // InternalPropMod.g:143:3: ( rule__PropertyDefinition__Group__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            // InternalPropMod.g:144:3: ( rule__PropertyDefinition__Group__0 )
            // InternalPropMod.g:144:4: rule__PropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "rulePropertyType"
    // InternalPropMod.g:153:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:157:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // InternalPropMod.g:158:2: ( ( rule__PropertyType__Alternatives ) )
            {
            // InternalPropMod.g:158:2: ( ( rule__PropertyType__Alternatives ) )
            // InternalPropMod.g:159:3: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // InternalPropMod.g:160:3: ( rule__PropertyType__Alternatives )
            // InternalPropMod.g:160:4: rule__PropertyType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PropertyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "rule__PropertyType__Alternatives"
    // InternalPropMod.g:168:1: rule__PropertyType__Alternatives : ( ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:172:1: ( ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPropMod.g:173:2: ( ( 'String' ) )
                    {
                    // InternalPropMod.g:173:2: ( ( 'String' ) )
                    // InternalPropMod.g:174:3: ( 'String' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalPropMod.g:175:3: ( 'String' )
                    // InternalPropMod.g:175:4: 'String'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPropMod.g:179:2: ( ( 'int' ) )
                    {
                    // InternalPropMod.g:179:2: ( ( 'int' ) )
                    // InternalPropMod.g:180:3: ( 'int' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalPropMod.g:181:3: ( 'int' )
                    // InternalPropMod.g:181:4: 'int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPropMod.g:185:2: ( ( 'boolean' ) )
                    {
                    // InternalPropMod.g:185:2: ( ( 'boolean' ) )
                    // InternalPropMod.g:186:3: ( 'boolean' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // InternalPropMod.g:187:3: ( 'boolean' )
                    // InternalPropMod.g:187:4: 'boolean'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Alternatives"


    // $ANTLR start "rule__PropModel__Group__0"
    // InternalPropMod.g:195:1: rule__PropModel__Group__0 : rule__PropModel__Group__0__Impl rule__PropModel__Group__1 ;
    public final void rule__PropModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:199:1: ( rule__PropModel__Group__0__Impl rule__PropModel__Group__1 )
            // InternalPropMod.g:200:2: rule__PropModel__Group__0__Impl rule__PropModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PropModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropModel__Group__0"


    // $ANTLR start "rule__PropModel__Group__0__Impl"
    // InternalPropMod.g:207:1: rule__PropModel__Group__0__Impl : ( ( rule__PropModel__MetaDataAssignment_0 ) ) ;
    public final void rule__PropModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:211:1: ( ( ( rule__PropModel__MetaDataAssignment_0 ) ) )
            // InternalPropMod.g:212:1: ( ( rule__PropModel__MetaDataAssignment_0 ) )
            {
            // InternalPropMod.g:212:1: ( ( rule__PropModel__MetaDataAssignment_0 ) )
            // InternalPropMod.g:213:2: ( rule__PropModel__MetaDataAssignment_0 )
            {
             before(grammarAccess.getPropModelAccess().getMetaDataAssignment_0()); 
            // InternalPropMod.g:214:2: ( rule__PropModel__MetaDataAssignment_0 )
            // InternalPropMod.g:214:3: rule__PropModel__MetaDataAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PropModel__MetaDataAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropModelAccess().getMetaDataAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropModel__Group__0__Impl"


    // $ANTLR start "rule__PropModel__Group__1"
    // InternalPropMod.g:222:1: rule__PropModel__Group__1 : rule__PropModel__Group__1__Impl ;
    public final void rule__PropModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:226:1: ( rule__PropModel__Group__1__Impl )
            // InternalPropMod.g:227:2: rule__PropModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropModel__Group__1"


    // $ANTLR start "rule__PropModel__Group__1__Impl"
    // InternalPropMod.g:233:1: rule__PropModel__Group__1__Impl : ( ( rule__PropModel__PropertiesAssignment_1 )* ) ;
    public final void rule__PropModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:237:1: ( ( ( rule__PropModel__PropertiesAssignment_1 )* ) )
            // InternalPropMod.g:238:1: ( ( rule__PropModel__PropertiesAssignment_1 )* )
            {
            // InternalPropMod.g:238:1: ( ( rule__PropModel__PropertiesAssignment_1 )* )
            // InternalPropMod.g:239:2: ( rule__PropModel__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getPropModelAccess().getPropertiesAssignment_1()); 
            // InternalPropMod.g:240:2: ( rule__PropModel__PropertiesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPropMod.g:240:3: rule__PropModel__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__PropModel__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPropModelAccess().getPropertiesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropModel__Group__1__Impl"


    // $ANTLR start "rule__Metadata__Group__0"
    // InternalPropMod.g:249:1: rule__Metadata__Group__0 : rule__Metadata__Group__0__Impl rule__Metadata__Group__1 ;
    public final void rule__Metadata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:253:1: ( rule__Metadata__Group__0__Impl rule__Metadata__Group__1 )
            // InternalPropMod.g:254:2: rule__Metadata__Group__0__Impl rule__Metadata__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Metadata__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__0"


    // $ANTLR start "rule__Metadata__Group__0__Impl"
    // InternalPropMod.g:261:1: rule__Metadata__Group__0__Impl : ( 'package' ) ;
    public final void rule__Metadata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:265:1: ( ( 'package' ) )
            // InternalPropMod.g:266:1: ( 'package' )
            {
            // InternalPropMod.g:266:1: ( 'package' )
            // InternalPropMod.g:267:2: 'package'
            {
             before(grammarAccess.getMetadataAccess().getPackageKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__0__Impl"


    // $ANTLR start "rule__Metadata__Group__1"
    // InternalPropMod.g:276:1: rule__Metadata__Group__1 : rule__Metadata__Group__1__Impl rule__Metadata__Group__2 ;
    public final void rule__Metadata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:280:1: ( rule__Metadata__Group__1__Impl rule__Metadata__Group__2 )
            // InternalPropMod.g:281:2: rule__Metadata__Group__1__Impl rule__Metadata__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Metadata__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__1"


    // $ANTLR start "rule__Metadata__Group__1__Impl"
    // InternalPropMod.g:288:1: rule__Metadata__Group__1__Impl : ( ( rule__Metadata__PackageNameAssignment_1 ) ) ;
    public final void rule__Metadata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:292:1: ( ( ( rule__Metadata__PackageNameAssignment_1 ) ) )
            // InternalPropMod.g:293:1: ( ( rule__Metadata__PackageNameAssignment_1 ) )
            {
            // InternalPropMod.g:293:1: ( ( rule__Metadata__PackageNameAssignment_1 ) )
            // InternalPropMod.g:294:2: ( rule__Metadata__PackageNameAssignment_1 )
            {
             before(grammarAccess.getMetadataAccess().getPackageNameAssignment_1()); 
            // InternalPropMod.g:295:2: ( rule__Metadata__PackageNameAssignment_1 )
            // InternalPropMod.g:295:3: rule__Metadata__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__PackageNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getPackageNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__1__Impl"


    // $ANTLR start "rule__Metadata__Group__2"
    // InternalPropMod.g:303:1: rule__Metadata__Group__2 : rule__Metadata__Group__2__Impl rule__Metadata__Group__3 ;
    public final void rule__Metadata__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:307:1: ( rule__Metadata__Group__2__Impl rule__Metadata__Group__3 )
            // InternalPropMod.g:308:2: rule__Metadata__Group__2__Impl rule__Metadata__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Metadata__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__2"


    // $ANTLR start "rule__Metadata__Group__2__Impl"
    // InternalPropMod.g:315:1: rule__Metadata__Group__2__Impl : ( ';' ) ;
    public final void rule__Metadata__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:319:1: ( ( ';' ) )
            // InternalPropMod.g:320:1: ( ';' )
            {
            // InternalPropMod.g:320:1: ( ';' )
            // InternalPropMod.g:321:2: ';'
            {
             before(grammarAccess.getMetadataAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__2__Impl"


    // $ANTLR start "rule__Metadata__Group__3"
    // InternalPropMod.g:330:1: rule__Metadata__Group__3 : rule__Metadata__Group__3__Impl rule__Metadata__Group__4 ;
    public final void rule__Metadata__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:334:1: ( rule__Metadata__Group__3__Impl rule__Metadata__Group__4 )
            // InternalPropMod.g:335:2: rule__Metadata__Group__3__Impl rule__Metadata__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Metadata__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__3"


    // $ANTLR start "rule__Metadata__Group__3__Impl"
    // InternalPropMod.g:342:1: rule__Metadata__Group__3__Impl : ( ( rule__Metadata__Group_3__0 )? ) ;
    public final void rule__Metadata__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:346:1: ( ( ( rule__Metadata__Group_3__0 )? ) )
            // InternalPropMod.g:347:1: ( ( rule__Metadata__Group_3__0 )? )
            {
            // InternalPropMod.g:347:1: ( ( rule__Metadata__Group_3__0 )? )
            // InternalPropMod.g:348:2: ( rule__Metadata__Group_3__0 )?
            {
             before(grammarAccess.getMetadataAccess().getGroup_3()); 
            // InternalPropMod.g:349:2: ( rule__Metadata__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPropMod.g:349:3: rule__Metadata__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Metadata__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetadataAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__3__Impl"


    // $ANTLR start "rule__Metadata__Group__4"
    // InternalPropMod.g:357:1: rule__Metadata__Group__4 : rule__Metadata__Group__4__Impl ;
    public final void rule__Metadata__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:361:1: ( rule__Metadata__Group__4__Impl )
            // InternalPropMod.g:362:2: rule__Metadata__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__4"


    // $ANTLR start "rule__Metadata__Group__4__Impl"
    // InternalPropMod.g:368:1: rule__Metadata__Group__4__Impl : ( ( rule__Metadata__Group_4__0 )? ) ;
    public final void rule__Metadata__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:372:1: ( ( ( rule__Metadata__Group_4__0 )? ) )
            // InternalPropMod.g:373:1: ( ( rule__Metadata__Group_4__0 )? )
            {
            // InternalPropMod.g:373:1: ( ( rule__Metadata__Group_4__0 )? )
            // InternalPropMod.g:374:2: ( rule__Metadata__Group_4__0 )?
            {
             before(grammarAccess.getMetadataAccess().getGroup_4()); 
            // InternalPropMod.g:375:2: ( rule__Metadata__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPropMod.g:375:3: rule__Metadata__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Metadata__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetadataAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__4__Impl"


    // $ANTLR start "rule__Metadata__Group_3__0"
    // InternalPropMod.g:384:1: rule__Metadata__Group_3__0 : rule__Metadata__Group_3__0__Impl rule__Metadata__Group_3__1 ;
    public final void rule__Metadata__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:388:1: ( rule__Metadata__Group_3__0__Impl rule__Metadata__Group_3__1 )
            // InternalPropMod.g:389:2: rule__Metadata__Group_3__0__Impl rule__Metadata__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Metadata__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_3__0"


    // $ANTLR start "rule__Metadata__Group_3__0__Impl"
    // InternalPropMod.g:396:1: rule__Metadata__Group_3__0__Impl : ( 'prefix' ) ;
    public final void rule__Metadata__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:400:1: ( ( 'prefix' ) )
            // InternalPropMod.g:401:1: ( 'prefix' )
            {
            // InternalPropMod.g:401:1: ( 'prefix' )
            // InternalPropMod.g:402:2: 'prefix'
            {
             before(grammarAccess.getMetadataAccess().getPrefixKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getPrefixKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_3__0__Impl"


    // $ANTLR start "rule__Metadata__Group_3__1"
    // InternalPropMod.g:411:1: rule__Metadata__Group_3__1 : rule__Metadata__Group_3__1__Impl rule__Metadata__Group_3__2 ;
    public final void rule__Metadata__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:415:1: ( rule__Metadata__Group_3__1__Impl rule__Metadata__Group_3__2 )
            // InternalPropMod.g:416:2: rule__Metadata__Group_3__1__Impl rule__Metadata__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Metadata__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_3__1"


    // $ANTLR start "rule__Metadata__Group_3__1__Impl"
    // InternalPropMod.g:423:1: rule__Metadata__Group_3__1__Impl : ( ( rule__Metadata__PrefixAssignment_3_1 ) ) ;
    public final void rule__Metadata__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:427:1: ( ( ( rule__Metadata__PrefixAssignment_3_1 ) ) )
            // InternalPropMod.g:428:1: ( ( rule__Metadata__PrefixAssignment_3_1 ) )
            {
            // InternalPropMod.g:428:1: ( ( rule__Metadata__PrefixAssignment_3_1 ) )
            // InternalPropMod.g:429:2: ( rule__Metadata__PrefixAssignment_3_1 )
            {
             before(grammarAccess.getMetadataAccess().getPrefixAssignment_3_1()); 
            // InternalPropMod.g:430:2: ( rule__Metadata__PrefixAssignment_3_1 )
            // InternalPropMod.g:430:3: rule__Metadata__PrefixAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__PrefixAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getPrefixAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_3__1__Impl"


    // $ANTLR start "rule__Metadata__Group_3__2"
    // InternalPropMod.g:438:1: rule__Metadata__Group_3__2 : rule__Metadata__Group_3__2__Impl ;
    public final void rule__Metadata__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:442:1: ( rule__Metadata__Group_3__2__Impl )
            // InternalPropMod.g:443:2: rule__Metadata__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_3__2"


    // $ANTLR start "rule__Metadata__Group_3__2__Impl"
    // InternalPropMod.g:449:1: rule__Metadata__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Metadata__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:453:1: ( ( ';' ) )
            // InternalPropMod.g:454:1: ( ';' )
            {
            // InternalPropMod.g:454:1: ( ';' )
            // InternalPropMod.g:455:2: ';'
            {
             before(grammarAccess.getMetadataAccess().getSemicolonKeyword_3_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_3__2__Impl"


    // $ANTLR start "rule__Metadata__Group_4__0"
    // InternalPropMod.g:465:1: rule__Metadata__Group_4__0 : rule__Metadata__Group_4__0__Impl rule__Metadata__Group_4__1 ;
    public final void rule__Metadata__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:469:1: ( rule__Metadata__Group_4__0__Impl rule__Metadata__Group_4__1 )
            // InternalPropMod.g:470:2: rule__Metadata__Group_4__0__Impl rule__Metadata__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Metadata__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_4__0"


    // $ANTLR start "rule__Metadata__Group_4__0__Impl"
    // InternalPropMod.g:477:1: rule__Metadata__Group_4__0__Impl : ( 'java-class-name' ) ;
    public final void rule__Metadata__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:481:1: ( ( 'java-class-name' ) )
            // InternalPropMod.g:482:1: ( 'java-class-name' )
            {
            // InternalPropMod.g:482:1: ( 'java-class-name' )
            // InternalPropMod.g:483:2: 'java-class-name'
            {
             before(grammarAccess.getMetadataAccess().getJavaClassNameKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getJavaClassNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_4__0__Impl"


    // $ANTLR start "rule__Metadata__Group_4__1"
    // InternalPropMod.g:492:1: rule__Metadata__Group_4__1 : rule__Metadata__Group_4__1__Impl rule__Metadata__Group_4__2 ;
    public final void rule__Metadata__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:496:1: ( rule__Metadata__Group_4__1__Impl rule__Metadata__Group_4__2 )
            // InternalPropMod.g:497:2: rule__Metadata__Group_4__1__Impl rule__Metadata__Group_4__2
            {
            pushFollow(FOLLOW_6);
            rule__Metadata__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_4__1"


    // $ANTLR start "rule__Metadata__Group_4__1__Impl"
    // InternalPropMod.g:504:1: rule__Metadata__Group_4__1__Impl : ( ( rule__Metadata__JavaClassNameAssignment_4_1 ) ) ;
    public final void rule__Metadata__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:508:1: ( ( ( rule__Metadata__JavaClassNameAssignment_4_1 ) ) )
            // InternalPropMod.g:509:1: ( ( rule__Metadata__JavaClassNameAssignment_4_1 ) )
            {
            // InternalPropMod.g:509:1: ( ( rule__Metadata__JavaClassNameAssignment_4_1 ) )
            // InternalPropMod.g:510:2: ( rule__Metadata__JavaClassNameAssignment_4_1 )
            {
             before(grammarAccess.getMetadataAccess().getJavaClassNameAssignment_4_1()); 
            // InternalPropMod.g:511:2: ( rule__Metadata__JavaClassNameAssignment_4_1 )
            // InternalPropMod.g:511:3: rule__Metadata__JavaClassNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__JavaClassNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getJavaClassNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_4__1__Impl"


    // $ANTLR start "rule__Metadata__Group_4__2"
    // InternalPropMod.g:519:1: rule__Metadata__Group_4__2 : rule__Metadata__Group_4__2__Impl ;
    public final void rule__Metadata__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:523:1: ( rule__Metadata__Group_4__2__Impl )
            // InternalPropMod.g:524:2: rule__Metadata__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_4__2"


    // $ANTLR start "rule__Metadata__Group_4__2__Impl"
    // InternalPropMod.g:530:1: rule__Metadata__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Metadata__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:534:1: ( ( ';' ) )
            // InternalPropMod.g:535:1: ( ';' )
            {
            // InternalPropMod.g:535:1: ( ';' )
            // InternalPropMod.g:536:2: ';'
            {
             before(grammarAccess.getMetadataAccess().getSemicolonKeyword_4_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group_4__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalPropMod.g:546:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:550:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalPropMod.g:551:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalPropMod.g:558:1: rule__QualifiedName__Group__0__Impl : ( RULE_VALID_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:562:1: ( ( RULE_VALID_ID ) )
            // InternalPropMod.g:563:1: ( RULE_VALID_ID )
            {
            // InternalPropMod.g:563:1: ( RULE_VALID_ID )
            // InternalPropMod.g:564:2: RULE_VALID_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_0()); 
            match(input,RULE_VALID_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalPropMod.g:573:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:577:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalPropMod.g:578:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalPropMod.g:584:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:588:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalPropMod.g:589:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalPropMod.g:589:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalPropMod.g:590:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalPropMod.g:591:2: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPropMod.g:591:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalPropMod.g:600:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:604:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalPropMod.g:605:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalPropMod.g:612:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:616:1: ( ( '.' ) )
            // InternalPropMod.g:617:1: ( '.' )
            {
            // InternalPropMod.g:617:1: ( '.' )
            // InternalPropMod.g:618:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalPropMod.g:627:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:631:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalPropMod.g:632:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalPropMod.g:638:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_VALID_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:642:1: ( ( RULE_VALID_ID ) )
            // InternalPropMod.g:643:1: ( RULE_VALID_ID )
            {
            // InternalPropMod.g:643:1: ( RULE_VALID_ID )
            // InternalPropMod.g:644:2: RULE_VALID_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_1_1()); 
            match(input,RULE_VALID_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__0"
    // InternalPropMod.g:654:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:658:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // InternalPropMod.g:659:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0"


    // $ANTLR start "rule__PropertyDefinition__Group__0__Impl"
    // InternalPropMod.g:666:1: rule__PropertyDefinition__Group__0__Impl : ( 'property' ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:670:1: ( ( 'property' ) )
            // InternalPropMod.g:671:1: ( 'property' )
            {
            // InternalPropMod.g:671:1: ( 'property' )
            // InternalPropMod.g:672:2: 'property'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__1"
    // InternalPropMod.g:681:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:685:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // InternalPropMod.g:686:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__1"


    // $ANTLR start "rule__PropertyDefinition__Group__1__Impl"
    // InternalPropMod.g:693:1: rule__PropertyDefinition__Group__1__Impl : ( ( rule__PropertyDefinition__TypeAssignment_1 ) ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:697:1: ( ( ( rule__PropertyDefinition__TypeAssignment_1 ) ) )
            // InternalPropMod.g:698:1: ( ( rule__PropertyDefinition__TypeAssignment_1 ) )
            {
            // InternalPropMod.g:698:1: ( ( rule__PropertyDefinition__TypeAssignment_1 ) )
            // InternalPropMod.g:699:2: ( rule__PropertyDefinition__TypeAssignment_1 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_1()); 
            // InternalPropMod.g:700:2: ( rule__PropertyDefinition__TypeAssignment_1 )
            // InternalPropMod.g:700:3: rule__PropertyDefinition__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__2"
    // InternalPropMod.g:708:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:712:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // InternalPropMod.g:713:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__2"


    // $ANTLR start "rule__PropertyDefinition__Group__2__Impl"
    // InternalPropMod.g:720:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__NameAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:724:1: ( ( ( rule__PropertyDefinition__NameAssignment_2 ) ) )
            // InternalPropMod.g:725:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            {
            // InternalPropMod.g:725:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            // InternalPropMod.g:726:2: ( rule__PropertyDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            // InternalPropMod.g:727:2: ( rule__PropertyDefinition__NameAssignment_2 )
            // InternalPropMod.g:727:3: rule__PropertyDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__3"
    // InternalPropMod.g:735:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:739:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // InternalPropMod.g:740:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__3"


    // $ANTLR start "rule__PropertyDefinition__Group__3__Impl"
    // InternalPropMod.g:747:1: rule__PropertyDefinition__Group__3__Impl : ( ( rule__PropertyDefinition__NotNullAssignment_3 )? ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:751:1: ( ( ( rule__PropertyDefinition__NotNullAssignment_3 )? ) )
            // InternalPropMod.g:752:1: ( ( rule__PropertyDefinition__NotNullAssignment_3 )? )
            {
            // InternalPropMod.g:752:1: ( ( rule__PropertyDefinition__NotNullAssignment_3 )? )
            // InternalPropMod.g:753:2: ( rule__PropertyDefinition__NotNullAssignment_3 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNotNullAssignment_3()); 
            // InternalPropMod.g:754:2: ( rule__PropertyDefinition__NotNullAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPropMod.g:754:3: rule__PropertyDefinition__NotNullAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyDefinition__NotNullAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefinitionAccess().getNotNullAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__3__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__4"
    // InternalPropMod.g:762:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:766:1: ( rule__PropertyDefinition__Group__4__Impl )
            // InternalPropMod.g:767:2: rule__PropertyDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__4"


    // $ANTLR start "rule__PropertyDefinition__Group__4__Impl"
    // InternalPropMod.g:773:1: rule__PropertyDefinition__Group__4__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:777:1: ( ( ';' ) )
            // InternalPropMod.g:778:1: ( ';' )
            {
            // InternalPropMod.g:778:1: ( ';' )
            // InternalPropMod.g:779:2: ';'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__4__Impl"


    // $ANTLR start "rule__PropModel__MetaDataAssignment_0"
    // InternalPropMod.g:789:1: rule__PropModel__MetaDataAssignment_0 : ( ruleMetadata ) ;
    public final void rule__PropModel__MetaDataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:793:1: ( ( ruleMetadata ) )
            // InternalPropMod.g:794:2: ( ruleMetadata )
            {
            // InternalPropMod.g:794:2: ( ruleMetadata )
            // InternalPropMod.g:795:3: ruleMetadata
            {
             before(grammarAccess.getPropModelAccess().getMetaDataMetadataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getPropModelAccess().getMetaDataMetadataParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropModel__MetaDataAssignment_0"


    // $ANTLR start "rule__PropModel__PropertiesAssignment_1"
    // InternalPropMod.g:804:1: rule__PropModel__PropertiesAssignment_1 : ( rulePropertyDefinition ) ;
    public final void rule__PropModel__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:808:1: ( ( rulePropertyDefinition ) )
            // InternalPropMod.g:809:2: ( rulePropertyDefinition )
            {
            // InternalPropMod.g:809:2: ( rulePropertyDefinition )
            // InternalPropMod.g:810:3: rulePropertyDefinition
            {
             before(grammarAccess.getPropModelAccess().getPropertiesPropertyDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getPropModelAccess().getPropertiesPropertyDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropModel__PropertiesAssignment_1"


    // $ANTLR start "rule__Metadata__PackageNameAssignment_1"
    // InternalPropMod.g:819:1: rule__Metadata__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Metadata__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:823:1: ( ( ruleQualifiedName ) )
            // InternalPropMod.g:824:2: ( ruleQualifiedName )
            {
            // InternalPropMod.g:824:2: ( ruleQualifiedName )
            // InternalPropMod.g:825:3: ruleQualifiedName
            {
             before(grammarAccess.getMetadataAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMetadataAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__PackageNameAssignment_1"


    // $ANTLR start "rule__Metadata__PrefixAssignment_3_1"
    // InternalPropMod.g:834:1: rule__Metadata__PrefixAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Metadata__PrefixAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:838:1: ( ( RULE_STRING ) )
            // InternalPropMod.g:839:2: ( RULE_STRING )
            {
            // InternalPropMod.g:839:2: ( RULE_STRING )
            // InternalPropMod.g:840:3: RULE_STRING
            {
             before(grammarAccess.getMetadataAccess().getPrefixSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getPrefixSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__PrefixAssignment_3_1"


    // $ANTLR start "rule__Metadata__JavaClassNameAssignment_4_1"
    // InternalPropMod.g:849:1: rule__Metadata__JavaClassNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Metadata__JavaClassNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:853:1: ( ( RULE_STRING ) )
            // InternalPropMod.g:854:2: ( RULE_STRING )
            {
            // InternalPropMod.g:854:2: ( RULE_STRING )
            // InternalPropMod.g:855:3: RULE_STRING
            {
             before(grammarAccess.getMetadataAccess().getJavaClassNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getJavaClassNameSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__JavaClassNameAssignment_4_1"


    // $ANTLR start "rule__PropertyDefinition__TypeAssignment_1"
    // InternalPropMod.g:864:1: rule__PropertyDefinition__TypeAssignment_1 : ( rulePropertyType ) ;
    public final void rule__PropertyDefinition__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:868:1: ( ( rulePropertyType ) )
            // InternalPropMod.g:869:2: ( rulePropertyType )
            {
            // InternalPropMod.g:869:2: ( rulePropertyType )
            // InternalPropMod.g:870:3: rulePropertyType
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__TypeAssignment_1"


    // $ANTLR start "rule__PropertyDefinition__NameAssignment_2"
    // InternalPropMod.g:879:1: rule__PropertyDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PropertyDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:883:1: ( ( ruleQualifiedName ) )
            // InternalPropMod.g:884:2: ( ruleQualifiedName )
            {
            // InternalPropMod.g:884:2: ( ruleQualifiedName )
            // InternalPropMod.g:885:3: ruleQualifiedName
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__NameAssignment_2"


    // $ANTLR start "rule__PropertyDefinition__NotNullAssignment_3"
    // InternalPropMod.g:894:1: rule__PropertyDefinition__NotNullAssignment_3 : ( ( 'not-null' ) ) ;
    public final void rule__PropertyDefinition__NotNullAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPropMod.g:898:1: ( ( ( 'not-null' ) ) )
            // InternalPropMod.g:899:2: ( ( 'not-null' ) )
            {
            // InternalPropMod.g:899:2: ( ( 'not-null' ) )
            // InternalPropMod.g:900:3: ( 'not-null' )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNotNullNotNullKeyword_3_0()); 
            // InternalPropMod.g:901:3: ( 'not-null' )
            // InternalPropMod.g:902:4: 'not-null'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNotNullNotNullKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPropertyDefinitionAccess().getNotNullNotNullKeyword_3_0()); 

            }

             after(grammarAccess.getPropertyDefinitionAccess().getNotNullNotNullKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__NotNullAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000210000L});

}