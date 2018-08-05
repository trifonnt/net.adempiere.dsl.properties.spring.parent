/*
 * generated by Xtext 2.14.0
 */
package net.adempiere.dsl.properties.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import net.adempiere.dsl.properties.propMod.PropModel

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PropModGenerator extends AbstractGenerator {

	var PropNode root = new PropNode(null, "ROOT", null, false);

	//@Trifon
//	@Inject
//	extension IQualifiedNameProvider

	val DEFAULT_CLASS_NAME = "ApplicationProperties";
	val DEFAULT_PREFIX = "application";
	val LICENSE_APACHE_V2_TEXT = 
	'''
	/*
	 * Licensed under the Apache License, Version 2.0 (the "License");
	 * you may not use this file except in compliance with the License.
	 * You may obtain a copy of the License at
	 *
	 *    http://www.apache.org/licenses/LICENSE-2.0
	 *
	 * Unless required by applicable law or agreed to in writing, software
	 * distributed under the License is distributed on an "AS IS" BASIS,
	 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	 * See the License for the specific language governing permissions and
	 * limitations under the License.
	 */
	''';
//   
// - https://github.com/trifonnt/camel-idempotent-consumer/blob/master/src/main/java/org/apache/camel/examples/ApplicationProperties.java
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// IMPORTANT: Re-generate Property Node tree on each generation!
		root = new PropNode(null, "ROOT", null, false);

		for (propsModel : resource.allContents.toIterable.filter(PropModel)) {
			var fileName = propsModel?.metaData?.packageName ?: "";
			fileName = fileName +'.'+ (propsModel.metaData.javaClassName ?: DEFAULT_CLASS_NAME);
			fileName = fileName.replaceAll("\\.", "/");
			fsa.generateFile(fileName +'.java', generateJavaClass(propsModel));
		}

		// @Trifon - Write Maven POM file - DO NOT GENERATE IT HERE!!!
		// It must be generated only once when Project is created.
		// - net.adempiere.dsl.properties.spring.ui/src/net/adempiere/dsl/properties/ui/wizard/PropModProjectTemplateProvider.xtend
//		fsa.generateFile('/pom.xml', MAVEN_POM_FILE_CONTENTS);
	}

	def generateJavaClass(PropModel propsModel) {
		buildRootPropertyTree(propsModel);

		'''
		«LICENSE_APACHE_V2_TEXT»
		
		«IF propsModel.metaData.packageName !== null»
		package «propsModel.metaData.packageName»;
		
		«ENDIF»
		import javax.validation.constraints.NotNull;
		import javax.validation.constraints.NotBlank;
		import javax.validation.constraints.NotEmpty;
		
		import org.springframework.boot.context.properties.ConfigurationProperties;
		import org.springframework.context.annotation.Configuration;
		
		/*
		 * Example usage - application.properties
		-----------------------------------------
		«FOR propDef: propsModel.properties»
			«propsModel.metaData.prefix ?: DEFAULT_PREFIX».«propDef.name»=
		«ENDFOR»

		 * Example usage - SomeSpringJavaClass.java
		-------------------------------------------
			@Inject
			private «propsModel.metaData.javaClassName ?: DEFAULT_CLASS_NAME» appProps;
		 */
		@Configuration
		@ConfigurationProperties(prefix = "«propsModel.metaData.prefix ?: DEFAULT_PREFIX»")
		public class «propsModel.metaData.javaClassName ?: DEFAULT_CLASS_NAME» {
		«FOR node: root.childrenAsList»
			«generateJavaField(node)»
		«ENDFOR»
		«FOR node: root.childrenAsList»
			«generateJavaGetterAndSetter(node)»
		«ENDFOR»
		«FOR node: root.childrenAsList»
			«IF node.hasChildren»
				«generateInnerClass(node)»
			«ENDIF»
		«ENDFOR»
		}
		'''
	}

	def generateJavaField(PropNode propNode) {
		if ( propNode.hasChildren ) {
			'''
			
			«IF propNode.notNull»	@NotNull«ENDIF»
				private «propNode.name.toFirstUpper.replaceSpecialCharacters»Configuration «propNode.name.replaceSpecialCharacters»;
			'''
		} else {
			'''
			
			«IF propNode.notNull»	@NotNull«ENDIF»
				private «propNode.type» «propNode.name.replaceSpecialCharacters»;
			'''
		}
	}
	def generateJavaGetterAndSetter(PropNode propNode) {
		if ( propNode.hasChildren ) {
			'''
			
				public «propNode.name.toFirstUpper.replaceSpecialCharacters»Configuration get«propNode.name.toFirstUpper.replaceSpecialCharacters»() {
					return «propNode.name.replaceSpecialCharacters»;
				}
				public void set«propNode.name.toFirstUpper.replaceSpecialCharacters»(«propNode.name.toFirstUpper.replaceSpecialCharacters»Configuration «propNode.name.replaceSpecialCharacters») {
					this.«propNode.name.replaceSpecialCharacters» = «propNode.name.replaceSpecialCharacters»;
				}
			'''
		} else {
			'''
			
				public «propNode.type» get«propNode.name.toFirstUpper.replaceSpecialCharacters»() {
					return «propNode.name.replaceSpecialCharacters»;
				}
				public void set«propNode.name.toFirstUpper.replaceSpecialCharacters»(«propNode.type» «propNode.name.replaceSpecialCharacters») {
					this.«propNode.name.replaceSpecialCharacters» = «propNode.name.replaceSpecialCharacters»;
				}
			'''
		}
	}
	def String generateInnerClass(PropNode propNode) {
		'''
		
			public static class «propNode.name.toFirstUpper»Configuration {
			«FOR node: propNode.childrenAsList»
			«generateJavaField(node)»
			«ENDFOR»
			«FOR node: propNode.childrenAsList»
			«generateJavaGetterAndSetter(node)»
			«ENDFOR»
			«FOR node: propNode.childrenAsList»
				«IF node.hasChildren»
				«generateInnerClass(node)»
				«ENDIF»
			«ENDFOR»
			}
		'''
	}


