/**
 * generated by Xtext 2.14.0
 */
package net.adempiere.dsl.properties.generator;

import com.google.common.collect.Iterables;
import java.util.List;
import net.adempiere.dsl.properties.generator.NodePathDTO;
import net.adempiere.dsl.properties.generator.PropNode;
import net.adempiere.dsl.properties.propMod.Metadata;
import net.adempiere.dsl.properties.propMod.PropModel;
import net.adempiere.dsl.properties.propMod.PropertyDefinition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PropModGenerator extends AbstractGenerator {
  private PropNode root = new PropNode(null, "ROOT", null, false);
  
  private final String DEFAULT_CLASS_NAME = "ApplicationProperties";
  
  private final String DEFAULT_PREFIX = "application";
  
  private final String LICENSE_APACHE_V2_TEXT = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Licensed under the Apache License, Version 2.0 (the \"License\");");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* you may not use this file except in compliance with the License.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* You may obtain a copy of the License at");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*    http://www.apache.org/licenses/LICENSE-2.0");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Unless required by applicable law or agreed to in writing, software");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* distributed under the License is distributed on an \"AS IS\" BASIS,");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* See the License for the specific language governing permissions and");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* limitations under the License.");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    PropNode _propNode = new PropNode(null, "ROOT", null, false);
    this.root = _propNode;
    Iterable<PropModel> _filter = Iterables.<PropModel>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), PropModel.class);
    for (final PropModel propsModel : _filter) {
      {
        String _elvis = null;
        Metadata _metaData = null;
        if (propsModel!=null) {
          _metaData=propsModel.getMetaData();
        }
        String _packageName = null;
        if (_metaData!=null) {
          _packageName=_metaData.getPackageName();
        }
        if (_packageName != null) {
          _elvis = _packageName;
        } else {
          _elvis = "";
        }
        String fileName = _elvis;
        String _elvis_1 = null;
        String _javaClassName = propsModel.getMetaData().getJavaClassName();
        if (_javaClassName != null) {
          _elvis_1 = _javaClassName;
        } else {
          _elvis_1 = this.DEFAULT_CLASS_NAME;
        }
        String _plus = ((fileName + ".") + _elvis_1);
        fileName = _plus;
        fileName = fileName.replaceAll("\\.", "/");
        fsa.generateFile((fileName + ".java"), this.generateJavaClass(propsModel));
      }
    }
  }
  
  public CharSequence generateJavaClass(final PropModel propsModel) {
    CharSequence _xblockexpression = null;
    {
      this.buildRootPropertyTree(propsModel);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.LICENSE_APACHE_V2_TEXT);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        String _packageName = propsModel.getMetaData().getPackageName();
        boolean _tripleNotEquals = (_packageName != null);
        if (_tripleNotEquals) {
          _builder.append("package ");
          String _packageName_1 = propsModel.getMetaData().getPackageName();
          _builder.append(_packageName_1);
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
        }
      }
      _builder.append("import javax.validation.constraints.NotNull;");
      _builder.newLine();
      _builder.append("import javax.validation.constraints.NotBlank;");
      _builder.newLine();
      _builder.append("import javax.validation.constraints.NotEmpty;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import org.springframework.boot.context.properties.ConfigurationProperties;");
      _builder.newLine();
      _builder.append("import org.springframework.context.annotation.Configuration;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Example usage - application.properties");
      _builder.newLine();
      _builder.append("-----------------------------------------");
      _builder.newLine();
      {
        EList<PropertyDefinition> _properties = propsModel.getProperties();
        for(final PropertyDefinition propDef : _properties) {
          String _elvis = null;
          String _prefix = propsModel.getMetaData().getPrefix();
          if (_prefix != null) {
            _elvis = _prefix;
          } else {
            _elvis = this.DEFAULT_PREFIX;
          }
          _builder.append(_elvis);
          _builder.append(".");
          String _name = propDef.getName();
          _builder.append(_name);
          _builder.append("=");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Example usage - SomeSpringJavaClass.java");
      _builder.newLine();
      _builder.append("-------------------------------------------");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Inject");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private ");
      String _elvis_1 = null;
      String _javaClassName = propsModel.getMetaData().getJavaClassName();
      if (_javaClassName != null) {
        _elvis_1 = _javaClassName;
      } else {
        _elvis_1 = this.DEFAULT_CLASS_NAME;
      }
      _builder.append(_elvis_1, "\t");
      _builder.append(" appProps;");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("@Configuration");
      _builder.newLine();
      _builder.append("@ConfigurationProperties(prefix = \"");
      String _elvis_2 = null;
      String _prefix_1 = propsModel.getMetaData().getPrefix();
      if (_prefix_1 != null) {
        _elvis_2 = _prefix_1;
      } else {
        _elvis_2 = this.DEFAULT_PREFIX;
      }
      _builder.append(_elvis_2);
      _builder.append("\")");
      _builder.newLineIfNotEmpty();
      _builder.append("public class ");
      String _elvis_3 = null;
      String _javaClassName_1 = propsModel.getMetaData().getJavaClassName();
      if (_javaClassName_1 != null) {
        _elvis_3 = _javaClassName_1;
      } else {
        _elvis_3 = this.DEFAULT_CLASS_NAME;
      }
      _builder.append(_elvis_3);
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      {
        List<PropNode> _childrenAsList = this.root.getChildrenAsList();
        for(final PropNode node : _childrenAsList) {
          CharSequence _generateJavaField = this.generateJavaField(node);
          _builder.append(_generateJavaField);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        List<PropNode> _childrenAsList_1 = this.root.getChildrenAsList();
        for(final PropNode node_1 : _childrenAsList_1) {
          CharSequence _generateJavaGetterAndSetter = this.generateJavaGetterAndSetter(node_1);
          _builder.append(_generateJavaGetterAndSetter);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        List<PropNode> _childrenAsList_2 = this.root.getChildrenAsList();
        for(final PropNode node_2 : _childrenAsList_2) {
          {
            boolean _hasChildren = node_2.hasChildren();
            if (_hasChildren) {
              String _generateInnerClass = this.generateInnerClass(node_2);
              _builder.append(_generateInnerClass);
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateJavaField(final PropNode propNode) {
    CharSequence _xifexpression = null;
    boolean _hasChildren = propNode.hasChildren();
    if (_hasChildren) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        boolean _isNotNull = propNode.isNotNull();
        if (_isNotNull) {
          _builder.append("\t@NotNull");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("private ");
      String _replaceSpecialCharacters = this.replaceSpecialCharacters(StringExtensions.toFirstUpper(propNode.getName()));
      _builder.append(_replaceSpecialCharacters, "\t");
      _builder.append("Configuration ");
      String _replaceSpecialCharacters_1 = this.replaceSpecialCharacters(propNode.getName());
      _builder.append(_replaceSpecialCharacters_1, "\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.newLine();
      {
        boolean _isNotNull_1 = propNode.isNotNull();
        if (_isNotNull_1) {
          _builder_1.append("\t@NotNull");
        }
      }
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("private ");
      String _type = propNode.getType();
      _builder_1.append(_type, "\t");
      _builder_1.append(" ");
      String _replaceSpecialCharacters_2 = this.replaceSpecialCharacters(propNode.getName());
      _builder_1.append(_replaceSpecialCharacters_2, "\t");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence generateJavaGetterAndSetter(final PropNode propNode) {
    CharSequence _xifexpression = null;
    boolean _hasChildren = propNode.hasChildren();
    if (_hasChildren) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public ");
      String _replaceSpecialCharacters = this.replaceSpecialCharacters(StringExtensions.toFirstUpper(propNode.getName()));
      _builder.append(_replaceSpecialCharacters, "\t");
      _builder.append("Configuration get");
      String _replaceSpecialCharacters_1 = this.replaceSpecialCharacters(StringExtensions.toFirstUpper(propNode.getName()));
      _builder.append(_replaceSpecialCharacters_1, "\t");
      _builder.append("() {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("return ");
      String _replaceSpecialCharacters_2 = this.replaceSpecialCharacters(propNode.getName());
      _builder.append(_replaceSpecialCharacters_2, "\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void set");
      String _replaceSpecialCharacters_3 = this.replaceSpecialCharacters(StringExtensions.toFirstUpper(propNode.getName()));
      _builder.append(_replaceSpecialCharacters_3, "\t");
      _builder.append("(");
      String _replaceSpecialCharacters_4 = this.replaceSpecialCharacters(StringExtensions.toFirstUpper(propNode.getName()));
      _builder.append(_replaceSpecialCharacters_4, "\t");
      _builder.append("Configuration ");
      String _replaceSpecialCharacters_5 = this.replaceSpecialCharacters(propNode.getName());
      _builder.append(_replaceSpecialCharacters_5, "\t");
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("this.");
      String _replaceSpecialCharacters_6 = this.replaceSpecialCharacters(propNode.getName());
      _builder.append(_replaceSpecialCharacters_6, "\t\t");
      _builder.append(" = ");
      String _replaceSpecialCharacters_7 = this.replaceSpecialCharacters(propNode.getName());
      _builder.append(_replaceSpecialCharacters_7, "\t\t");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public ");
      String _type = propNode.getType();
      _builder_1.append(_type, "\t");
      _builder_1.append(" get");
      String _replaceSpecialCharacters_8 = this.replaceSpecialCharacters(StringExtensions.toFirstUpper(propNode.getName()));
      _builder_1.append(_replaceSpecialCharacters_8, "\t");
      _builder_1.append("() {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t");
      _builder_1.append("return ");
      String _replaceSpecialCharacters_9 = this.replaceSpecialCharacters(propNode.getName());
      _builder_1.append(_replaceSpecialCharacters_9, "\t\t");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void set");
      String _replaceSpecialCharacters_10 = this.replaceSpecialCharacters(StringExtensions.toFirstUpper(propNode.getName()));
      _builder_1.append(_replaceSpecialCharacters_10, "\t");
      _builder_1.append("(");
      String _type_1 = propNode.getType();
      _builder_1.append(_type_1, "\t");
      _builder_1.append(" ");
      String _replaceSpecialCharacters_11 = this.replaceSpecialCharacters(propNode.getName());
      _builder_1.append(_replaceSpecialCharacters_11, "\t");
      _builder_1.append(") {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t");
      _builder_1.append("this.");
      String _replaceSpecialCharacters_12 = this.replaceSpecialCharacters(propNode.getName());
      _builder_1.append(_replaceSpecialCharacters_12, "\t\t");
      _builder_1.append(" = ");
      String _replaceSpecialCharacters_13 = this.replaceSpecialCharacters(propNode.getName());
      _builder_1.append(_replaceSpecialCharacters_13, "\t\t");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public String generateInnerClass(final PropNode propNode) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static class ");
    String _firstUpper = StringExtensions.toFirstUpper(propNode.getName());
    _builder.append(_firstUpper, "\t");
    _builder.append("Configuration {");
    _builder.newLineIfNotEmpty();
    {
      List<PropNode> _childrenAsList = propNode.getChildrenAsList();
      for(final PropNode node : _childrenAsList) {
        _builder.append("\t");
        CharSequence _generateJavaField = this.generateJavaField(node);
        _builder.append(_generateJavaField, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<PropNode> _childrenAsList_1 = propNode.getChildrenAsList();
      for(final PropNode node_1 : _childrenAsList_1) {
        _builder.append("\t");
        CharSequence _generateJavaGetterAndSetter = this.generateJavaGetterAndSetter(node_1);
        _builder.append(_generateJavaGetterAndSetter, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<PropNode> _childrenAsList_2 = propNode.getChildrenAsList();
      for(final PropNode node_2 : _childrenAsList_2) {
        {
          boolean _hasChildren = node_2.hasChildren();
          if (_hasChildren) {
            _builder.append("\t");
            String _generateInnerClass = this.generateInnerClass(node_2);
            _builder.append(_generateInnerClass, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String replaceSpecialCharacters(final String s) {
    if (((s == null) || (s.length() == 0))) {
      return s;
    }
    int firstIndex = s.indexOf("-");
    if ((firstIndex > (-1))) {
      int _length = s.length();
      boolean _equals = (_length == 1);
      if (_equals) {
        return "_";
      } else {
        String _substring = s.substring(0, firstIndex);
        String _upperCase = s.substring((firstIndex + 1), (firstIndex + 2)).toUpperCase();
        String _plus = (_substring + _upperCase);
        String _replaceSpecialCharacters = this.replaceSpecialCharacters(s.substring((firstIndex + 2)));
        return (_plus + _replaceSpecialCharacters);
      }
    }
    return s;
  }
  
  public void buildRootPropertyTree(final PropModel propsModel) {
    EList<PropertyDefinition> _properties = propsModel.getProperties();
    for (final PropertyDefinition property : _properties) {
      {
        final String rootName = this.extractRootName(property.getName());
        final String childName = this.extractChildrenName(property.getName());
        InputOutput.<String>println(((rootName + ".") + childName));
        PropNode node = null;
        boolean _contains = this.root.contains(rootName);
        if (_contains) {
          NodePathDTO nodePathDTO = this.findProperNodeAndPath(this.root, property.getName());
          node = nodePathDTO.getNode();
          String _path = nodePathDTO.getPath();
          boolean _tripleNotEquals = (_path != null);
          if (_tripleNotEquals) {
            PropNode child = this.buildNode(node, nodePathDTO.getPath(), node.getType(), property.isNotNull());
          }
        } else {
          node = this.buildNode(this.root, property.getName(), property.getType().getLiteral(), property.isNotNull());
        }
      }
    }
  }
  
  public NodePathDTO findProperNodeAndPath(final PropNode parent, final String pathString) {
    String _extractRootName = this.extractRootName(pathString);
    String _plus = (_extractRootName + ".");
    String _extractChildrenName = this.extractChildrenName(pathString);
    String _plus_1 = (_plus + _extractChildrenName);
    InputOutput.<String>println(_plus_1);
    PropNode node = parent.getChildren(this.extractRootName(pathString));
    if ((node != null)) {
      return this.findProperNodeAndPath(node, this.extractChildrenName(pathString));
    } else {
      return new NodePathDTO(parent, pathString);
    }
  }
  
  public PropNode buildNode(final PropNode parent, final String propName, final String propType, final boolean notNull) {
    if (((propName == null) || propName.isEmpty())) {
      throw new IllegalArgumentException("Property Name MUST not be null!");
    }
    PropNode child = null;
    final String rootName = this.extractRootName(propName);
    boolean _contains = parent.contains(rootName);
    if (_contains) {
      child = parent.getChildren(rootName);
    } else {
      PropNode _propNode = new PropNode(parent, rootName, propType, notNull);
      child = _propNode;
    }
    final String childrenName = this.extractChildrenName(propName);
    if (((childrenName != null) && (childrenName.length() > 0))) {
      this.buildNode(child, childrenName, propType, notNull);
    }
    return child;
  }
  
  public String extractRootName(final String propName) {
    String result = propName;
    if ((propName == null)) {
      return null;
    }
    final int firstIndexOfDot = propName.indexOf(".");
    if ((firstIndexOfDot > (-1))) {
      result = propName.substring(0, firstIndexOfDot);
    }
    return result;
  }
  
  public String extractChildrenName(final String propName) {
    String result = null;
    if ((propName == null)) {
      return null;
    }
    final int firstIndexOfDot = propName.indexOf(".");
    if ((firstIndexOfDot > (-1))) {
      result = propName.substring((firstIndexOfDot + 1));
    }
    return result;
  }
  
  public boolean hasChildren(final String propName) {
    boolean result = false;
    final int firstIndexOfDot = propName.indexOf(".");
    if ((firstIndexOfDot > (-1))) {
      result = true;
    }
    return result;
  }
}
