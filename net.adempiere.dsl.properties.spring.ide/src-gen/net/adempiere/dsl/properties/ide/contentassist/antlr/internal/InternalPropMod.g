/*
 * generated by Xtext 2.14.0
 */
grammar InternalPropMod;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package net.adempiere.dsl.properties.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRulePropModel
entryRulePropModel
:
{ before(grammarAccess.getPropModelRule()); }
	 rulePropModel
{ after(grammarAccess.getPropModelRule()); } 
	 EOF 
;

// Rule PropModel
rulePropModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropModelAccess().getGroup()); }
		(rule__PropModel__Group__0)
		{ after(grammarAccess.getPropModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMetadata
entryRuleMetadata
:
{ before(grammarAccess.getMetadataRule()); }
	 ruleMetadata
{ after(grammarAccess.getMetadataRule()); } 
	 EOF 
;

// Rule Metadata
ruleMetadata 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMetadataAccess().getGroup()); }
		(rule__Metadata__Group__0)
		{ after(grammarAccess.getMetadataAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyDefinition
entryRulePropertyDefinition
:
{ before(grammarAccess.getPropertyDefinitionRule()); }
	 rulePropertyDefinition
{ after(grammarAccess.getPropertyDefinitionRule()); } 
	 EOF 
;

// Rule PropertyDefinition
rulePropertyDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getGroup()); }
		(rule__PropertyDefinition__Group__0)
		{ after(grammarAccess.getPropertyDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule PropertyType
rulePropertyType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyTypeAccess().getAlternatives()); }
		(rule__PropertyType__Alternatives)
		{ after(grammarAccess.getPropertyTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyTypeAccess().getSTRINGEnumLiteralDeclaration_0()); }
		('String')
		{ after(grammarAccess.getPropertyTypeAccess().getSTRINGEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyTypeAccess().getINTEnumLiteralDeclaration_1()); }
		('int')
		{ after(grammarAccess.getPropertyTypeAccess().getINTEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); }
		('boolean')
		{ after(grammarAccess.getPropertyTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropModel__Group__0__Impl
	rule__PropModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropModelAccess().getMetaDataAssignment_0()); }
	(rule__PropModel__MetaDataAssignment_0)
	{ after(grammarAccess.getPropModelAccess().getMetaDataAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropModel__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropModelAccess().getPropertiesAssignment_1()); }
	(rule__PropModel__PropertiesAssignment_1)*
	{ after(grammarAccess.getPropModelAccess().getPropertiesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Metadata__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Metadata__Group__0__Impl
	rule__Metadata__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMetadataAccess().getPackageKeyword_0()); }
	'package'
	{ after(grammarAccess.getMetadataAccess().getPackageKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Metadata__Group__1__Impl
	rule__Metadata__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMetadataAccess().getPackageNameAssignment_1()); }
	(rule__Metadata__PackageNameAssignment_1)
	{ after(grammarAccess.getMetadataAccess().getPackageNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Metadata__Group__2__Impl
	rule__Metadata__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMetadataAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getMetadataAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Metadata__Group__3__Impl
	rule__Metadata__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMetadataAccess().getGroup_3()); }
	(rule__Metadata__Group_3__0)?
	{ after(grammarAccess.getMetadataAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Metadata__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMetadataAccess().getGroup_4()); }
	(rule__Metadata__Group_4__0)?
	{ after(grammarAccess.getMetadataAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Metadata__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Metadata__Group_3__0__Impl
	rule__Metadata__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMetadataAccess().getPrefixKeyword_3_0()); }
	'prefix'
	{ after(grammarAccess.getMetadataAccess().getPrefixKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Metadata__Group_3__1__Impl
	rule__Metadata__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMetadataAccess().getPrefixAssignment_3_1()); }
	(rule__Metadata__PrefixAssignment_3_1)
	{ after(grammarAccess.getMetadataAccess().getPrefixAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Metadata__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMetadataAccess().getSemicolonKeyword_3_2()); }
	';'
	{ after(grammarAccess.getMetadataAccess().getSemicolonKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Metadata__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Metadata__Group_4__0__Impl
	rule__Metadata__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMetadataAccess().getJavaClassNameKeyword_4_0()); }
	'java-class-name'
	{ after(grammarAccess.getMetadataAccess().getJavaClassNameKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Metadata__Group_4__1__Impl
	rule__Metadata__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMetadataAccess().getJavaClassNameAssignment_4_1()); }
	(rule__Metadata__JavaClassNameAssignment_4_1)
	{ after(grammarAccess.getMetadataAccess().getJavaClassNameAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Metadata__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMetadataAccess().getSemicolonKeyword_4_2()); }
	';'
	{ after(grammarAccess.getMetadataAccess().getSemicolonKeyword_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_0()); }
	RULE_VALID_ID
	{ after(grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_1_1()); }
	RULE_VALID_ID
	{ after(grammarAccess.getQualifiedNameAccess().getVALID_IDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyDefinition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__0__Impl
	rule__PropertyDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_0()); }
	'property'
	{ after(grammarAccess.getPropertyDefinitionAccess().getPropertyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__1__Impl
	rule__PropertyDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_1()); }
	(rule__PropertyDefinition__TypeAssignment_1)
	{ after(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__2__Impl
	rule__PropertyDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); }
	(rule__PropertyDefinition__NameAssignment_2)
	{ after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__3__Impl
	rule__PropertyDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getNotNullAssignment_3()); }
	(rule__PropertyDefinition__NotNullAssignment_3)?
	{ after(grammarAccess.getPropertyDefinitionAccess().getNotNullAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyDefinition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropModel__MetaDataAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropModelAccess().getMetaDataMetadataParserRuleCall_0_0()); }
		ruleMetadata
		{ after(grammarAccess.getPropModelAccess().getMetaDataMetadataParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropModel__PropertiesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropModelAccess().getPropertiesPropertyDefinitionParserRuleCall_1_0()); }
		rulePropertyDefinition
		{ after(grammarAccess.getPropModelAccess().getPropertiesPropertyDefinitionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__PackageNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMetadataAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getMetadataAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__PrefixAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMetadataAccess().getPrefixSTRINGTerminalRuleCall_3_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getMetadataAccess().getPrefixSTRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Metadata__JavaClassNameAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMetadataAccess().getJavaClassNameSTRINGTerminalRuleCall_4_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getMetadataAccess().getJavaClassNameSTRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_1_0()); }
		rulePropertyType
		{ after(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyDefinition__NotNullAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyDefinitionAccess().getNotNullNotNullKeyword_3_0()); }
		(
			{ before(grammarAccess.getPropertyDefinitionAccess().getNotNullNotNullKeyword_3_0()); }
			'not-null'
			{ after(grammarAccess.getPropertyDefinitionAccess().getNotNullNotNullKeyword_3_0()); }
		)
		{ after(grammarAccess.getPropertyDefinitionAccess().getNotNullNotNullKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_VALID_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')* ('a'..'z'|'A'..'Z'|'_'|'0'..'9');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
