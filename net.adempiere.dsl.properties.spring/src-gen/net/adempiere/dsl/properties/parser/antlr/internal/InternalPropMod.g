/*
 * generated by Xtext 2.14.0
 */
grammar InternalPropMod;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package net.adempiere.dsl.properties.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePropModel
entryRulePropModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropModelRule()); }
	iv_rulePropModel=rulePropModel
	{ $current=$iv_rulePropModel.current; }
	EOF;

// Rule PropModel
rulePropModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPropModelAccess().getMetaDataMetadataParserRuleCall_0_0());
				}
				lv_metaData_0_0=ruleMetadata
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropModelRule());
					}
					set(
						$current,
						"metaData",
						lv_metaData_0_0,
						"net.adempiere.dsl.properties.PropMod.Metadata");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPropModelAccess().getPropertiesPropertyDefinitionParserRuleCall_1_0());
				}
				lv_properties_1_0=rulePropertyDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropModelRule());
					}
					add(
						$current,
						"properties",
						lv_properties_1_0,
						"net.adempiere.dsl.properties.PropMod.PropertyDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleMetadata
entryRuleMetadata returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMetadataRule()); }
	iv_ruleMetadata=ruleMetadata
	{ $current=$iv_ruleMetadata.current; }
	EOF;

// Rule Metadata
ruleMetadata returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='package'
		{
			newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getPackageKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMetadataAccess().getPackageNameQualifiedNameParserRuleCall_1_0());
				}
				lv_packageName_1_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMetadataRule());
					}
					set(
						$current,
						"packageName",
						lv_packageName_1_0,
						"net.adempiere.dsl.properties.PropMod.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getMetadataAccess().getSemicolonKeyword_2());
		}
		(
			otherlv_3='prefix'
			{
				newLeafNode(otherlv_3, grammarAccess.getMetadataAccess().getPrefixKeyword_3_0());
			}
			(
				(
					lv_prefix_4_0=RULE_STRING
					{
						newLeafNode(lv_prefix_4_0, grammarAccess.getMetadataAccess().getPrefixSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMetadataRule());
						}
						setWithLastConsumed(
							$current,
							"prefix",
							lv_prefix_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getMetadataAccess().getSemicolonKeyword_3_2());
			}
		)?
		(
			otherlv_6='java-class-name'
			{
				newLeafNode(otherlv_6, grammarAccess.getMetadataAccess().getJavaClassNameKeyword_4_0());
			}
			(
				(
					lv_javaClassName_7_0=RULE_STRING
					{
						newLeafNode(lv_javaClassName_7_0, grammarAccess.getMetadataAccess().getJavaClassNameSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMetadataRule());
						}
						setWithLastConsumed(
							$current,
							"javaClassName",
							lv_javaClassName_7_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_8=';'
			{
				newLeafNode(otherlv_8, grammarAccess.getMetadataAccess().getSemicolonKeyword_4_2());
			}
		)?
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_VALID_ID_0=RULE_VALID_ID
		{
			$current.merge(this_VALID_ID_0);
		}
		{
			newLeafNode(this_VALID_ID_0, grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_VALID_ID_2=RULE_VALID_ID
			{
				$current.merge(this_VALID_ID_2);
			}
			{
				newLeafNode(this_VALID_ID_2, grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRulePropertyDefinition
entryRulePropertyDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyDefinitionRule()); }
	iv_rulePropertyDefinition=rulePropertyDefinition
	{ $current=$iv_rulePropertyDefinition.current; }
	EOF;

// Rule PropertyDefinition
rulePropertyDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='property'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=rulePropertyType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"net.adempiere.dsl.properties.PropMod.PropertyType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"net.adempiere.dsl.properties.PropMod.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_notNull_3_0='not-null'
				{
					newLeafNode(lv_notNull_3_0, grammarAccess.getPropertyDefinitionAccess().getNotNullNotNullKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyDefinitionRule());
					}
					setWithLastConsumed($current, "notNull", true, "not-null");
				}
			)
		)?
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_4());
		}
	)
;

// Rule PropertyType
rulePropertyType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='String'
			{
				$current = grammarAccess.getPropertyTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getSTRINGEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='int'
			{
				$current = grammarAccess.getPropertyTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getINTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='boolean'
			{
				$current = grammarAccess.getPropertyTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_VALID_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')* ('a'..'z'|'A'..'Z'|'_'|'0'..'9');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
