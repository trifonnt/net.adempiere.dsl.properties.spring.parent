package net.adempiere.dsl.properties.generator

import org.eclipse.xtext.generator.OutputConfigurationProvider

// @Trifon - change default folder of generated PropMod files!
class PropModOutputConfigurationProvider extends OutputConfigurationProvider {

	public static val GEN_FOLDER = "./src/main/src-gen";

	override getOutputConfigurations() {
		super.getOutputConfigurations() => [
			head.outputDirectory = GEN_FOLDER;
		]
	}
}
