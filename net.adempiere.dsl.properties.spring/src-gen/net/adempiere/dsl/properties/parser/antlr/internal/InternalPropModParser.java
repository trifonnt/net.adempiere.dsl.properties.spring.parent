package net.adempiere.dsl.properties.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.adempiere.dsl.properties.services.PropModGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPropModParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_VALID_ID", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'prefix'", "'java-class-name'", "'.'", "'property'", "'not-null'", "'String'", "'int'", "'boolean'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_VALID_ID=5;
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

        public InternalPropModParser(TokenStream input, PropModGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PropModel";
       	}

       	@Override
       	protected PropModGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePropModel"
    // InternalPropMod.g:65:1: entryRulePropModel returns [EObject current=null] : iv_rulePropModel= rulePropModel EOF ;
    public final EObject entryRulePropModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropModel = null;


        try {
            // InternalPropMod.g:65:50: (iv_rulePropModel= rulePropModel EOF )
            // InternalPropMod.g:66:2: iv_rulePropModel= rulePropModel EOF
            {
             newCompositeNode(grammarAccess.getPropModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropModel=rulePropModel();

            state._fsp--;

             current =iv_rulePropModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropModel"


    // $ANTLR start "rulePropModel"
    // InternalPropMod.g:72:1: rulePropModel returns [EObject current=null] : ( ( (lv_metaData_0_0= ruleMetadata ) ) ( (lv_properties_1_0= rulePropertyDefinition ) )* ) ;
    public final EObject rulePropModel() throws RecognitionException {
        EObject current = null;

        EObject lv_metaData_0_0 = null;

        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalPropMod.g:78:2: ( ( ( (lv_metaData_0_0= ruleMetadata ) ) ( (lv_properties_1_0= rulePropertyDefinition ) )* ) )
            // InternalPropMod.g:79:2: ( ( (lv_metaData_0_0= ruleMetadata ) ) ( (lv_properties_1_0= rulePropertyDefinition ) )* )
            {
            // InternalPropMod.g:79:2: ( ( (lv_metaData_0_0= ruleMetadata ) ) ( (lv_properties_1_0= rulePropertyDefinition ) )* )
            // InternalPropMod.g:80:3: ( (lv_metaData_0_0= ruleMetadata ) ) ( (lv_properties_1_0= rulePropertyDefinition ) )*
            {
            // InternalPropMod.g:80:3: ( (lv_metaData_0_0= ruleMetadata ) )
            // InternalPropMod.g:81:4: (lv_metaData_0_0= ruleMetadata )
            {
            // InternalPropMod.g:81:4: (lv_metaData_0_0= ruleMetadata )
            // InternalPropMod.g:82:5: lv_metaData_0_0= ruleMetadata
            {

            					newCompositeNode(grammarAccess.getPropModelAccess().getMetaDataMetadataParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_metaData_0_0=ruleMetadata();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropModelRule());
            					}
            					set(
            						current,
            						"metaData",
            						lv_metaData_0_0,
            						"net.adempiere.dsl.properties.PropMod.Metadata");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPropMod.g:99:3: ( (lv_properties_1_0= rulePropertyDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPropMod.g:100:4: (lv_properties_1_0= rulePropertyDefinition )
            	    {
            	    // InternalPropMod.g:100:4: (lv_properties_1_0= rulePropertyDefinition )
            	    // InternalPropMod.g:101:5: lv_properties_1_0= rulePropertyDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getPropModelAccess().getPropertiesPropertyDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_properties_1_0=rulePropertyDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_1_0,
            	    						"net.adempiere.dsl.properties.PropMod.PropertyDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropModel"


    // $ANTLR start "entryRuleMetadata"
    // InternalPropMod.g:122:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // InternalPropMod.g:122:49: (iv_ruleMetadata= ruleMetadata EOF )
            // InternalPropMod.g:123:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalPropMod.g:129:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'java-class-name' ( (lv_javaClassName_7_0= RULE_STRING ) ) otherlv_8= ';' )? ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_prefix_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_javaClassName_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;



        	enterRule();

        try {
            // InternalPropMod.g:135:2: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'java-class-name' ( (lv_javaClassName_7_0= RULE_STRING ) ) otherlv_8= ';' )? ) )
            // InternalPropMod.g:136:2: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'java-class-name' ( (lv_javaClassName_7_0= RULE_STRING ) ) otherlv_8= ';' )? )
            {
            // InternalPropMod.g:136:2: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'java-class-name' ( (lv_javaClassName_7_0= RULE_STRING ) ) otherlv_8= ';' )? )
            // InternalPropMod.g:137:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) otherlv_2= ';' (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'java-class-name' ( (lv_javaClassName_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getPackageKeyword_0());
            		
            // InternalPropMod.g:141:3: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // InternalPropMod.g:142:4: (lv_packageName_1_0= ruleQualifiedName )
            {
            // InternalPropMod.g:142:4: (lv_packageName_1_0= ruleQualifiedName )
            // InternalPropMod.g:143:5: lv_packageName_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getMetadataAccess().getPackageNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetadataRule());
            					}
            					set(
            						current,
            						"packageName",
            						lv_packageName_1_0,
            						"net.adempiere.dsl.properties.PropMod.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMetadataAccess().getSemicolonKeyword_2());
            		
            // InternalPropMod.g:164:3: (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPropMod.g:165:4: otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getMetadataAccess().getPrefixKeyword_3_0());
                    			
                    // InternalPropMod.g:169:4: ( (lv_prefix_4_0= RULE_STRING ) )
                    // InternalPropMod.g:170:5: (lv_prefix_4_0= RULE_STRING )
                    {
                    // InternalPropMod.g:170:5: (lv_prefix_4_0= RULE_STRING )
                    // InternalPropMod.g:171:6: lv_prefix_4_0= RULE_STRING
                    {
                    lv_prefix_4_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_prefix_4_0, grammarAccess.getMetadataAccess().getPrefixSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetadataRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"prefix",
                    							lv_prefix_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getMetadataAccess().getSemicolonKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalPropMod.g:192:3: (otherlv_6= 'java-class-name' ( (lv_javaClassName_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPropMod.g:193:4: otherlv_6= 'java-class-name' ( (lv_javaClassName_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getMetadataAccess().getJavaClassNameKeyword_4_0());
                    			
                    // InternalPropMod.g:197:4: ( (lv_javaClassName_7_0= RULE_STRING ) )
                    // InternalPropMod.g:198:5: (lv_javaClassName_7_0= RULE_STRING )
                    {
                    // InternalPropMod.g:198:5: (lv_javaClassName_7_0= RULE_STRING )
                    // InternalPropMod.g:199:6: lv_javaClassName_7_0= RULE_STRING
                    {
                    lv_javaClassName_7_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_javaClassName_7_0, grammarAccess.getMetadataAccess().getJavaClassNameSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetadataRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"javaClassName",
                    							lv_javaClassName_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getMetadataAccess().getSemicolonKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalPropMod.g:224:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalPropMod.g:224:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalPropMod.g:225:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalPropMod.g:231:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VALID_ID_0= RULE_VALID_ID (kw= '.' this_VALID_ID_2= RULE_VALID_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VALID_ID_0=null;
        Token kw=null;
        Token this_VALID_ID_2=null;


        	enterRule();

        try {
            // InternalPropMod.g:237:2: ( (this_VALID_ID_0= RULE_VALID_ID (kw= '.' this_VALID_ID_2= RULE_VALID_ID )* ) )
            // InternalPropMod.g:238:2: (this_VALID_ID_0= RULE_VALID_ID (kw= '.' this_VALID_ID_2= RULE_VALID_ID )* )
            {
            // InternalPropMod.g:238:2: (this_VALID_ID_0= RULE_VALID_ID (kw= '.' this_VALID_ID_2= RULE_VALID_ID )* )
            // InternalPropMod.g:239:3: this_VALID_ID_0= RULE_VALID_ID (kw= '.' this_VALID_ID_2= RULE_VALID_ID )*
            {
            this_VALID_ID_0=(Token)match(input,RULE_VALID_ID,FOLLOW_9); 

            			current.merge(this_VALID_ID_0);
            		

            			newLeafNode(this_VALID_ID_0, grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_0());
            		
            // InternalPropMod.g:246:3: (kw= '.' this_VALID_ID_2= RULE_VALID_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPropMod.g:247:4: kw= '.' this_VALID_ID_2= RULE_VALID_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_VALID_ID_2=(Token)match(input,RULE_VALID_ID,FOLLOW_9); 

            	    				current.merge(this_VALID_ID_2);
            	    			

            	    				newLeafNode(this_VALID_ID_2, grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRulePropertyDefinition"
    // InternalPropMod.g:264:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalPropMod.g:264:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalPropMod.g:265:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // InternalPropMod.g:271:1: rulePropertyDefinition returns [EObject current=null] : (otherlv_0= 'property' ( (lv_type_1_0= rulePropertyType ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_notNull_3_0= 'not-null' ) )? otherlv_4= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_notNull_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalPropMod.g:277:2: ( (otherlv_0= 'property' ( (lv_type_1_0= rulePropertyType ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_notNull_3_0= 'not-null' ) )? otherlv_4= ';' ) )
            // InternalPropMod.g:278:2: (otherlv_0= 'property' ( (lv_type_1_0= rulePropertyType ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_notNull_3_0= 'not-null' ) )? otherlv_4= ';' )
            {
            // InternalPropMod.g:278:2: (otherlv_0= 'property' ( (lv_type_1_0= rulePropertyType ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_notNull_3_0= 'not-null' ) )? otherlv_4= ';' )
            // InternalPropMod.g:279:3: otherlv_0= 'property' ( (lv_type_1_0= rulePropertyType ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_notNull_3_0= 'not-null' ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_0());
            		
            // InternalPropMod.g:283:3: ( (lv_type_1_0= rulePropertyType ) )
            // InternalPropMod.g:284:4: (lv_type_1_0= rulePropertyType )
            {
            // InternalPropMod.g:284:4: (lv_type_1_0= rulePropertyType )
            // InternalPropMod.g:285:5: lv_type_1_0= rulePropertyType
            {

            					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_1_0=rulePropertyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"net.adempiere.dsl.properties.PropMod.PropertyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPropMod.g:302:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalPropMod.g:303:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalPropMod.g:303:4: (lv_name_2_0= ruleQualifiedName )
            // InternalPropMod.g:304:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"net.adempiere.dsl.properties.PropMod.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPropMod.g:321:3: ( (lv_notNull_3_0= 'not-null' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPropMod.g:322:4: (lv_notNull_3_0= 'not-null' )
                    {
                    // InternalPropMod.g:322:4: (lv_notNull_3_0= 'not-null' )
                    // InternalPropMod.g:323:5: lv_notNull_3_0= 'not-null'
                    {
                    lv_notNull_3_0=(Token)match(input,18,FOLLOW_5); 

                    					newLeafNode(lv_notNull_3_0, grammarAccess.getPropertyDefinitionAccess().getNotNullNotNullKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "notNull", true, "not-null");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "rulePropertyType"
    // InternalPropMod.g:343:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) ) ;
    public final Enumerator rulePropertyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPropMod.g:349:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) ) )
            // InternalPropMod.g:350:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) )
            {
            // InternalPropMod.g:350:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPropMod.g:351:3: (enumLiteral_0= 'String' )
                    {
                    // InternalPropMod.g:351:3: (enumLiteral_0= 'String' )
                    // InternalPropMod.g:352:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPropMod.g:359:3: (enumLiteral_1= 'int' )
                    {
                    // InternalPropMod.g:359:3: (enumLiteral_1= 'int' )
                    // InternalPropMod.g:360:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPropMod.g:367:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalPropMod.g:367:3: (enumLiteral_2= 'boolean' )
                    // InternalPropMod.g:368:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getPropertyTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});

}