// Utility methods
	def String replaceSpecialCharacters(String s) {
		if (s === null || s.length() == 0)
			return s;
		var int firstIndex = s.indexOf('-');
		if (firstIndex > -1) {
			if (s.length() == 1) {
				return "_";
			} else {
				return s.substring(0, firstIndex) + s.substring(firstIndex + 1, firstIndex + 2).toUpperCase + s.substring(firstIndex + 2).replaceSpecialCharacters;
			}
		} return s;
	}

	def void buildRootPropertyTree(PropModel propsModel) {
		// Iterate ALL properties
		for (property: propsModel.properties) {
			// @TRIFON - REMOVE
			val String rootName = property.name.extractRootName;
			val childName = property.name.extractChildrenName;
			println(rootName +"."+ childName)

			var PropNode node = null;
			if (root.contains(rootName)) {
				var NodePathDTO nodePathDTO = findProperNodeAndPath(root, property.name);
				node = nodePathDTO.node;
				if (nodePathDTO.path !== null) {
					var PropNode child = buildNode(node, nodePathDTO.path, node.type, property.notNull);
				}
			} else {
				node = buildNode(root, property.name, property.type.literal, property.notNull);
			}
		}
	}
	def NodePathDTO findProperNodeAndPath(PropNode parent, String pathString) {
		// @TRIFON - REMOVE
		println(pathString.extractRootName +"."+ pathString.extractChildrenName)

		var PropNode node = parent.getChildren(pathString.extractRootName);
		if (node !== null) {
			return findProperNodeAndPath(node, pathString.extractChildrenName);
		} else {
			return new NodePathDTO(parent, pathString);
		}
	}
	def PropNode buildNode(PropNode parent, String propName, String propType, boolean notNull) {
		if (propName === null || propName.isEmpty) {
			throw new IllegalArgumentException("Property Name MUST not be null!");
		}

		var PropNode child = null;
		val String rootName = propName.extractRootName
		if (parent.contains(rootName)) {
			child = parent.getChildren(rootName);
		} else {
			child = new PropNode(parent, rootName, propType, notNull);
		}

		val String childrenName = propName.extractChildrenName;
		if (childrenName !== null && childrenName.length > 0) {
			buildNode(child, childrenName, propType, notNull); // Recursive call
		}
		return child;
	}


	// file.prop1.prop11 -> file
	def String extractRootName(String propName) {
		var String result = propName;
		if (propName === null) {
			return null;
		}
		val int firstIndexOfDot = propName.indexOf('.');
		if (firstIndexOfDot > -1) {
			result = propName.substring(0, firstIndexOfDot);
		}
		return result;
	}
	// file.prop1.prop11 -> prop1.prop11
	def String extractChildrenName(String propName) {
		var String result = null;
		if (propName === null) {
			return null
		}
		val int firstIndexOfDot = propName.indexOf('.');
		if (firstIndexOfDot > -1) {
			result = propName.substring(firstIndexOfDot+1);
		}
		return result;
	}
	// file.prop1 -> true
	// file       -> false
	def boolean hasChildren(String propName) {
		var boolean result = false;
		val int firstIndexOfDot = propName.indexOf('.');
		if (firstIndexOfDot > -1) {
			result = true;
		}
		return result;
	}
}
