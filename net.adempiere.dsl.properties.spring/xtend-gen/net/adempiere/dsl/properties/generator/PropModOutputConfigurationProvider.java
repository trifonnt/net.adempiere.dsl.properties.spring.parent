package net.adempiere.dsl.properties.generator;

import java.util.Set;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class PropModOutputConfigurationProvider extends OutputConfigurationProvider {
  public final static String GEN_FOLDER = "./src-gen";
  
  @Override
  public Set<OutputConfiguration> getOutputConfigurations() {
    Set<OutputConfiguration> _outputConfigurations = super.getOutputConfigurations();
    final Procedure1<Set<OutputConfiguration>> _function = (Set<OutputConfiguration> it) -> {
      OutputConfiguration _head = IterableExtensions.<OutputConfiguration>head(it);
      _head.setOutputDirectory(PropModOutputConfigurationProvider.GEN_FOLDER);
    };
    return ObjectExtensions.<Set<OutputConfiguration>>operator_doubleArrow(_outputConfigurations, _function);
  }
}
