/**
 * generated by Xtext 2.14.0
 */
package net.adempiere.dsl.properties.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.adempiere.dsl.properties.PropModRuntimeModule;
import net.adempiere.dsl.properties.PropModStandaloneSetup;
import net.adempiere.dsl.properties.ide.PropModIdeModule;
import net.adempiere.dsl.properties.web.PropModWebModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class PropModWebSetup extends PropModStandaloneSetup {
  @Override
  public Injector createInjector() {
    PropModRuntimeModule _propModRuntimeModule = new PropModRuntimeModule();
    PropModIdeModule _propModIdeModule = new PropModIdeModule();
    PropModWebModule _propModWebModule = new PropModWebModule();
    return Guice.createInjector(Modules2.mixin(_propModRuntimeModule, _propModIdeModule, _propModWebModule));
  }
}
