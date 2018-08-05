/**
 * generated by Xtext 2.14.0
 */
package net.adempiere.dsl.properties.ui.wizard;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
import org.eclipse.xtext.ui.wizard.template.AbstractProjectTemplate;
import org.eclipse.xtext.ui.wizard.template.BooleanTemplateVariable;
import org.eclipse.xtext.ui.wizard.template.GroupTemplateVariable;
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator;
import org.eclipse.xtext.ui.wizard.template.ProjectTemplate;
import org.eclipse.xtext.ui.wizard.template.StringSelectionTemplateVariable;
import org.eclipse.xtext.ui.wizard.template.StringTemplateVariable;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@ProjectTemplate(label = "Properties Model with Maven build", icon = "project_template.png", description = "<p><b>Properties Model with Maven build</b></p>\n<p>This is a parameterized hello world for PropMod. You can set a parameter to modify the content in the generated file\nand a parameter to set the package the file is created in.</p>")
@SuppressWarnings("all")
public final class PropModelMavenBuildProject extends AbstractProjectTemplate {
  private final String MAVEN_POM_FILE_CONTENTS = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
      _builder.newLine();
      _builder.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<modelVersion>4.0.0</modelVersion>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<groupId>com.example</groupId>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<artifactId>demo</artifactId>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<version>0.0.1-SNAPSHOT</version>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<packaging>jar</packaging>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<name>demo</name>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<description>Demo project for Spring Boot</description>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<parent>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<groupId>org.springframework.boot</groupId>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<artifactId>spring-boot-starter-parent</artifactId>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<version>2.0.4.RELEASE</version>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<relativePath/> <!-- lookup parent from repository -->");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</parent>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<properties>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<java.version>1.8</java.version>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</properties>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<dependencies>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<dependency>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<groupId>org.springframework.boot</groupId>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<artifactId>spring-boot-starter</artifactId>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</dependency>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<dependency>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<groupId>javax.validation</groupId>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<artifactId>validation-api</artifactId>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<!--version>2.0.1.Final</version-->");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</dependency>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<dependency>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<groupId>javax.inject</groupId>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<artifactId>javax.inject</artifactId>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<version>1</version>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</dependency>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<dependency>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<groupId>org.springframework.boot</groupId>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<artifactId>spring-boot-starter-test</artifactId>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<scope>test</scope>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</dependency>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</dependencies>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<build>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<plugins>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<plugin>");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("<groupId>org.springframework.boot</groupId>");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("<artifactId>spring-boot-maven-plugin</artifactId>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("</plugin>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</plugins>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</build>");
      _builder.newLine();
      _builder.append("</project>");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  private final BooleanTemplateVariable advancedCheckBox = this.check("Advanced:", false);
  
  private final GroupTemplateVariable advancedGroup = this.group("Properties");
  
  private final StringSelectionTemplateVariable name = this.combo("Name:", new String[] { "Xtext", "World", "Foo", "Bar" }, "The name to say \'Hello\' to", this.advancedGroup);
  
  private final StringTemplateVariable path = this.text("Package:", "mydsl", "The package path to place the files in", this.advancedGroup);
  
  @Override
  protected void updateVariables() {
    this.name.setEnabled(this.advancedCheckBox.getValue());
    this.path.setEnabled(this.advancedCheckBox.getValue());
    boolean _value = this.advancedCheckBox.getValue();
    boolean _not = (!_value);
    if (_not) {
      this.name.setValue("Xtext");
      this.path.setValue("propsModel");
    }
  }
  
  @Override
  protected IStatus validate() {
    Status _xifexpression = null;
    boolean _matches = this.path.getValue().matches("[a-z][a-z0-9_]*(/[a-z][a-z0-9_]*)*");
    if (_matches) {
      _xifexpression = null;
    } else {
      _xifexpression = new Status(IStatus.ERROR, "Wizard", (("\'" + this.path) + "\' is not a valid package name"));
    }
    return _xifexpression;
  }
  
  @Override
  public void generateProjects(final IProjectGenerator generator) {
    PluginProjectFactory _pluginProjectFactory = new PluginProjectFactory();
    final Procedure1<PluginProjectFactory> _function = (PluginProjectFactory it) -> {
      it.setProjectName(this.getProjectInfo().getProjectName());
      it.setLocation(this.getProjectInfo().getLocationPath());
      List<String> _projectNatures = it.getProjectNatures();
      Iterables.<String>addAll(_projectNatures, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID, "org.eclipse.m2e.core.maven2Nature")));
      List<String> _builderIds = it.getBuilderIds();
      Iterables.<String>addAll(_builderIds, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID, "org.eclipse.m2e.core.maven2Builder")));
      List<String> _folders = it.getFolders();
      Iterables.<String>addAll(_folders, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("src/main/java", "src/main/resources", "src/test/java", "src/test/resources", "src-gen")));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/pom.xml");
      this.addFile(it, _builder, this.MAVEN_POM_FILE_CONTENTS);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("src/main/model-properties/MainProperties.propsModel");
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("/*");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("* This is an example Properties Model");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("* name = ");
      _builder_2.append(this.name, " ");
      _builder_2.append(";");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("*/");
      _builder_2.newLine();
      _builder_2.append("package net.adempiere.example;");
      _builder_2.newLine();
      this.addFile(it, _builder_1, _builder_2);
    };
    PluginProjectFactory _doubleArrow = ObjectExtensions.<PluginProjectFactory>operator_doubleArrow(_pluginProjectFactory, _function);
    generator.generate(_doubleArrow);
  }
}
