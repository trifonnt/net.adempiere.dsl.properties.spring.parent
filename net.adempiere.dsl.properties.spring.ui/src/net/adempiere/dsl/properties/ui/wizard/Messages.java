package net.adempiere.dsl.properties.ui.wizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "net.adempiere.dsl.properties.ui.wizard.messages"; //$NON-NLS-1$
	
	public static String HelloWorldProject_Label;
	public static String HelloWorldProject_Description;
	public static String PropModelProject_Label;
	public static String PropModelProject_Description;
	public static String SimplePropModelProject_Label;
	public static String SimplePropModelProject_Description;
	public static String PropModelMavenBuildProject_Label;
	public static String PropModelMavenBuildProject_Description;
	
	static {
	// initialize resource bundle
	NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
